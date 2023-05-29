package com.rivers.streams.service;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Properties;

import org.apache.avro.specific.SpecificRecord;
import com.rivers.streams.utils.StreamsUtils;


import com.rivers.streams.model.Balance;
import com.rivers.streams.model.Customer;
import com.rivers.streams.model.CustomerBalance;

import io.confluent.developer.joins.ApplianceOrder;
import io.confluent.developer.joins.ElectronicOrder;
import io.confluent.developer.joins.solution.CombinedOrder;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.JoinWindows;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.StreamJoined;
import org.apache.kafka.streams.kstream.ValueJoiner;

public class StreamsJoin {
	
	static <T extends SpecificRecord> SpecificAvroSerde<T> getSpecificAvroSerde(final Map<String, Object> serdeConfig) {
        final SpecificAvroSerde<T> specificAvroSerde = new SpecificAvroSerde<>();
        specificAvroSerde.configure(serdeConfig, false);
        return specificAvroSerde;
    }
	
	public static void main(String[] args) throws IOException {
		final Properties streamsProps = StreamsUtils.loadProperties();
		streamsProps.put(StreamsConfig.APPLICATION_ID_CONFIG, "joining streams");
		
		StreamsBuilder builder = new StreamsBuilder();
		final String streamOneInput = streamsProps.getProperty("stream.one.input.topic");
		final String streamTwoInput = streamsProps.getProperty("stream.two.input.topic");
		final String outputTopic = streamsProps.getProperty("joins.output.topic");
		
		Map<String, Object> configMap = StreamsUtils.propertiesToMap(streamsProps);
		
		SpecificAvroSerde<Customer> customerSerde = getSpecificAvroSerde(configMap);
		SpecificAvroSerde<Balance> balanceSerde = getSpecificAvroSerde(configMap);
		SpecificAvroSerde<CustomerBalance> customerBalanceSerde = getSpecificAvroSerde(configMap);
		
		ValueJoiner<Customer, Balance, CustomerBalance> customerBalanceJoiner =
                (customer, balance) -> CustomerBalance.newBuilder()
                        .setAccountId(customer.getAccountId())
                        .setCustomerId(customer.getCustomerId())
                        .setPhoneNumber(customer.getPhoneNumber())
                        .setBalance(balance.getBalance())
                        .build();


        KStream<String, Customer> customerStream =
                builder.stream(streamOneInput, Consumed.with(Serdes.String(), customerSerde))
                        .peek((key, value) -> System.out.println("Customer stream incoming record key " + key + " value " + value));

        KStream<String, Balance> balanceStream =
                builder.stream(streamTwoInput, Consumed.with(Serdes.String(), balanceSerde))
                        .peek((key, value) -> System.out.println("Balance stream incoming record " + key + " value " + value));
				
        KStream<String, CustomerBalance> combinedStream =
                customerStream.join(
                                balanceStream,
                                customerBalanceJoiner,
                                JoinWindows.of(Duration.ofMinutes(30)),
                                StreamJoined.with(Serdes.String(), customerSerde, balanceSerde))
                        .peek((key, value) -> System.out.println("Stream-Stream Join record key " + key + " value " + value));
		
	}

}

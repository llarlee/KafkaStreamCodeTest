/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rivers.streams.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CustomerBalance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6105792694743289156L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerBalance\",\"namespace\":\"com.rivers.streams.model\",\"fields\":[{\"name\":\"accountId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"customerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"phoneNumber\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"balance\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CustomerBalance> ENCODER =
      new BinaryMessageEncoder<CustomerBalance>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomerBalance> DECODER =
      new BinaryMessageDecoder<CustomerBalance>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CustomerBalance> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CustomerBalance> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CustomerBalance> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomerBalance>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CustomerBalance to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CustomerBalance from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CustomerBalance instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CustomerBalance fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence accountId;
  private java.lang.CharSequence customerId;
  private java.lang.CharSequence phoneNumber;
  private float balance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerBalance() {}

  /**
   * All-args constructor.
   * @param accountId The new value for accountId
   * @param customerId The new value for customerId
   * @param phoneNumber The new value for phoneNumber
   * @param balance The new value for balance
   */
  public CustomerBalance(java.lang.CharSequence accountId, java.lang.CharSequence customerId, java.lang.CharSequence phoneNumber, java.lang.Float balance) {
    this.accountId = accountId;
    this.customerId = customerId;
    this.phoneNumber = phoneNumber;
    this.balance = balance;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accountId;
    case 1: return customerId;
    case 2: return phoneNumber;
    case 3: return balance;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accountId = (java.lang.CharSequence)value$; break;
    case 1: customerId = (java.lang.CharSequence)value$; break;
    case 2: phoneNumber = (java.lang.CharSequence)value$; break;
    case 3: balance = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'accountId' field.
   * @return The value of the 'accountId' field.
   */
  public java.lang.CharSequence getAccountId() {
    return accountId;
  }


  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.CharSequence value) {
    this.accountId = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public java.lang.CharSequence getCustomerId() {
    return customerId;
  }


  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.CharSequence value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'phoneNumber' field.
   * @return The value of the 'phoneNumber' field.
   */
  public java.lang.CharSequence getPhoneNumber() {
    return phoneNumber;
  }


  /**
   * Sets the value of the 'phoneNumber' field.
   * @param value the value to set.
   */
  public void setPhoneNumber(java.lang.CharSequence value) {
    this.phoneNumber = value;
  }

  /**
   * Gets the value of the 'balance' field.
   * @return The value of the 'balance' field.
   */
  public float getBalance() {
    return balance;
  }


  /**
   * Sets the value of the 'balance' field.
   * @param value the value to set.
   */
  public void setBalance(float value) {
    this.balance = value;
  }

  /**
   * Creates a new CustomerBalance RecordBuilder.
   * @return A new CustomerBalance RecordBuilder
   */
  public static com.rivers.streams.model.CustomerBalance.Builder newBuilder() {
    return new com.rivers.streams.model.CustomerBalance.Builder();
  }

  /**
   * Creates a new CustomerBalance RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerBalance RecordBuilder
   */
  public static com.rivers.streams.model.CustomerBalance.Builder newBuilder(com.rivers.streams.model.CustomerBalance.Builder other) {
    if (other == null) {
      return new com.rivers.streams.model.CustomerBalance.Builder();
    } else {
      return new com.rivers.streams.model.CustomerBalance.Builder(other);
    }
  }

  /**
   * Creates a new CustomerBalance RecordBuilder by copying an existing CustomerBalance instance.
   * @param other The existing instance to copy.
   * @return A new CustomerBalance RecordBuilder
   */
  public static com.rivers.streams.model.CustomerBalance.Builder newBuilder(com.rivers.streams.model.CustomerBalance other) {
    if (other == null) {
      return new com.rivers.streams.model.CustomerBalance.Builder();
    } else {
      return new com.rivers.streams.model.CustomerBalance.Builder(other);
    }
  }

  /**
   * RecordBuilder for CustomerBalance instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerBalance>
    implements org.apache.avro.data.RecordBuilder<CustomerBalance> {

    private java.lang.CharSequence accountId;
    private java.lang.CharSequence customerId;
    private java.lang.CharSequence phoneNumber;
    private float balance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rivers.streams.model.CustomerBalance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[2].schema(), other.phoneNumber);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.balance)) {
        this.balance = data().deepCopy(fields()[3].schema(), other.balance);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerBalance instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rivers.streams.model.CustomerBalance other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[2].schema(), other.phoneNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.balance)) {
        this.balance = data().deepCopy(fields()[3].schema(), other.balance);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'accountId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountId() {
      return accountId;
    }


    /**
      * Sets the value of the 'accountId' field.
      * @param value The value of 'accountId'.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.accountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'accountId' field has been set.
      * @return True if the 'accountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'accountId' field.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder clearAccountId() {
      accountId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder setCustomerId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.customerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder clearCustomerId() {
      customerId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'phoneNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getPhoneNumber() {
      return phoneNumber;
    }


    /**
      * Sets the value of the 'phoneNumber' field.
      * @param value The value of 'phoneNumber'.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder setPhoneNumber(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.phoneNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'phoneNumber' field has been set.
      * @return True if the 'phoneNumber' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'phoneNumber' field.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder clearPhoneNumber() {
      phoneNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'balance' field.
      * @return The value.
      */
    public float getBalance() {
      return balance;
    }


    /**
      * Sets the value of the 'balance' field.
      * @param value The value of 'balance'.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder setBalance(float value) {
      validate(fields()[3], value);
      this.balance = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'balance' field has been set.
      * @return True if the 'balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'balance' field.
      * @return This builder.
      */
    public com.rivers.streams.model.CustomerBalance.Builder clearBalance() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomerBalance build() {
      try {
        CustomerBalance record = new CustomerBalance();
        record.accountId = fieldSetFlags()[0] ? this.accountId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.customerId = fieldSetFlags()[1] ? this.customerId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.phoneNumber = fieldSetFlags()[2] ? this.phoneNumber : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.balance = fieldSetFlags()[3] ? this.balance : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomerBalance>
    WRITER$ = (org.apache.avro.io.DatumWriter<CustomerBalance>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomerBalance>
    READER$ = (org.apache.avro.io.DatumReader<CustomerBalance>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.accountId);

    out.writeString(this.customerId);

    out.writeString(this.phoneNumber);

    out.writeFloat(this.balance);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);

      this.customerId = in.readString(this.customerId instanceof Utf8 ? (Utf8)this.customerId : null);

      this.phoneNumber = in.readString(this.phoneNumber instanceof Utf8 ? (Utf8)this.phoneNumber : null);

      this.balance = in.readFloat();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);
          break;

        case 1:
          this.customerId = in.readString(this.customerId instanceof Utf8 ? (Utf8)this.customerId : null);
          break;

        case 2:
          this.phoneNumber = in.readString(this.phoneNumber instanceof Utf8 ? (Utf8)this.phoneNumber : null);
          break;

        case 3:
          this.balance = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











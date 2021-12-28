/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mbusa.avro.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CmpgnCtryVehTypDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2373252935055413979L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CmpgnCtryVehTypDTO\",\"namespace\":\"com.mbusa.avro.dto\",\"fields\":[{\"name\":\"CDE_CTRY_ABRV\",\"type\":\"string\"},{\"name\":\"CDE_VEH_CTRY\",\"type\":\"string\"},{\"name\":\"CDE_VEH_TYP\",\"type\":\"string\"},{\"name\":\"DES_VEH_TYP\",\"type\":\"string\"},{\"name\":\"DTS_CREA\",\"type\":\"string\"},{\"name\":\"ID_CREA_USER\",\"type\":\"string\"},{\"name\":\"DTS_LAST_UPDT\",\"type\":\"string\"},{\"name\":\"ID_LAST_UPDT_USER\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CmpgnCtryVehTypDTO> ENCODER =
      new BinaryMessageEncoder<CmpgnCtryVehTypDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CmpgnCtryVehTypDTO> DECODER =
      new BinaryMessageDecoder<CmpgnCtryVehTypDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CmpgnCtryVehTypDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CmpgnCtryVehTypDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CmpgnCtryVehTypDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CmpgnCtryVehTypDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CmpgnCtryVehTypDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CmpgnCtryVehTypDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CmpgnCtryVehTypDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CmpgnCtryVehTypDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence CDE_CTRY_ABRV;
   private java.lang.CharSequence CDE_VEH_CTRY;
   private java.lang.CharSequence CDE_VEH_TYP;
   private java.lang.CharSequence DES_VEH_TYP;
   private java.lang.CharSequence DTS_CREA;
   private java.lang.CharSequence ID_CREA_USER;
   private java.lang.CharSequence DTS_LAST_UPDT;
   private java.lang.CharSequence ID_LAST_UPDT_USER;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CmpgnCtryVehTypDTO() {}

  /**
   * All-args constructor.
   * @param CDE_CTRY_ABRV The new value for CDE_CTRY_ABRV
   * @param CDE_VEH_CTRY The new value for CDE_VEH_CTRY
   * @param CDE_VEH_TYP The new value for CDE_VEH_TYP
   * @param DES_VEH_TYP The new value for DES_VEH_TYP
   * @param DTS_CREA The new value for DTS_CREA
   * @param ID_CREA_USER The new value for ID_CREA_USER
   * @param DTS_LAST_UPDT The new value for DTS_LAST_UPDT
   * @param ID_LAST_UPDT_USER The new value for ID_LAST_UPDT_USER
   */
  public CmpgnCtryVehTypDTO(java.lang.CharSequence CDE_CTRY_ABRV, java.lang.CharSequence CDE_VEH_CTRY, java.lang.CharSequence CDE_VEH_TYP, java.lang.CharSequence DES_VEH_TYP, java.lang.CharSequence DTS_CREA, java.lang.CharSequence ID_CREA_USER, java.lang.CharSequence DTS_LAST_UPDT, java.lang.CharSequence ID_LAST_UPDT_USER) {
    this.CDE_CTRY_ABRV = CDE_CTRY_ABRV;
    this.CDE_VEH_CTRY = CDE_VEH_CTRY;
    this.CDE_VEH_TYP = CDE_VEH_TYP;
    this.DES_VEH_TYP = DES_VEH_TYP;
    this.DTS_CREA = DTS_CREA;
    this.ID_CREA_USER = ID_CREA_USER;
    this.DTS_LAST_UPDT = DTS_LAST_UPDT;
    this.ID_LAST_UPDT_USER = ID_LAST_UPDT_USER;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CDE_CTRY_ABRV;
    case 1: return CDE_VEH_CTRY;
    case 2: return CDE_VEH_TYP;
    case 3: return DES_VEH_TYP;
    case 4: return DTS_CREA;
    case 5: return ID_CREA_USER;
    case 6: return DTS_LAST_UPDT;
    case 7: return ID_LAST_UPDT_USER;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CDE_CTRY_ABRV = (java.lang.CharSequence)value$; break;
    case 1: CDE_VEH_CTRY = (java.lang.CharSequence)value$; break;
    case 2: CDE_VEH_TYP = (java.lang.CharSequence)value$; break;
    case 3: DES_VEH_TYP = (java.lang.CharSequence)value$; break;
    case 4: DTS_CREA = (java.lang.CharSequence)value$; break;
    case 5: ID_CREA_USER = (java.lang.CharSequence)value$; break;
    case 6: DTS_LAST_UPDT = (java.lang.CharSequence)value$; break;
    case 7: ID_LAST_UPDT_USER = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'CDE_CTRY_ABRV' field.
   * @return The value of the 'CDE_CTRY_ABRV' field.
   */
  public java.lang.CharSequence getCDECTRYABRV() {
    return CDE_CTRY_ABRV;
  }


  /**
   * Sets the value of the 'CDE_CTRY_ABRV' field.
   * @param value the value to set.
   */
  public void setCDECTRYABRV(java.lang.CharSequence value) {
    this.CDE_CTRY_ABRV = value;
  }

  /**
   * Gets the value of the 'CDE_VEH_CTRY' field.
   * @return The value of the 'CDE_VEH_CTRY' field.
   */
  public java.lang.CharSequence getCDEVEHCTRY() {
    return CDE_VEH_CTRY;
  }


  /**
   * Sets the value of the 'CDE_VEH_CTRY' field.
   * @param value the value to set.
   */
  public void setCDEVEHCTRY(java.lang.CharSequence value) {
    this.CDE_VEH_CTRY = value;
  }

  /**
   * Gets the value of the 'CDE_VEH_TYP' field.
   * @return The value of the 'CDE_VEH_TYP' field.
   */
  public java.lang.CharSequence getCDEVEHTYP() {
    return CDE_VEH_TYP;
  }


  /**
   * Sets the value of the 'CDE_VEH_TYP' field.
   * @param value the value to set.
   */
  public void setCDEVEHTYP(java.lang.CharSequence value) {
    this.CDE_VEH_TYP = value;
  }

  /**
   * Gets the value of the 'DES_VEH_TYP' field.
   * @return The value of the 'DES_VEH_TYP' field.
   */
  public java.lang.CharSequence getDESVEHTYP() {
    return DES_VEH_TYP;
  }


  /**
   * Sets the value of the 'DES_VEH_TYP' field.
   * @param value the value to set.
   */
  public void setDESVEHTYP(java.lang.CharSequence value) {
    this.DES_VEH_TYP = value;
  }

  /**
   * Gets the value of the 'DTS_CREA' field.
   * @return The value of the 'DTS_CREA' field.
   */
  public java.lang.CharSequence getDTSCREA() {
    return DTS_CREA;
  }


  /**
   * Sets the value of the 'DTS_CREA' field.
   * @param value the value to set.
   */
  public void setDTSCREA(java.lang.CharSequence value) {
    this.DTS_CREA = value;
  }

  /**
   * Gets the value of the 'ID_CREA_USER' field.
   * @return The value of the 'ID_CREA_USER' field.
   */
  public java.lang.CharSequence getIDCREAUSER() {
    return ID_CREA_USER;
  }


  /**
   * Sets the value of the 'ID_CREA_USER' field.
   * @param value the value to set.
   */
  public void setIDCREAUSER(java.lang.CharSequence value) {
    this.ID_CREA_USER = value;
  }

  /**
   * Gets the value of the 'DTS_LAST_UPDT' field.
   * @return The value of the 'DTS_LAST_UPDT' field.
   */
  public java.lang.CharSequence getDTSLASTUPDT() {
    return DTS_LAST_UPDT;
  }


  /**
   * Sets the value of the 'DTS_LAST_UPDT' field.
   * @param value the value to set.
   */
  public void setDTSLASTUPDT(java.lang.CharSequence value) {
    this.DTS_LAST_UPDT = value;
  }

  /**
   * Gets the value of the 'ID_LAST_UPDT_USER' field.
   * @return The value of the 'ID_LAST_UPDT_USER' field.
   */
  public java.lang.CharSequence getIDLASTUPDTUSER() {
    return ID_LAST_UPDT_USER;
  }


  /**
   * Sets the value of the 'ID_LAST_UPDT_USER' field.
   * @param value the value to set.
   */
  public void setIDLASTUPDTUSER(java.lang.CharSequence value) {
    this.ID_LAST_UPDT_USER = value;
  }

  /**
   * Creates a new CmpgnCtryVehTypDTO RecordBuilder.
   * @return A new CmpgnCtryVehTypDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder newBuilder() {
    return new com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder();
  }

  /**
   * Creates a new CmpgnCtryVehTypDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CmpgnCtryVehTypDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder newBuilder(com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder other) {
    if (other == null) {
      return new com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder();
    } else {
      return new com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder(other);
    }
  }

  /**
   * Creates a new CmpgnCtryVehTypDTO RecordBuilder by copying an existing CmpgnCtryVehTypDTO instance.
   * @param other The existing instance to copy.
   * @return A new CmpgnCtryVehTypDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder newBuilder(com.mbusa.avro.dto.CmpgnCtryVehTypDTO other) {
    if (other == null) {
      return new com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder();
    } else {
      return new com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for CmpgnCtryVehTypDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CmpgnCtryVehTypDTO>
    implements org.apache.avro.data.RecordBuilder<CmpgnCtryVehTypDTO> {

    private java.lang.CharSequence CDE_CTRY_ABRV;
    private java.lang.CharSequence CDE_VEH_CTRY;
    private java.lang.CharSequence CDE_VEH_TYP;
    private java.lang.CharSequence DES_VEH_TYP;
    private java.lang.CharSequence DTS_CREA;
    private java.lang.CharSequence ID_CREA_USER;
    private java.lang.CharSequence DTS_LAST_UPDT;
    private java.lang.CharSequence ID_LAST_UPDT_USER;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CDE_CTRY_ABRV)) {
        this.CDE_CTRY_ABRV = data().deepCopy(fields()[0].schema(), other.CDE_CTRY_ABRV);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.CDE_VEH_CTRY)) {
        this.CDE_VEH_CTRY = data().deepCopy(fields()[1].schema(), other.CDE_VEH_CTRY);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.CDE_VEH_TYP)) {
        this.CDE_VEH_TYP = data().deepCopy(fields()[2].schema(), other.CDE_VEH_TYP);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.DES_VEH_TYP)) {
        this.DES_VEH_TYP = data().deepCopy(fields()[3].schema(), other.DES_VEH_TYP);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.DTS_CREA)) {
        this.DTS_CREA = data().deepCopy(fields()[4].schema(), other.DTS_CREA);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.ID_CREA_USER)) {
        this.ID_CREA_USER = data().deepCopy(fields()[5].schema(), other.ID_CREA_USER);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.DTS_LAST_UPDT)) {
        this.DTS_LAST_UPDT = data().deepCopy(fields()[6].schema(), other.DTS_LAST_UPDT);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.ID_LAST_UPDT_USER)) {
        this.ID_LAST_UPDT_USER = data().deepCopy(fields()[7].schema(), other.ID_LAST_UPDT_USER);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing CmpgnCtryVehTypDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mbusa.avro.dto.CmpgnCtryVehTypDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CDE_CTRY_ABRV)) {
        this.CDE_CTRY_ABRV = data().deepCopy(fields()[0].schema(), other.CDE_CTRY_ABRV);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CDE_VEH_CTRY)) {
        this.CDE_VEH_CTRY = data().deepCopy(fields()[1].schema(), other.CDE_VEH_CTRY);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CDE_VEH_TYP)) {
        this.CDE_VEH_TYP = data().deepCopy(fields()[2].schema(), other.CDE_VEH_TYP);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.DES_VEH_TYP)) {
        this.DES_VEH_TYP = data().deepCopy(fields()[3].schema(), other.DES_VEH_TYP);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DTS_CREA)) {
        this.DTS_CREA = data().deepCopy(fields()[4].schema(), other.DTS_CREA);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ID_CREA_USER)) {
        this.ID_CREA_USER = data().deepCopy(fields()[5].schema(), other.ID_CREA_USER);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.DTS_LAST_UPDT)) {
        this.DTS_LAST_UPDT = data().deepCopy(fields()[6].schema(), other.DTS_LAST_UPDT);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ID_LAST_UPDT_USER)) {
        this.ID_LAST_UPDT_USER = data().deepCopy(fields()[7].schema(), other.ID_LAST_UPDT_USER);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'CDE_CTRY_ABRV' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDECTRYABRV() {
      return CDE_CTRY_ABRV;
    }


    /**
      * Sets the value of the 'CDE_CTRY_ABRV' field.
      * @param value The value of 'CDE_CTRY_ABRV'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setCDECTRYABRV(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CDE_CTRY_ABRV = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_CTRY_ABRV' field has been set.
      * @return True if the 'CDE_CTRY_ABRV' field has been set, false otherwise.
      */
    public boolean hasCDECTRYABRV() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CDE_CTRY_ABRV' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearCDECTRYABRV() {
      CDE_CTRY_ABRV = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'CDE_VEH_CTRY' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDEVEHCTRY() {
      return CDE_VEH_CTRY;
    }


    /**
      * Sets the value of the 'CDE_VEH_CTRY' field.
      * @param value The value of 'CDE_VEH_CTRY'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setCDEVEHCTRY(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.CDE_VEH_CTRY = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_VEH_CTRY' field has been set.
      * @return True if the 'CDE_VEH_CTRY' field has been set, false otherwise.
      */
    public boolean hasCDEVEHCTRY() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'CDE_VEH_CTRY' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearCDEVEHCTRY() {
      CDE_VEH_CTRY = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'CDE_VEH_TYP' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDEVEHTYP() {
      return CDE_VEH_TYP;
    }


    /**
      * Sets the value of the 'CDE_VEH_TYP' field.
      * @param value The value of 'CDE_VEH_TYP'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setCDEVEHTYP(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.CDE_VEH_TYP = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_VEH_TYP' field has been set.
      * @return True if the 'CDE_VEH_TYP' field has been set, false otherwise.
      */
    public boolean hasCDEVEHTYP() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'CDE_VEH_TYP' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearCDEVEHTYP() {
      CDE_VEH_TYP = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'DES_VEH_TYP' field.
      * @return The value.
      */
    public java.lang.CharSequence getDESVEHTYP() {
      return DES_VEH_TYP;
    }


    /**
      * Sets the value of the 'DES_VEH_TYP' field.
      * @param value The value of 'DES_VEH_TYP'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setDESVEHTYP(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.DES_VEH_TYP = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'DES_VEH_TYP' field has been set.
      * @return True if the 'DES_VEH_TYP' field has been set, false otherwise.
      */
    public boolean hasDESVEHTYP() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'DES_VEH_TYP' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearDESVEHTYP() {
      DES_VEH_TYP = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'DTS_CREA' field.
      * @return The value.
      */
    public java.lang.CharSequence getDTSCREA() {
      return DTS_CREA;
    }


    /**
      * Sets the value of the 'DTS_CREA' field.
      * @param value The value of 'DTS_CREA'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setDTSCREA(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.DTS_CREA = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'DTS_CREA' field has been set.
      * @return True if the 'DTS_CREA' field has been set, false otherwise.
      */
    public boolean hasDTSCREA() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'DTS_CREA' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearDTSCREA() {
      DTS_CREA = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ID_CREA_USER' field.
      * @return The value.
      */
    public java.lang.CharSequence getIDCREAUSER() {
      return ID_CREA_USER;
    }


    /**
      * Sets the value of the 'ID_CREA_USER' field.
      * @param value The value of 'ID_CREA_USER'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setIDCREAUSER(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.ID_CREA_USER = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ID_CREA_USER' field has been set.
      * @return True if the 'ID_CREA_USER' field has been set, false otherwise.
      */
    public boolean hasIDCREAUSER() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ID_CREA_USER' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearIDCREAUSER() {
      ID_CREA_USER = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'DTS_LAST_UPDT' field.
      * @return The value.
      */
    public java.lang.CharSequence getDTSLASTUPDT() {
      return DTS_LAST_UPDT;
    }


    /**
      * Sets the value of the 'DTS_LAST_UPDT' field.
      * @param value The value of 'DTS_LAST_UPDT'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setDTSLASTUPDT(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.DTS_LAST_UPDT = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'DTS_LAST_UPDT' field has been set.
      * @return True if the 'DTS_LAST_UPDT' field has been set, false otherwise.
      */
    public boolean hasDTSLASTUPDT() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'DTS_LAST_UPDT' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearDTSLASTUPDT() {
      DTS_LAST_UPDT = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'ID_LAST_UPDT_USER' field.
      * @return The value.
      */
    public java.lang.CharSequence getIDLASTUPDTUSER() {
      return ID_LAST_UPDT_USER;
    }


    /**
      * Sets the value of the 'ID_LAST_UPDT_USER' field.
      * @param value The value of 'ID_LAST_UPDT_USER'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder setIDLASTUPDTUSER(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.ID_LAST_UPDT_USER = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'ID_LAST_UPDT_USER' field has been set.
      * @return True if the 'ID_LAST_UPDT_USER' field has been set, false otherwise.
      */
    public boolean hasIDLASTUPDTUSER() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'ID_LAST_UPDT_USER' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.CmpgnCtryVehTypDTO.Builder clearIDLASTUPDTUSER() {
      ID_LAST_UPDT_USER = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CmpgnCtryVehTypDTO build() {
      try {
        CmpgnCtryVehTypDTO record = new CmpgnCtryVehTypDTO();
        record.CDE_CTRY_ABRV = fieldSetFlags()[0] ? this.CDE_CTRY_ABRV : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.CDE_VEH_CTRY = fieldSetFlags()[1] ? this.CDE_VEH_CTRY : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.CDE_VEH_TYP = fieldSetFlags()[2] ? this.CDE_VEH_TYP : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.DES_VEH_TYP = fieldSetFlags()[3] ? this.DES_VEH_TYP : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.DTS_CREA = fieldSetFlags()[4] ? this.DTS_CREA : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.ID_CREA_USER = fieldSetFlags()[5] ? this.ID_CREA_USER : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.DTS_LAST_UPDT = fieldSetFlags()[6] ? this.DTS_LAST_UPDT : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.ID_LAST_UPDT_USER = fieldSetFlags()[7] ? this.ID_LAST_UPDT_USER : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CmpgnCtryVehTypDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<CmpgnCtryVehTypDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CmpgnCtryVehTypDTO>
    READER$ = (org.apache.avro.io.DatumReader<CmpgnCtryVehTypDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.CDE_CTRY_ABRV);

    out.writeString(this.CDE_VEH_CTRY);

    out.writeString(this.CDE_VEH_TYP);

    out.writeString(this.DES_VEH_TYP);

    out.writeString(this.DTS_CREA);

    out.writeString(this.ID_CREA_USER);

    out.writeString(this.DTS_LAST_UPDT);

    out.writeString(this.ID_LAST_UPDT_USER);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.CDE_CTRY_ABRV = in.readString(this.CDE_CTRY_ABRV instanceof Utf8 ? (Utf8)this.CDE_CTRY_ABRV : null);

      this.CDE_VEH_CTRY = in.readString(this.CDE_VEH_CTRY instanceof Utf8 ? (Utf8)this.CDE_VEH_CTRY : null);

      this.CDE_VEH_TYP = in.readString(this.CDE_VEH_TYP instanceof Utf8 ? (Utf8)this.CDE_VEH_TYP : null);

      this.DES_VEH_TYP = in.readString(this.DES_VEH_TYP instanceof Utf8 ? (Utf8)this.DES_VEH_TYP : null);

      this.DTS_CREA = in.readString(this.DTS_CREA instanceof Utf8 ? (Utf8)this.DTS_CREA : null);

      this.ID_CREA_USER = in.readString(this.ID_CREA_USER instanceof Utf8 ? (Utf8)this.ID_CREA_USER : null);

      this.DTS_LAST_UPDT = in.readString(this.DTS_LAST_UPDT instanceof Utf8 ? (Utf8)this.DTS_LAST_UPDT : null);

      this.ID_LAST_UPDT_USER = in.readString(this.ID_LAST_UPDT_USER instanceof Utf8 ? (Utf8)this.ID_LAST_UPDT_USER : null);

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.CDE_CTRY_ABRV = in.readString(this.CDE_CTRY_ABRV instanceof Utf8 ? (Utf8)this.CDE_CTRY_ABRV : null);
          break;

        case 1:
          this.CDE_VEH_CTRY = in.readString(this.CDE_VEH_CTRY instanceof Utf8 ? (Utf8)this.CDE_VEH_CTRY : null);
          break;

        case 2:
          this.CDE_VEH_TYP = in.readString(this.CDE_VEH_TYP instanceof Utf8 ? (Utf8)this.CDE_VEH_TYP : null);
          break;

        case 3:
          this.DES_VEH_TYP = in.readString(this.DES_VEH_TYP instanceof Utf8 ? (Utf8)this.DES_VEH_TYP : null);
          break;

        case 4:
          this.DTS_CREA = in.readString(this.DTS_CREA instanceof Utf8 ? (Utf8)this.DTS_CREA : null);
          break;

        case 5:
          this.ID_CREA_USER = in.readString(this.ID_CREA_USER instanceof Utf8 ? (Utf8)this.ID_CREA_USER : null);
          break;

        case 6:
          this.DTS_LAST_UPDT = in.readString(this.DTS_LAST_UPDT instanceof Utf8 ? (Utf8)this.DTS_LAST_UPDT : null);
          break;

        case 7:
          this.ID_LAST_UPDT_USER = in.readString(this.ID_LAST_UPDT_USER instanceof Utf8 ? (Utf8)this.ID_LAST_UPDT_USER : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











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
public class TktCmpgnVehCustStatDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5683353597106269745L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TktCmpgnVehCustStatDTO\",\"namespace\":\"com.mbusa.avro.dto\",\"fields\":[{\"name\":\"CDE_CNTRY\",\"type\":\"string\"},{\"name\":\"ID_FIN\",\"type\":\"string\"},{\"name\":\"CDE_CMPGN_VEH_CUST_STAT\",\"type\":\"string\"},{\"name\":\"CDE_DLR\",\"type\":\"string\"},{\"name\":\"NAM_FTS_DC\",\"type\":\"string\"},{\"name\":\"NAM_LAST\",\"type\":\"string\"},{\"name\":\"NUM_TEL\",\"type\":\"string\"},{\"name\":\"DTS_CREA\",\"type\":\"string\"},{\"name\":\"ID_CREA_USER\",\"type\":\"string\"},{\"name\":\"DTS_LAST_UPDT\",\"type\":\"string\"},{\"name\":\"ID_LAST_UPDT_USER\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TktCmpgnVehCustStatDTO> ENCODER =
      new BinaryMessageEncoder<TktCmpgnVehCustStatDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TktCmpgnVehCustStatDTO> DECODER =
      new BinaryMessageDecoder<TktCmpgnVehCustStatDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TktCmpgnVehCustStatDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TktCmpgnVehCustStatDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TktCmpgnVehCustStatDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TktCmpgnVehCustStatDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TktCmpgnVehCustStatDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TktCmpgnVehCustStatDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TktCmpgnVehCustStatDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TktCmpgnVehCustStatDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence CDE_CNTRY;
   private java.lang.CharSequence ID_FIN;
   private java.lang.CharSequence CDE_CMPGN_VEH_CUST_STAT;
   private java.lang.CharSequence CDE_DLR;
   private java.lang.CharSequence NAM_FTS_DC;
   private java.lang.CharSequence NAM_LAST;
   private java.lang.CharSequence NUM_TEL;
   private java.lang.CharSequence DTS_CREA;
   private java.lang.CharSequence ID_CREA_USER;
   private java.lang.CharSequence DTS_LAST_UPDT;
   private java.lang.CharSequence ID_LAST_UPDT_USER;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TktCmpgnVehCustStatDTO() {}

  /**
   * All-args constructor.
   * @param CDE_CNTRY The new value for CDE_CNTRY
   * @param ID_FIN The new value for ID_FIN
   * @param CDE_CMPGN_VEH_CUST_STAT The new value for CDE_CMPGN_VEH_CUST_STAT
   * @param CDE_DLR The new value for CDE_DLR
   * @param NAM_FTS_DC The new value for NAM_FTS_DC
   * @param NAM_LAST The new value for NAM_LAST
   * @param NUM_TEL The new value for NUM_TEL
   * @param DTS_CREA The new value for DTS_CREA
   * @param ID_CREA_USER The new value for ID_CREA_USER
   * @param DTS_LAST_UPDT The new value for DTS_LAST_UPDT
   * @param ID_LAST_UPDT_USER The new value for ID_LAST_UPDT_USER
   */
  public TktCmpgnVehCustStatDTO(java.lang.CharSequence CDE_CNTRY, java.lang.CharSequence ID_FIN, java.lang.CharSequence CDE_CMPGN_VEH_CUST_STAT, java.lang.CharSequence CDE_DLR, java.lang.CharSequence NAM_FTS_DC, java.lang.CharSequence NAM_LAST, java.lang.CharSequence NUM_TEL, java.lang.CharSequence DTS_CREA, java.lang.CharSequence ID_CREA_USER, java.lang.CharSequence DTS_LAST_UPDT, java.lang.CharSequence ID_LAST_UPDT_USER) {
    this.CDE_CNTRY = CDE_CNTRY;
    this.ID_FIN = ID_FIN;
    this.CDE_CMPGN_VEH_CUST_STAT = CDE_CMPGN_VEH_CUST_STAT;
    this.CDE_DLR = CDE_DLR;
    this.NAM_FTS_DC = NAM_FTS_DC;
    this.NAM_LAST = NAM_LAST;
    this.NUM_TEL = NUM_TEL;
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
    case 0: return CDE_CNTRY;
    case 1: return ID_FIN;
    case 2: return CDE_CMPGN_VEH_CUST_STAT;
    case 3: return CDE_DLR;
    case 4: return NAM_FTS_DC;
    case 5: return NAM_LAST;
    case 6: return NUM_TEL;
    case 7: return DTS_CREA;
    case 8: return ID_CREA_USER;
    case 9: return DTS_LAST_UPDT;
    case 10: return ID_LAST_UPDT_USER;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CDE_CNTRY = (java.lang.CharSequence)value$; break;
    case 1: ID_FIN = (java.lang.CharSequence)value$; break;
    case 2: CDE_CMPGN_VEH_CUST_STAT = (java.lang.CharSequence)value$; break;
    case 3: CDE_DLR = (java.lang.CharSequence)value$; break;
    case 4: NAM_FTS_DC = (java.lang.CharSequence)value$; break;
    case 5: NAM_LAST = (java.lang.CharSequence)value$; break;
    case 6: NUM_TEL = (java.lang.CharSequence)value$; break;
    case 7: DTS_CREA = (java.lang.CharSequence)value$; break;
    case 8: ID_CREA_USER = (java.lang.CharSequence)value$; break;
    case 9: DTS_LAST_UPDT = (java.lang.CharSequence)value$; break;
    case 10: ID_LAST_UPDT_USER = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'CDE_CNTRY' field.
   * @return The value of the 'CDE_CNTRY' field.
   */
  public java.lang.CharSequence getCDECNTRY() {
    return CDE_CNTRY;
  }


  /**
   * Sets the value of the 'CDE_CNTRY' field.
   * @param value the value to set.
   */
  public void setCDECNTRY(java.lang.CharSequence value) {
    this.CDE_CNTRY = value;
  }

  /**
   * Gets the value of the 'ID_FIN' field.
   * @return The value of the 'ID_FIN' field.
   */
  public java.lang.CharSequence getIDFIN() {
    return ID_FIN;
  }


  /**
   * Sets the value of the 'ID_FIN' field.
   * @param value the value to set.
   */
  public void setIDFIN(java.lang.CharSequence value) {
    this.ID_FIN = value;
  }

  /**
   * Gets the value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
   * @return The value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
   */
  public java.lang.CharSequence getCDECMPGNVEHCUSTSTAT() {
    return CDE_CMPGN_VEH_CUST_STAT;
  }


  /**
   * Sets the value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
   * @param value the value to set.
   */
  public void setCDECMPGNVEHCUSTSTAT(java.lang.CharSequence value) {
    this.CDE_CMPGN_VEH_CUST_STAT = value;
  }

  /**
   * Gets the value of the 'CDE_DLR' field.
   * @return The value of the 'CDE_DLR' field.
   */
  public java.lang.CharSequence getCDEDLR() {
    return CDE_DLR;
  }


  /**
   * Sets the value of the 'CDE_DLR' field.
   * @param value the value to set.
   */
  public void setCDEDLR(java.lang.CharSequence value) {
    this.CDE_DLR = value;
  }

  /**
   * Gets the value of the 'NAM_FTS_DC' field.
   * @return The value of the 'NAM_FTS_DC' field.
   */
  public java.lang.CharSequence getNAMFTSDC() {
    return NAM_FTS_DC;
  }


  /**
   * Sets the value of the 'NAM_FTS_DC' field.
   * @param value the value to set.
   */
  public void setNAMFTSDC(java.lang.CharSequence value) {
    this.NAM_FTS_DC = value;
  }

  /**
   * Gets the value of the 'NAM_LAST' field.
   * @return The value of the 'NAM_LAST' field.
   */
  public java.lang.CharSequence getNAMLAST() {
    return NAM_LAST;
  }


  /**
   * Sets the value of the 'NAM_LAST' field.
   * @param value the value to set.
   */
  public void setNAMLAST(java.lang.CharSequence value) {
    this.NAM_LAST = value;
  }

  /**
   * Gets the value of the 'NUM_TEL' field.
   * @return The value of the 'NUM_TEL' field.
   */
  public java.lang.CharSequence getNUMTEL() {
    return NUM_TEL;
  }


  /**
   * Sets the value of the 'NUM_TEL' field.
   * @param value the value to set.
   */
  public void setNUMTEL(java.lang.CharSequence value) {
    this.NUM_TEL = value;
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
   * Creates a new TktCmpgnVehCustStatDTO RecordBuilder.
   * @return A new TktCmpgnVehCustStatDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder newBuilder() {
    return new com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder();
  }

  /**
   * Creates a new TktCmpgnVehCustStatDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TktCmpgnVehCustStatDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder newBuilder(com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder other) {
    if (other == null) {
      return new com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder();
    } else {
      return new com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder(other);
    }
  }

  /**
   * Creates a new TktCmpgnVehCustStatDTO RecordBuilder by copying an existing TktCmpgnVehCustStatDTO instance.
   * @param other The existing instance to copy.
   * @return A new TktCmpgnVehCustStatDTO RecordBuilder
   */
  public static com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder newBuilder(com.mbusa.avro.dto.TktCmpgnVehCustStatDTO other) {
    if (other == null) {
      return new com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder();
    } else {
      return new com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for TktCmpgnVehCustStatDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TktCmpgnVehCustStatDTO>
    implements org.apache.avro.data.RecordBuilder<TktCmpgnVehCustStatDTO> {

    private java.lang.CharSequence CDE_CNTRY;
    private java.lang.CharSequence ID_FIN;
    private java.lang.CharSequence CDE_CMPGN_VEH_CUST_STAT;
    private java.lang.CharSequence CDE_DLR;
    private java.lang.CharSequence NAM_FTS_DC;
    private java.lang.CharSequence NAM_LAST;
    private java.lang.CharSequence NUM_TEL;
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
    private Builder(com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CDE_CNTRY)) {
        this.CDE_CNTRY = data().deepCopy(fields()[0].schema(), other.CDE_CNTRY);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ID_FIN)) {
        this.ID_FIN = data().deepCopy(fields()[1].schema(), other.ID_FIN);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.CDE_CMPGN_VEH_CUST_STAT)) {
        this.CDE_CMPGN_VEH_CUST_STAT = data().deepCopy(fields()[2].schema(), other.CDE_CMPGN_VEH_CUST_STAT);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.CDE_DLR)) {
        this.CDE_DLR = data().deepCopy(fields()[3].schema(), other.CDE_DLR);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.NAM_FTS_DC)) {
        this.NAM_FTS_DC = data().deepCopy(fields()[4].schema(), other.NAM_FTS_DC);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.NAM_LAST)) {
        this.NAM_LAST = data().deepCopy(fields()[5].schema(), other.NAM_LAST);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.NUM_TEL)) {
        this.NUM_TEL = data().deepCopy(fields()[6].schema(), other.NUM_TEL);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.DTS_CREA)) {
        this.DTS_CREA = data().deepCopy(fields()[7].schema(), other.DTS_CREA);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.ID_CREA_USER)) {
        this.ID_CREA_USER = data().deepCopy(fields()[8].schema(), other.ID_CREA_USER);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.DTS_LAST_UPDT)) {
        this.DTS_LAST_UPDT = data().deepCopy(fields()[9].schema(), other.DTS_LAST_UPDT);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.ID_LAST_UPDT_USER)) {
        this.ID_LAST_UPDT_USER = data().deepCopy(fields()[10].schema(), other.ID_LAST_UPDT_USER);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing TktCmpgnVehCustStatDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mbusa.avro.dto.TktCmpgnVehCustStatDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CDE_CNTRY)) {
        this.CDE_CNTRY = data().deepCopy(fields()[0].schema(), other.CDE_CNTRY);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID_FIN)) {
        this.ID_FIN = data().deepCopy(fields()[1].schema(), other.ID_FIN);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CDE_CMPGN_VEH_CUST_STAT)) {
        this.CDE_CMPGN_VEH_CUST_STAT = data().deepCopy(fields()[2].schema(), other.CDE_CMPGN_VEH_CUST_STAT);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CDE_DLR)) {
        this.CDE_DLR = data().deepCopy(fields()[3].schema(), other.CDE_DLR);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.NAM_FTS_DC)) {
        this.NAM_FTS_DC = data().deepCopy(fields()[4].schema(), other.NAM_FTS_DC);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.NAM_LAST)) {
        this.NAM_LAST = data().deepCopy(fields()[5].schema(), other.NAM_LAST);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.NUM_TEL)) {
        this.NUM_TEL = data().deepCopy(fields()[6].schema(), other.NUM_TEL);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.DTS_CREA)) {
        this.DTS_CREA = data().deepCopy(fields()[7].schema(), other.DTS_CREA);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ID_CREA_USER)) {
        this.ID_CREA_USER = data().deepCopy(fields()[8].schema(), other.ID_CREA_USER);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.DTS_LAST_UPDT)) {
        this.DTS_LAST_UPDT = data().deepCopy(fields()[9].schema(), other.DTS_LAST_UPDT);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.ID_LAST_UPDT_USER)) {
        this.ID_LAST_UPDT_USER = data().deepCopy(fields()[10].schema(), other.ID_LAST_UPDT_USER);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'CDE_CNTRY' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDECNTRY() {
      return CDE_CNTRY;
    }


    /**
      * Sets the value of the 'CDE_CNTRY' field.
      * @param value The value of 'CDE_CNTRY'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setCDECNTRY(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CDE_CNTRY = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_CNTRY' field has been set.
      * @return True if the 'CDE_CNTRY' field has been set, false otherwise.
      */
    public boolean hasCDECNTRY() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CDE_CNTRY' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearCDECNTRY() {
      CDE_CNTRY = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ID_FIN' field.
      * @return The value.
      */
    public java.lang.CharSequence getIDFIN() {
      return ID_FIN;
    }


    /**
      * Sets the value of the 'ID_FIN' field.
      * @param value The value of 'ID_FIN'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setIDFIN(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ID_FIN = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ID_FIN' field has been set.
      * @return True if the 'ID_FIN' field has been set, false otherwise.
      */
    public boolean hasIDFIN() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ID_FIN' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearIDFIN() {
      ID_FIN = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDECMPGNVEHCUSTSTAT() {
      return CDE_CMPGN_VEH_CUST_STAT;
    }


    /**
      * Sets the value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
      * @param value The value of 'CDE_CMPGN_VEH_CUST_STAT'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setCDECMPGNVEHCUSTSTAT(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.CDE_CMPGN_VEH_CUST_STAT = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_CMPGN_VEH_CUST_STAT' field has been set.
      * @return True if the 'CDE_CMPGN_VEH_CUST_STAT' field has been set, false otherwise.
      */
    public boolean hasCDECMPGNVEHCUSTSTAT() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'CDE_CMPGN_VEH_CUST_STAT' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearCDECMPGNVEHCUSTSTAT() {
      CDE_CMPGN_VEH_CUST_STAT = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'CDE_DLR' field.
      * @return The value.
      */
    public java.lang.CharSequence getCDEDLR() {
      return CDE_DLR;
    }


    /**
      * Sets the value of the 'CDE_DLR' field.
      * @param value The value of 'CDE_DLR'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setCDEDLR(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.CDE_DLR = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'CDE_DLR' field has been set.
      * @return True if the 'CDE_DLR' field has been set, false otherwise.
      */
    public boolean hasCDEDLR() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'CDE_DLR' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearCDEDLR() {
      CDE_DLR = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'NAM_FTS_DC' field.
      * @return The value.
      */
    public java.lang.CharSequence getNAMFTSDC() {
      return NAM_FTS_DC;
    }


    /**
      * Sets the value of the 'NAM_FTS_DC' field.
      * @param value The value of 'NAM_FTS_DC'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setNAMFTSDC(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.NAM_FTS_DC = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'NAM_FTS_DC' field has been set.
      * @return True if the 'NAM_FTS_DC' field has been set, false otherwise.
      */
    public boolean hasNAMFTSDC() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'NAM_FTS_DC' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearNAMFTSDC() {
      NAM_FTS_DC = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'NAM_LAST' field.
      * @return The value.
      */
    public java.lang.CharSequence getNAMLAST() {
      return NAM_LAST;
    }


    /**
      * Sets the value of the 'NAM_LAST' field.
      * @param value The value of 'NAM_LAST'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setNAMLAST(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.NAM_LAST = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'NAM_LAST' field has been set.
      * @return True if the 'NAM_LAST' field has been set, false otherwise.
      */
    public boolean hasNAMLAST() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'NAM_LAST' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearNAMLAST() {
      NAM_LAST = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'NUM_TEL' field.
      * @return The value.
      */
    public java.lang.CharSequence getNUMTEL() {
      return NUM_TEL;
    }


    /**
      * Sets the value of the 'NUM_TEL' field.
      * @param value The value of 'NUM_TEL'.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setNUMTEL(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.NUM_TEL = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'NUM_TEL' field has been set.
      * @return True if the 'NUM_TEL' field has been set, false otherwise.
      */
    public boolean hasNUMTEL() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'NUM_TEL' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearNUMTEL() {
      NUM_TEL = null;
      fieldSetFlags()[6] = false;
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
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setDTSCREA(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.DTS_CREA = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'DTS_CREA' field has been set.
      * @return True if the 'DTS_CREA' field has been set, false otherwise.
      */
    public boolean hasDTSCREA() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'DTS_CREA' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearDTSCREA() {
      DTS_CREA = null;
      fieldSetFlags()[7] = false;
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
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setIDCREAUSER(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.ID_CREA_USER = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'ID_CREA_USER' field has been set.
      * @return True if the 'ID_CREA_USER' field has been set, false otherwise.
      */
    public boolean hasIDCREAUSER() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'ID_CREA_USER' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearIDCREAUSER() {
      ID_CREA_USER = null;
      fieldSetFlags()[8] = false;
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
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setDTSLASTUPDT(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.DTS_LAST_UPDT = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'DTS_LAST_UPDT' field has been set.
      * @return True if the 'DTS_LAST_UPDT' field has been set, false otherwise.
      */
    public boolean hasDTSLASTUPDT() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'DTS_LAST_UPDT' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearDTSLASTUPDT() {
      DTS_LAST_UPDT = null;
      fieldSetFlags()[9] = false;
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
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder setIDLASTUPDTUSER(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.ID_LAST_UPDT_USER = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'ID_LAST_UPDT_USER' field has been set.
      * @return True if the 'ID_LAST_UPDT_USER' field has been set, false otherwise.
      */
    public boolean hasIDLASTUPDTUSER() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'ID_LAST_UPDT_USER' field.
      * @return This builder.
      */
    public com.mbusa.avro.dto.TktCmpgnVehCustStatDTO.Builder clearIDLASTUPDTUSER() {
      ID_LAST_UPDT_USER = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TktCmpgnVehCustStatDTO build() {
      try {
        TktCmpgnVehCustStatDTO record = new TktCmpgnVehCustStatDTO();
        record.CDE_CNTRY = fieldSetFlags()[0] ? this.CDE_CNTRY : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ID_FIN = fieldSetFlags()[1] ? this.ID_FIN : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.CDE_CMPGN_VEH_CUST_STAT = fieldSetFlags()[2] ? this.CDE_CMPGN_VEH_CUST_STAT : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.CDE_DLR = fieldSetFlags()[3] ? this.CDE_DLR : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.NAM_FTS_DC = fieldSetFlags()[4] ? this.NAM_FTS_DC : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.NAM_LAST = fieldSetFlags()[5] ? this.NAM_LAST : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.NUM_TEL = fieldSetFlags()[6] ? this.NUM_TEL : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.DTS_CREA = fieldSetFlags()[7] ? this.DTS_CREA : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.ID_CREA_USER = fieldSetFlags()[8] ? this.ID_CREA_USER : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.DTS_LAST_UPDT = fieldSetFlags()[9] ? this.DTS_LAST_UPDT : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.ID_LAST_UPDT_USER = fieldSetFlags()[10] ? this.ID_LAST_UPDT_USER : (java.lang.CharSequence) defaultValue(fields()[10]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TktCmpgnVehCustStatDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<TktCmpgnVehCustStatDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TktCmpgnVehCustStatDTO>
    READER$ = (org.apache.avro.io.DatumReader<TktCmpgnVehCustStatDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.CDE_CNTRY);

    out.writeString(this.ID_FIN);

    out.writeString(this.CDE_CMPGN_VEH_CUST_STAT);

    out.writeString(this.CDE_DLR);

    out.writeString(this.NAM_FTS_DC);

    out.writeString(this.NAM_LAST);

    out.writeString(this.NUM_TEL);

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
      this.CDE_CNTRY = in.readString(this.CDE_CNTRY instanceof Utf8 ? (Utf8)this.CDE_CNTRY : null);

      this.ID_FIN = in.readString(this.ID_FIN instanceof Utf8 ? (Utf8)this.ID_FIN : null);

      this.CDE_CMPGN_VEH_CUST_STAT = in.readString(this.CDE_CMPGN_VEH_CUST_STAT instanceof Utf8 ? (Utf8)this.CDE_CMPGN_VEH_CUST_STAT : null);

      this.CDE_DLR = in.readString(this.CDE_DLR instanceof Utf8 ? (Utf8)this.CDE_DLR : null);

      this.NAM_FTS_DC = in.readString(this.NAM_FTS_DC instanceof Utf8 ? (Utf8)this.NAM_FTS_DC : null);

      this.NAM_LAST = in.readString(this.NAM_LAST instanceof Utf8 ? (Utf8)this.NAM_LAST : null);

      this.NUM_TEL = in.readString(this.NUM_TEL instanceof Utf8 ? (Utf8)this.NUM_TEL : null);

      this.DTS_CREA = in.readString(this.DTS_CREA instanceof Utf8 ? (Utf8)this.DTS_CREA : null);

      this.ID_CREA_USER = in.readString(this.ID_CREA_USER instanceof Utf8 ? (Utf8)this.ID_CREA_USER : null);

      this.DTS_LAST_UPDT = in.readString(this.DTS_LAST_UPDT instanceof Utf8 ? (Utf8)this.DTS_LAST_UPDT : null);

      this.ID_LAST_UPDT_USER = in.readString(this.ID_LAST_UPDT_USER instanceof Utf8 ? (Utf8)this.ID_LAST_UPDT_USER : null);

    } else {
      for (int i = 0; i < 11; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.CDE_CNTRY = in.readString(this.CDE_CNTRY instanceof Utf8 ? (Utf8)this.CDE_CNTRY : null);
          break;

        case 1:
          this.ID_FIN = in.readString(this.ID_FIN instanceof Utf8 ? (Utf8)this.ID_FIN : null);
          break;

        case 2:
          this.CDE_CMPGN_VEH_CUST_STAT = in.readString(this.CDE_CMPGN_VEH_CUST_STAT instanceof Utf8 ? (Utf8)this.CDE_CMPGN_VEH_CUST_STAT : null);
          break;

        case 3:
          this.CDE_DLR = in.readString(this.CDE_DLR instanceof Utf8 ? (Utf8)this.CDE_DLR : null);
          break;

        case 4:
          this.NAM_FTS_DC = in.readString(this.NAM_FTS_DC instanceof Utf8 ? (Utf8)this.NAM_FTS_DC : null);
          break;

        case 5:
          this.NAM_LAST = in.readString(this.NAM_LAST instanceof Utf8 ? (Utf8)this.NAM_LAST : null);
          break;

        case 6:
          this.NUM_TEL = in.readString(this.NUM_TEL instanceof Utf8 ? (Utf8)this.NUM_TEL : null);
          break;

        case 7:
          this.DTS_CREA = in.readString(this.DTS_CREA instanceof Utf8 ? (Utf8)this.DTS_CREA : null);
          break;

        case 8:
          this.ID_CREA_USER = in.readString(this.ID_CREA_USER instanceof Utf8 ? (Utf8)this.ID_CREA_USER : null);
          break;

        case 9:
          this.DTS_LAST_UPDT = in.readString(this.DTS_LAST_UPDT instanceof Utf8 ? (Utf8)this.DTS_LAST_UPDT : null);
          break;

        case 10:
          this.ID_LAST_UPDT_USER = in.readString(this.ID_LAST_UPDT_USER instanceof Utf8 ? (Utf8)this.ID_LAST_UPDT_USER : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










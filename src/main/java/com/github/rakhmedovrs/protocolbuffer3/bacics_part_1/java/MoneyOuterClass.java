package com.github.rakhmedovrs.protocolbuffer3.bacics_part_1.java;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: money.proto

public final class MoneyOuterClass {
  private MoneyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MoneyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Money)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string currency_code = 1;</code>
     * @return The currencyCode.
     */
    java.lang.String getCurrencyCode();
    /**
     * <code>string currency_code = 1;</code>
     * @return The bytes for currencyCode.
     */
    com.google.protobuf.ByteString
        getCurrencyCodeBytes();

    /**
     * <code>int32 integral_amount = 2;</code>
     * @return The integralAmount.
     */
    int getIntegralAmount();

    /**
     * <code>int32 decimal_amount = 3;</code>
     * @return The decimalAmount.
     */
    int getDecimalAmount();
  }
  /**
   * Protobuf type {@code Money}
   */
  public static final class Money extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Money)
      MoneyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Money.newBuilder() to construct.
    private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Money() {
      currencyCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Money();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Money(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              currencyCode_ = s;
              break;
            }
            case 16: {

              integralAmount_ = input.readInt32();
              break;
            }
            case 24: {

              decimalAmount_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MoneyOuterClass.internal_static_Money_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MoneyOuterClass.internal_static_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MoneyOuterClass.Money.class, MoneyOuterClass.Money.Builder.class);
    }

    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object currencyCode_;
    /**
     * <code>string currency_code = 1;</code>
     * @return The currencyCode.
     */
    @java.lang.Override
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      }
    }
    /**
     * <code>string currency_code = 1;</code>
     * @return The bytes for currencyCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INTEGRAL_AMOUNT_FIELD_NUMBER = 2;
    private int integralAmount_;
    /**
     * <code>int32 integral_amount = 2;</code>
     * @return The integralAmount.
     */
    @java.lang.Override
    public int getIntegralAmount() {
      return integralAmount_;
    }

    public static final int DECIMAL_AMOUNT_FIELD_NUMBER = 3;
    private int decimalAmount_;
    /**
     * <code>int32 decimal_amount = 3;</code>
     * @return The decimalAmount.
     */
    @java.lang.Override
    public int getDecimalAmount() {
      return decimalAmount_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currencyCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currencyCode_);
      }
      if (integralAmount_ != 0) {
        output.writeInt32(2, integralAmount_);
      }
      if (decimalAmount_ != 0) {
        output.writeInt32(3, decimalAmount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currencyCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currencyCode_);
      }
      if (integralAmount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, integralAmount_);
      }
      if (decimalAmount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, decimalAmount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MoneyOuterClass.Money)) {
        return super.equals(obj);
      }
      MoneyOuterClass.Money other = (MoneyOuterClass.Money) obj;

      if (!getCurrencyCode()
          .equals(other.getCurrencyCode())) return false;
      if (getIntegralAmount()
          != other.getIntegralAmount()) return false;
      if (getDecimalAmount()
          != other.getDecimalAmount()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyCode().hashCode();
      hash = (37 * hash) + INTEGRAL_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getIntegralAmount();
      hash = (37 * hash) + DECIMAL_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDecimalAmount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MoneyOuterClass.Money parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MoneyOuterClass.Money parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MoneyOuterClass.Money parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MoneyOuterClass.Money prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Money}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Money)
        MoneyOuterClass.MoneyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MoneyOuterClass.internal_static_Money_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MoneyOuterClass.internal_static_Money_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MoneyOuterClass.Money.class, MoneyOuterClass.Money.Builder.class);
      }

      // Construct using MoneyOuterClass.Money.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        currencyCode_ = "";

        integralAmount_ = 0;

        decimalAmount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MoneyOuterClass.internal_static_Money_descriptor;
      }

      @java.lang.Override
      public MoneyOuterClass.Money getDefaultInstanceForType() {
        return MoneyOuterClass.Money.getDefaultInstance();
      }

      @java.lang.Override
      public MoneyOuterClass.Money build() {
        MoneyOuterClass.Money result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MoneyOuterClass.Money buildPartial() {
        MoneyOuterClass.Money result = new MoneyOuterClass.Money(this);
        result.currencyCode_ = currencyCode_;
        result.integralAmount_ = integralAmount_;
        result.decimalAmount_ = decimalAmount_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MoneyOuterClass.Money) {
          return mergeFrom((MoneyOuterClass.Money)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MoneyOuterClass.Money other) {
        if (other == MoneyOuterClass.Money.getDefaultInstance()) return this;
        if (!other.getCurrencyCode().isEmpty()) {
          currencyCode_ = other.currencyCode_;
          onChanged();
        }
        if (other.getIntegralAmount() != 0) {
          setIntegralAmount(other.getIntegralAmount());
        }
        if (other.getDecimalAmount() != 0) {
          setDecimalAmount(other.getDecimalAmount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MoneyOuterClass.Money parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MoneyOuterClass.Money) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object currencyCode_ = "";
      /**
       * <code>string currency_code = 1;</code>
       * @return The currencyCode.
       */
      public java.lang.String getCurrencyCode() {
        java.lang.Object ref = currencyCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          currencyCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string currency_code = 1;</code>
       * @return The bytes for currencyCode.
       */
      public com.google.protobuf.ByteString
          getCurrencyCodeBytes() {
        java.lang.Object ref = currencyCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          currencyCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string currency_code = 1;</code>
       * @param value The currencyCode to set.
       * @return This builder for chaining.
       */
      public Builder setCurrencyCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        currencyCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string currency_code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrencyCode() {
        
        currencyCode_ = getDefaultInstance().getCurrencyCode();
        onChanged();
        return this;
      }
      /**
       * <code>string currency_code = 1;</code>
       * @param value The bytes for currencyCode to set.
       * @return This builder for chaining.
       */
      public Builder setCurrencyCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        currencyCode_ = value;
        onChanged();
        return this;
      }

      private int integralAmount_ ;
      /**
       * <code>int32 integral_amount = 2;</code>
       * @return The integralAmount.
       */
      @java.lang.Override
      public int getIntegralAmount() {
        return integralAmount_;
      }
      /**
       * <code>int32 integral_amount = 2;</code>
       * @param value The integralAmount to set.
       * @return This builder for chaining.
       */
      public Builder setIntegralAmount(int value) {
        
        integralAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 integral_amount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntegralAmount() {
        
        integralAmount_ = 0;
        onChanged();
        return this;
      }

      private int decimalAmount_ ;
      /**
       * <code>int32 decimal_amount = 3;</code>
       * @return The decimalAmount.
       */
      @java.lang.Override
      public int getDecimalAmount() {
        return decimalAmount_;
      }
      /**
       * <code>int32 decimal_amount = 3;</code>
       * @param value The decimalAmount to set.
       * @return This builder for chaining.
       */
      public Builder setDecimalAmount(int value) {
        
        decimalAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 decimal_amount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDecimalAmount() {
        
        decimalAmount_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Money)
    }

    // @@protoc_insertion_point(class_scope:Money)
    private static final MoneyOuterClass.Money DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MoneyOuterClass.Money();
    }

    public static MoneyOuterClass.Money getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Money>
        PARSER = new com.google.protobuf.AbstractParser<Money>() {
      @java.lang.Override
      public Money parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Money(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Money> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Money> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MoneyOuterClass.Money getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Money_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013money.proto\"O\n\005Money\022\025\n\rcurrency_code\030" +
      "\001 \001(\t\022\027\n\017integral_amount\030\002 \001(\005\022\026\n\016decima" +
      "l_amount\030\003 \001(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Money_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Money_descriptor,
        new java.lang.String[] { "CurrencyCode", "IntegralAmount", "DecimalAmount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
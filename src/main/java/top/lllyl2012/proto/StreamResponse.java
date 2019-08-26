// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package top.lllyl2012.proto;

/**
 * Protobuf type {@code top.lllyl2012.proto.StreamResponse}
 */
public  final class StreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:top.lllyl2012.proto.StreamResponse)
    StreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamResponse.newBuilder() to construct.
  private StreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamResponse() {
    responseInfo_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            responseInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return top.lllyl2012.proto.StudentProto.internal_static_top_lllyl2012_proto_StreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return top.lllyl2012.proto.StudentProto.internal_static_top_lllyl2012_proto_StreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            top.lllyl2012.proto.StreamResponse.class, top.lllyl2012.proto.StreamResponse.Builder.class);
  }

  public static final int RESPONSE_INFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseInfo_;
  /**
   * <code>string response_info = 1;</code>
   */
  public java.lang.String getResponseInfo() {
    java.lang.Object ref = responseInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string response_info = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResponseInfoBytes() {
    java.lang.Object ref = responseInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getResponseInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResponseInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseInfo_);
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
    if (!(obj instanceof top.lllyl2012.proto.StreamResponse)) {
      return super.equals(obj);
    }
    top.lllyl2012.proto.StreamResponse other = (top.lllyl2012.proto.StreamResponse) obj;

    boolean result = true;
    result = result && getResponseInfo()
        .equals(other.getResponseInfo());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getResponseInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static top.lllyl2012.proto.StreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static top.lllyl2012.proto.StreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static top.lllyl2012.proto.StreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static top.lllyl2012.proto.StreamResponse parseFrom(
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
  public static Builder newBuilder(top.lllyl2012.proto.StreamResponse prototype) {
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
   * Protobuf type {@code top.lllyl2012.proto.StreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:top.lllyl2012.proto.StreamResponse)
      top.lllyl2012.proto.StreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return top.lllyl2012.proto.StudentProto.internal_static_top_lllyl2012_proto_StreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return top.lllyl2012.proto.StudentProto.internal_static_top_lllyl2012_proto_StreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              top.lllyl2012.proto.StreamResponse.class, top.lllyl2012.proto.StreamResponse.Builder.class);
    }

    // Construct using top.lllyl2012.proto.StreamResponse.newBuilder()
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
      responseInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return top.lllyl2012.proto.StudentProto.internal_static_top_lllyl2012_proto_StreamResponse_descriptor;
    }

    @java.lang.Override
    public top.lllyl2012.proto.StreamResponse getDefaultInstanceForType() {
      return top.lllyl2012.proto.StreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public top.lllyl2012.proto.StreamResponse build() {
      top.lllyl2012.proto.StreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public top.lllyl2012.proto.StreamResponse buildPartial() {
      top.lllyl2012.proto.StreamResponse result = new top.lllyl2012.proto.StreamResponse(this);
      result.responseInfo_ = responseInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof top.lllyl2012.proto.StreamResponse) {
        return mergeFrom((top.lllyl2012.proto.StreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(top.lllyl2012.proto.StreamResponse other) {
      if (other == top.lllyl2012.proto.StreamResponse.getDefaultInstance()) return this;
      if (!other.getResponseInfo().isEmpty()) {
        responseInfo_ = other.responseInfo_;
        onChanged();
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
      top.lllyl2012.proto.StreamResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (top.lllyl2012.proto.StreamResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responseInfo_ = "";
    /**
     * <code>string response_info = 1;</code>
     */
    public java.lang.String getResponseInfo() {
      java.lang.Object ref = responseInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response_info = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResponseInfoBytes() {
      java.lang.Object ref = responseInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response_info = 1;</code>
     */
    public Builder setResponseInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string response_info = 1;</code>
     */
    public Builder clearResponseInfo() {
      
      responseInfo_ = getDefaultInstance().getResponseInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string response_info = 1;</code>
     */
    public Builder setResponseInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:top.lllyl2012.proto.StreamResponse)
  }

  // @@protoc_insertion_point(class_scope:top.lllyl2012.proto.StreamResponse)
  private static final top.lllyl2012.proto.StreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new top.lllyl2012.proto.StreamResponse();
  }

  public static top.lllyl2012.proto.StreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamResponse>() {
    @java.lang.Override
    public StreamResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public top.lllyl2012.proto.StreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


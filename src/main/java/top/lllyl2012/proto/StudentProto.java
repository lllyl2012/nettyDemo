// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package top.lllyl2012.proto;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_StudentResponseList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_StudentResponseList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_lllyl2012_proto_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_lllyl2012_proto_StreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\023top.lllyl2012.proto\"\035\n\t" +
      "MyRequest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyRespons" +
      "e\022\020\n\010realname\030\002 \001(\t\"\035\n\016StudentRequest\022\013\n" +
      "\003age\030\001 \001(\005\":\n\017StudentResponse\022\014\n\004name\030\001 " +
      "\001(\t\022\013\n\003age\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\"T\n\023Studen" +
      "tResponseList\022=\n\017studentResponse\030\001 \003(\0132$" +
      ".top.lllyl2012.proto.StudentResponse\"%\n\r" +
      "StreamRequest\022\024\n\014request_info\030\001 \001(\t\"\'\n\016S" +
      "treamResponse\022\025\n\rresponse_info\030\001 \001(\t2\226\003\n" +
      "\016StudentService\022Z\n\025GetRealNameByUsername" +
      "\022\036.top.lllyl2012.proto.MyRequest\032\037.top.l" +
      "llyl2012.proto.MyResponse\"\000\022a\n\020GetStuden" +
      "tsByAge\022#.top.lllyl2012.proto.StudentReq" +
      "uest\032$.top.lllyl2012.proto.StudentRespon" +
      "se\"\0000\001\022l\n\027GetStudentWrapperByAges\022#.top." +
      "lllyl2012.proto.StudentRequest\032(.top.lll" +
      "yl2012.proto.StudentResponseList\"\000(\001\022W\n\006" +
      "BiTalk\022\".top.lllyl2012.proto.StreamReque" +
      "st\032#.top.lllyl2012.proto.StreamResponse\"" +
      "\000(\0010\001B%\n\023top.lllyl2012.protoB\014StudentPro" +
      "toP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_top_lllyl2012_proto_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_top_lllyl2012_proto_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_top_lllyl2012_proto_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_top_lllyl2012_proto_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_MyResponse_descriptor,
        new java.lang.String[] { "Realname", });
    internal_static_top_lllyl2012_proto_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_top_lllyl2012_proto_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_StudentRequest_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_top_lllyl2012_proto_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_top_lllyl2012_proto_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "City", });
    internal_static_top_lllyl2012_proto_StudentResponseList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_top_lllyl2012_proto_StudentResponseList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_StudentResponseList_descriptor,
        new java.lang.String[] { "StudentResponse", });
    internal_static_top_lllyl2012_proto_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_top_lllyl2012_proto_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_StreamRequest_descriptor,
        new java.lang.String[] { "RequestInfo", });
    internal_static_top_lllyl2012_proto_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_top_lllyl2012_proto_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_lllyl2012_proto_StreamResponse_descriptor,
        new java.lang.String[] { "ResponseInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

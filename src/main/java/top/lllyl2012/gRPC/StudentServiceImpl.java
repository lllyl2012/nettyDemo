package top.lllyl2012.gRPC;

import io.grpc.stub.StreamObserver;
import top.lllyl2012.proto.*;

import java.util.UUID;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {
    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println(request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("haha").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentsByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println(request.getAge());

        responseObserver.onNext(StudentResponse.newBuilder().setName("高手亮").setAge(12).setCity("瑞安").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("高手哈").setAge(32).setCity("温州").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("高手牛").setAge(42).setCity("杭州").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("高手牙").setAge(52).setCity("北京").build());

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> getStudentWrapperByAges(StreamObserver<StudentResponseList> responseObserver) {
        return new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest value) {
                System.out.println("onNext:"+value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("throw:"+t.getMessage());
            }

            @Override
            public void onCompleted() {
                StudentResponse studentResponse = StudentResponse.newBuilder().setName("第一").setAge(11).setCity("城市").build();
                StudentResponse studentResponse2 = StudentResponse.newBuilder().setName("第二").setAge(21).setCity("城镇").build();

                StudentResponseList list = StudentResponseList.newBuilder().addStudentResponse(studentResponse).addStudentResponse(studentResponse2).build();

                responseObserver.onNext(list);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamResponse> responseObserver) {
        return  new StreamObserver<StreamRequest>(){

            @Override
            public void onNext(StreamRequest value) {
                System.out.println(value.getRequestInfo());

                responseObserver.onNext(StreamResponse.newBuilder().setResponseInfo(UUID.randomUUID().toString()).build());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

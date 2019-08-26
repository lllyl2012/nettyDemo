package top.lllyl2012.gRPC;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import top.lllyl2012.proto.*;

import java.time.LocalDateTime;
import java.util.Iterator;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8090).usePlaintext().build();

        StudentServiceGrpc.StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);

        StudentServiceGrpc.StudentServiceStub stub = StudentServiceGrpc.newStub(managedChannel);

//        MyResponse response = studentServiceBlockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("gaga").build());
//
//        System.out.println(response.getRealname());
//
//        System.out.println("----------------------------------------------------------------------------------------");
//
//        Iterator<StudentResponse> itr = studentServiceBlockingStub.getStudentsByAge(StudentRequest.newBuilder().setAge(12).build());
//
//        if (itr.hasNext()) {
//            StudentResponse studentResponse = itr.next();
//            System.out.println(studentResponse.getName() + ":" +studentResponse.getAge()+":"+studentResponse.getCity());
//        }

//        System.out.println("------------------------------------------------------------------------------------------------");
//
//        StreamObserver<StudentResponseList> studentResponseListStreamObserver = new StreamObserver<StudentResponseList>() {
//            @Override
//            public void onNext(StudentResponseList value) {
//                value.getStudentResponseList().forEach(studentResponse->{
//                    System.out.println("name:"+studentResponse.getName());
//                    System.out.println("age:"+studentResponse.getAge());
//                    System.out.println("city:"+studentResponse.getCity());
//                    System.out.println("****************");
//                });
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.out.println(t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("completed");
//            }
//        };
//
//        StreamObserver<StudentRequest> studentRequestStreamObserver = stub.getStudentWrapperByAges(studentResponseListStreamObserver);
//
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(21).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(22).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(23).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(24).build());
//        studentRequestStreamObserver.onCompleted();

        StreamObserver<StreamRequest> streamRequestStreamObserver = stub.biTalk(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                System.out.println(value.getResponseInfo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
            }
        });

        for (int i = 0; i < 10; i++) {
            streamRequestStreamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(
                    LocalDateTime.now().toString()
            ).build());
        }

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

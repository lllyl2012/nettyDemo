package top.lllyl2012.gRPC;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GrpcServer {
    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8090).addService(new StudentServiceImpl()).build().start();

        System.out.println("Server start");

        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            System.out.println("stop it");
            GrpcServer.this.stop();}));

        System.out.println("执行执行");
    }

    private void stop() {
        if (null != server) {
            server.shutdown();
        }
    }

    private void awaitTermination() {
        if (null != server) {
            try {
                server.awaitTermination();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        GrpcServer grpcServer = new GrpcServer();

        grpcServer.start();
        grpcServer.awaitTermination();

    }
}

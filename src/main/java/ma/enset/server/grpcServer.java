package ma.enset.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.services.bankGrpcService;

import java.io.IOException;



public class grpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(2023)
                .addService(new bankGrpcService())
                .build();
        server.start();
        server.awaitTermination();

    }
}

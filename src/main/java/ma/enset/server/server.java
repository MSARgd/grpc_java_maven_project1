package ma.enset.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.services.bankGrpcService;

import java.io.IOException;
//bloomrpc --proto_path /path/to/your/proto --proto file.proto // does'nt work
// bloomrpc src/main/resources/bank.proto // work and it say
//[Service] .BankService detected:
//        [Method] convert registered
//        [Method] getCurrencyStream registered
//        [Method] performStream registered
//        [Method] fullCurrencyStream registered
//
//        GRPC Server listening on port 3009!



public class server {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(2023)
                .addService(new bankGrpcService())
                .build();
        server.start();
        server.awaitTermination();

    }
}

package ma.enset.services;

import io.grpc.stub.StreamObserver;
import ma.enset.subs.Bank;
import ma.enset.subs.BankServiceGrpc;

public class bankGrpcService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        double amount = request.getAmount();
        Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount*11.4)
                .build();
        // envoyer le reponse
        responseObserver.onNext(response);
        responseObserver.onCompleted();



    }

//    @Override
//    public void getCurrencyStream(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
//        String currencyFrom = request.getCurrencyFrom();
//        String currencyTo = request.getCurrencyTo();
//        double amount = request.getAmount();
//
//    }
//
//    @Override
//    public StreamObserver<Bank.ConvertCurrencyRequest> performStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
//
//    }

//    @Override
//    public StreamObserver<Bank.ConvertCurrencyRequest> fullCurrencyStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
//
//    }
}

package com.mahdi20.DependencyInversionPrinciple;

class SmsSender implements Sender {

    @Override
    public void send(String message) {
        // send message with sms
        System.out.printf("send sms: " + message);
    }
}
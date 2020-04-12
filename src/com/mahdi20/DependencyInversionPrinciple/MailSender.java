package com.mahdi20.DependencyInversionPrinciple;

public class MailSender implements Sender {

    @Override
    public void send(String message) {
        // send mesage with email
        System.out.printf("send mail: " + message);
    }


}
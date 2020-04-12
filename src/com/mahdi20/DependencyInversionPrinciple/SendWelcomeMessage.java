package com.mahdi20.DependencyInversionPrinciple;

class SendWelcomeMessage {

    private Sender sender;

    public SendWelcomeMessage() {
    }

    public SendWelcomeMessage(Sender sender) {
        this.sender = sender;
    }

    public void sendMessage(String userName) {
        sender.send("Hello: " + userName);
    }
}
package com.example;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generateText(){
        return mailCode.generateText(client);
    }
}

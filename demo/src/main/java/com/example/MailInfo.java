package com.example.task3;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generateText(){
        return mailCode.generateText(client);
    }
}

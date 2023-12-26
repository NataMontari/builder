package com.example.task3;

public class WelcomeCode implements MailCode{

    @Override
    public String generateText(Client client){
        String text = "Hello {{NAME}}";
        return text.replaceAll("{{NAME}}", client.getName());
    }
    
}

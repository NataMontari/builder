package com.example;

public class MailSender {
    public String sendMail(MailInfo mailInfo){
        return mailInfo.generateText();
    }
}

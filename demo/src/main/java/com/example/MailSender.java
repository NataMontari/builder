package com.example.task3;

public class MailSender {
    public String sendMail(MailInfo mailInfo){
        return mailInfo.generateText();
    }
}

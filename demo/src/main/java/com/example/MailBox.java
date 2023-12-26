package com.example;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender sender = new MailSender();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(){
        for(MailInfo mail:infos){
            sender.sendMail(mail);
        }
    }

}

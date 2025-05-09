package com.artur.factory;

public class GmailFactory implements EmailFactory{
    @Override
    public EmailSender criarEmail() {
        return new Gmail();
    }
}

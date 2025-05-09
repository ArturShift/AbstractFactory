package com.artur.factory;

public class YahooFactory implements EmailFactory{
    @Override
    public EmailSender criarEmail() {
        return new Yahoo();
    }
}

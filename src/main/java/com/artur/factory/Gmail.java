package com.artur.factory;

public class Gmail implements EmailSender {
    @Override
    public void enviarEmail() {
        System.out.println("Email enviado pelo Gmail");
    }
}

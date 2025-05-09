package com.artur.factory;

public class Yahoo implements EmailSender {
    @Override
    public void enviarEmail() {
        System.out.println("Email enviado pelo Yahoo");
    }
}

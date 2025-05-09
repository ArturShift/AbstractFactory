package com.artur.factory;


public class Main {
    public static void main(String[] args) {
        int tipo = 1; //1 - Gmail  2- Yahoo  (exemplo)
        EmailFactory email;
        switch (tipo) {
            case 1:
                email = new GmailFactory();
                break;
            case 2:
                email = new YahooFactory();
                break;
            default:
                email = new GmailFactory();
                break;
        }
        EmailSender sender = email.criarEmail();
        sender.enviarEmail();
    }
}
package com.emailsender.sender;

public final class MailSenderFactory {

    private final static EmailSender SENDER = new EmailSenderImpl();

    private MailSenderFactory() {
        //no construnction allowed
    }


    public static EmailSender get() {
        return SENDER;
    }
}

package com.emailsender.sender;

final class MailTask implements Runnable {


    private final String userName;
    private final String email;


    public MailTask(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }


    @Override
    public void run() {
        System.out.println(String.format("Sending email to User [%s], with E-mail [%s]", userName, email));
    }
}

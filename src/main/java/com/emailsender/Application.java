package com.emailsender;

import com.emailsender.fileReader.FileReaderFactory;
import com.emailsender.fileReader.UsersFileReader;
import com.emailsender.model.User;
import com.emailsender.sender.EmailSender;
import com.emailsender.sender.MailSenderFactory;

import java.util.List;

public final class Application {

    private static final String USERS_PATH = "users/userdata.csv";


    private Application() {
        //no construction allowed
    }

    /**
     * Starts mail sender
     */
    public static void main(String[] args) {

        UsersFileReader fileReader = FileReaderFactory.get();
        List<User> users = fileReader.readUsersFile(USERS_PATH);

        EmailSender emailSender = MailSenderFactory.get();
        emailSender.emailUsers(users);

    }
}

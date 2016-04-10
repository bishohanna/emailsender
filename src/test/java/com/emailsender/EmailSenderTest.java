package com.emailsender;

import com.emailsender.fileReader.FileReaderFactory;
import com.emailsender.fileReader.UsersFileReader;
import com.emailsender.model.User;
import com.emailsender.sender.EmailSender;
import com.emailsender.sender.MailSenderFactory;
import org.junit.Test;

import java.util.List;

public class EmailSenderTest {

    private static final String USERS_PATH = "users/userdata.csv";

    private UsersFileReader reader = FileReaderFactory.get();
    private EmailSender sender = MailSenderFactory.get();

    @Test
    public void testSendingMails() {

        //get users
        List<User> users = reader.readUsersFile(USERS_PATH);

        //send mails
        sender.emailUsers(users);
    }
}

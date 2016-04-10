package com.emailsender;

import com.emailsender.fileReader.FileReaderFactory;
import com.emailsender.fileReader.UsersFileReader;
import com.emailsender.model.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UsersReaderTest {

    private static final String USERS_PATH = "users/userdata.csv";

    private UsersFileReader reader = FileReaderFactory.get();

    @Test
    public void testReadingUsers() {

        //get users
        List<User> users = reader.readUsersFile(USERS_PATH);

        Assert.assertNotNull("Users should not be null", users);
        Assert.assertFalse("List should contain users", users.isEmpty());

    }

    @Test
    public void testReadingUsersWrongPath() {
        //try to get users
        List<User> users = reader.readUsersFile("/path/not/found/userdata.csv");

        Assert.assertNull("No users should be found on a wrong path", users);
    }

}

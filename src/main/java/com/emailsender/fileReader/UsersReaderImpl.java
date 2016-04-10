package com.emailsender.fileReader;

import com.emailsender.model.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

final class UsersReaderImpl implements UsersFileReader {


    @Override
    public List<User> readUsersFile(String path) {

        try {
            //read file
            URL dirUrl = this.getClass().getClassLoader().getResource(path);
            BufferedReader reader = new BufferedReader(new FileReader(new File(dirUrl.getFile())));

            //transform to users
            List<User> users = new ArrayList<>();

            String userLine;
            while ((userLine = reader.readLine()) != null) {
                String[] userValues = userLine.split(",");

                String userName = userValues[0];
                String userEmail = userValues[1];
                boolean active = Boolean.parseBoolean(userValues[2]);

                users.add(new User(userName, userEmail, active));
            }

            return users;

        } catch (Exception ex) {
            System.out.println(String.format("Error reading users from file due to [%s]", ex.getMessage()));
            return null;
        }

    }
}

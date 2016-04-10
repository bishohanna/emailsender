package com.emailsender.fileReader;

import com.emailsender.model.User;

import java.util.List;

public interface UsersFileReader {

    /**
     * Gets users from file in file path
     *
     * @param path path to users file
     * @return list of users
     */
    List<User> readUsersFile(String path);
}

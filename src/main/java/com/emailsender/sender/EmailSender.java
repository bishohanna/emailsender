package com.emailsender.sender;

import com.emailsender.model.User;

import java.util.List;

public interface EmailSender {

    /**
     * Sends emais to the passed users
     *
     * @param users users to email
     */
    void emailUsers(List<User> users);


}

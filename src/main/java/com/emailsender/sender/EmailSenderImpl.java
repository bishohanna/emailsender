package com.emailsender.sender;

import com.emailsender.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

final class EmailSenderImpl implements EmailSender {

    private final ExecutorService EXECUTOR;


    public EmailSenderImpl() {

        //initialize with 5 parallel tasks
        EXECUTOR = Executors.newFixedThreadPool(5);
    }

    @Override
    public void emailUsers(List<User> users) {

        if (users != null && !users.isEmpty()) {

            //transform active users to mail tasks
            List<MailTask> mailTasks = users.stream()
                    .filter(user -> user.isActive())
                    .map(user -> new MailTask(user.getName(), user.getEmail()))
                    .collect(Collectors.toCollection(LinkedList::new));

            //submit tasks
            mailTasks.stream().forEach(task -> EXECUTOR.submit(task));
        }
    }
}

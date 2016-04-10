package com.emailsender.model;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String email;
    private boolean active;

    public User(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return new StringBuilder("User: ")
                .append("[").append(getName()).append("], ")
                .append("email: ")
                .append("[").append(getEmail()).append("], ")
                .append("Active: ")
                .append("[").append(isActive()).append("]").toString();
    }
}

package me.dri.chat.ChatServer.entities;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String message;


    public User() {

    }

    public User(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

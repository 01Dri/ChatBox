package me.dri.chat.ChatServer.entities;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(message, user.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

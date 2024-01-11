package me.dri.chat.ChatServer.controllers;


import me.dri.chat.ChatServer.entities.User;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController
{

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public User sendMessage(User user) {
        System.out.println(user.toString());
        return user;
    }

}

package me.dri.chat.ChatServer.controllers;


import me.dri.chat.ChatServer.entities.User;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController
{

    @MessageMapping("/chatMessage")
    @SendTo("/channel")

    public User sendMessage(User user) {
        return user;
    }

}

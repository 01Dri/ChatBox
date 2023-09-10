package me.dri.chat.ChatServer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    

    @GetMapping("/page")
    public String getHtmlAccess() {
        return "index.html";
    }
}

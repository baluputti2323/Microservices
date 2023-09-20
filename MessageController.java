package net.javaguides.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//these controller is to follow the changes in the config repo git file
@RefreshScope
@RestController
public class MessageController {
    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("user/message")
    public String getMessage(){
        return message;
    }
}

package com.example.kodillaspring.forumUser;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {

   private String userName;

    public ForumUser() {
        userName="John Smith";
    }

    public String getUserName() {
        return userName;
    }
}

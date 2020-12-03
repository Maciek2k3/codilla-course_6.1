package com.example.kodillaspring.forumUser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForumUserTest {
    @Test
    public void TestForumUserGetName() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspring");
        ForumUser user = context.getBean(ForumUser.class);
        //when
        String name = user.getUserName();
        //then
        Assert.assertEquals("John Smith", name);
    }


}
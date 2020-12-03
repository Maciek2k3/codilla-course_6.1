package com.example.kodillaspring.library;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuite {

    //@Autowired
    //private Library library;

    @Test
    public void testLoadFromDb() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Library library = applicationContext.getBean(Library.class);
        //when
        library.loadData();

    }

    @Test
    public void testSaveFromDb() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Library library = applicationContext.getBean(Library.class);
        //when
        library.saveTodata();
    }
}

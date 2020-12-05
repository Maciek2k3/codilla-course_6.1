package com.example.kodillaspring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testToAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String taskToDo = "Task1";
        String taskInProgress = "Task2";
        String taskDone = "Task3";
        board.toDoList.addTask(taskToDo);
        board.inProgressList.addTask(taskInProgress);
        board.doneList.addTask(taskDone);
        //Then
        Assert.assertEquals("Task1", board.getToDoList().getTask().get(0));
        Assert.assertEquals("Task2", board.getInProgressList().getTask().get(0));
        Assert.assertEquals("Task3", board.getDoneList().getTask().get(0));
    }
}

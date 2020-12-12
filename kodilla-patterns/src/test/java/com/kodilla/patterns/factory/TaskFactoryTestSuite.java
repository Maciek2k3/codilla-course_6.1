package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.ShoppingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task shopping = factory.create(TaskFactory.SHOPPINGTASK,"bread");
        shopping.executeTask();
        //THEN
        assertEquals("Shop", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());

    }

    @Test
    void testPaintingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task painting = factory.create(TaskFactory.PAINTINGTASK,"black");
        painting.executeTask();
        //THEN
        assertEquals("Paint", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testDrivingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task driving = factory.create(TaskFactory.DRIVINGTASK,"WAW");
        driving.executeTask();
        //THEN
        assertEquals("Drive", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}

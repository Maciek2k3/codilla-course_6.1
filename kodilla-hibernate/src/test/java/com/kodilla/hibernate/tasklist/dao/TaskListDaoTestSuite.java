package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String description = "hello";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("List1", description);
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        Optional<TaskList> readList = taskListDao.findById(id);
        assertTrue(readList.isPresent());
        //CleanUp
        taskListDao.deleteById(id);

    }

    @Test
    public void testFindByListName_2() {
        //Given
        TaskList taskList = new TaskList("List1", description);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readList = taskListDao.findByListName(listName);
        //Then
        assertEquals(1, readList.size());
        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);
    }
}

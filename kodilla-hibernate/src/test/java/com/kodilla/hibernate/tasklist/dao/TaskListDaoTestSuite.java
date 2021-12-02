package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;


    @Test
    void testFindByListName() {
        //Given & When
        taskListDao.save(new TaskList("Task no. 1", "This is task number one"));
        taskListDao.save(new TaskList("Task no. 2", "This is task number two"));
        taskListDao.save(new TaskList("Task no. 3", "This is task number three"));

        //When
        List<TaskList> taskListsFound = taskListDao.findByListName("Task no. 2");

        //Then
        assertEquals(1, taskListsFound.size());

        //Cleanup
        taskListDao.deleteAll();

    }
}

//utwórz test testFindByListName() sprawdzający, czy metoda findByListName(String listName) działa poprawnie.
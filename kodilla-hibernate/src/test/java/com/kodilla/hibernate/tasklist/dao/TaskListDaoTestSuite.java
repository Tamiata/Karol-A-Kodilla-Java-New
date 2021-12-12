package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);

        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);

        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");

        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);


        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }
}

//utwórz test testFindByListName() sprawdzający, czy metoda findByListName(String listName) działa poprawnie.
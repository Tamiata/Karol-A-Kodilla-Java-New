package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());

    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());

    }

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());

    }
}

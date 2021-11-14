package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.addTask("To do");
        board.inProgressList.addTask("In progress");
        board.doneList.addTask("Done");

        //Then
        assertEquals("To do",board.getToDoList().getTasks().get(0));
        assertEquals("In progress",board.getInProgressList().getTasks().get(0));
        assertEquals("Done",board.getDoneList().getTasks().get(0));


    }
}


// testTaskAdd(), który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do beana klasy Board).
// Test powinien sprawdzać, czy dodane zadania da się odczytać.
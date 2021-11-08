package com.kodilla.spring.Calculator;

import com.kodilla.spring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double additionResult = calculator.add(2,4);
        double subtractionResult = calculator.sub(11,5);
        double multiplicationRestult = calculator.mul(2,3);
        double divisionResult = calculator.div(30,5);

        //Then
        assertEquals(6,additionResult);
        assertEquals(6,subtractionResult);
        assertEquals(6,multiplicationRestult);
        assertEquals(6,divisionResult);
    }
}

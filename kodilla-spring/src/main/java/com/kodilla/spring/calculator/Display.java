package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double value) {
        System.out.println("Result: " + value);
}
}


//Klasa Display powinna mieć metodę displayValue(double val), która otrzymaną wartość wyświetla na ekranie konsoli.
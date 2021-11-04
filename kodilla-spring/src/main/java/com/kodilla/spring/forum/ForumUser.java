package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {


    public String getUsername() {
        return "John Smith";
    }
}


//Klasa powinna mieć pole username typu String inicjowane w konstruktorze wartością "John Smith"
// (nie przekazuj tego jako parametr – wpisz to w konstruktorze "na sztywno"). Oznacz klasę jako @Component.
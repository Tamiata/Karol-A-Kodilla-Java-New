package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Martin Shultz");
        User zGeneration = new ZGeneration("Frans Timmermans");
        User yGeneration = new YGeneration("Ursula von der Leyen");

        //When
        System.out.println("Millenials use: " + millenials.share());
        System.out.println("Z Gen is using : " + zGeneration.share());
        System.out.println("Y Gen is using :" + yGeneration.share());

        //Then
        assertEquals("Twitter", millenials.share());
        assertEquals("Snapchat", zGeneration.share());
        assertEquals("Facebook", yGeneration.share());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Martin Shultz");
        User zGeneration = new ZGeneration("Frans Timmermans");
        User yGeneration = new YGeneration("Ursula von der Leyen");

        //When
        millenials.setSocialMediaType(new SnapchatPublisher());

        //Then
        assertEquals("Snapchat", millenials.share());
        assertEquals("Snapchat", zGeneration.share());
        assertEquals("Facebook", yGeneration.share());

        System.out.println("Millenials use: " + millenials.share());
        System.out.println("Z Gen is using : " + zGeneration.share());
        System.out.println("Y Gen is using :" + yGeneration.share());

    }
}

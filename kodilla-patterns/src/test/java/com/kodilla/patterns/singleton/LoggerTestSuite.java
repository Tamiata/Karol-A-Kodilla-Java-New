package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testLastLog() {
        //Given
        //When
        Logger lastLog = Logger.INSTANCE;
        lastLog.log("Test log");
        //Then
        assertEquals("Test log", lastLog.getLastLog());
    }
}

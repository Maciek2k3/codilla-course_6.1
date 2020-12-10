package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void setLogger() {
        logger = Logger.INSTANCE;
        logger.log("Log1");
    }

    @Test
    void testGetLog() {
        //Given
        logger = Logger.INSTANCE;
        // When
        String loggin = logger.getLastLog();
        //Then
        assertEquals("Log1", loggin);
    }

}

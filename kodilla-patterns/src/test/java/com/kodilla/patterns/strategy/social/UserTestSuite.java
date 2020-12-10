package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //GIVEN
        User maciek = new Millenials("Maciek");
        User tomek = new YGeneration("Tomek");
        User greg = new ZGeneration("Greg");
        //WHEN
        String maciekSocial = maciek.social();
        String tomekSocial = tomek.social();
        String gregSocial = greg.social();
        //THEN
        assertEquals("Using Facebook", maciekSocial);
        assertEquals("Using Snapchat", tomekSocial);
        assertEquals("Using Twitter", gregSocial);

    }

    @Test
    void testIndividualSharingStrategy() {
        //GIVEN
        User maciek = new Millenials("Maciek");
        //WHEN
        String maciekSocial = maciek.social();
        maciek.setSocialPublisher(new TwitterPublisher());
        maciekSocial = maciek.social();
        //THEN
        assertEquals("Using Twitter", maciekSocial);

    }
}

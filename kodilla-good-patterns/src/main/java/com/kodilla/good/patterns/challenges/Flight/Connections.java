package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Connections {

   private HashSet<Airports> flightsAvailable;

    public Connections(HashSet<Airports> flightsAvailable) {
        this.flightsAvailable = flightsAvailable;
    }

    public HashSet<Airports> getFlightsAvailable() {
        return flightsAvailable;
    }
}



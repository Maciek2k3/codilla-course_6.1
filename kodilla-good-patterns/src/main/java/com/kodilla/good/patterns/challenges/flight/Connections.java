package com.kodilla.good.patterns.challenges.flight;

import java.util.Set;

public class Connections {

   private Set<Flight> flightsAvailable;

    public Connections(Set<Flight> flightsAvailable) {
        this.flightsAvailable = flightsAvailable;
    }

    public Set<Flight> getFlightsAvailable() {
        return flightsAvailable;
    }
}



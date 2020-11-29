package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashMap;
import java.util.Map;

public class Connections {

    private Airports airports;

    public Map<String, String> fillDB() {
        Map<String, String> conections = new HashMap<>();
        conections.put(airports.getDepartureAirport(), airports.getArrivalAirport());
        return conections;
    }


}


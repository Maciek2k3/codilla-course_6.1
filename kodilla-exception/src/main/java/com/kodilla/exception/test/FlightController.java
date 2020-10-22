package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightController {
    private Map<String, Boolean> mapA;

    public FlightController() {
        mapA = addMapA();
    }

    boolean airport(String name) throws RouteNotFoundException {
        if (mapA.containsKey(name)) {
            return mapA.get(name);
        } else
            throw new RouteNotFoundException("No flight");
    }

    public boolean routeAirport(Flight flight) throws RouteNotFoundException {
        return airport(flight.getArrivalAirport()) && airport(flight.getDepartureAirport());
    }

    public Map<String, Boolean> addMapA() {
        Map<String, Boolean> airdata = new HashMap<>();
        airdata.put("WAW", true);
        airdata.put("KRK", true);
        airdata.put("LUB", false);

        return airdata;
    }
}



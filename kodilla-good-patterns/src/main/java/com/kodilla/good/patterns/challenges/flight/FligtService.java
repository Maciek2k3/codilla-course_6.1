package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FligtService {
    private Connections connections;

    public FligtService(Connections connections) {
        this.connections = connections;
    }

    public Set<Flight> routeFrom(String departure) {
        return connections.getFlightsAvailable().stream()
                .filter(e -> e.getDepartureAirport().equals(departure))
                .collect(Collectors.toSet());
    }

    public Set<Flight> routeTo(String arrival) {
        return connections.getFlightsAvailable().stream()
                .filter(e -> e.getArrivalAirport().equals(arrival))
                .collect(Collectors.toSet());
    }

    public List<Flight> routeConnecting(String departure, String arrival) {
        for (Flight flight : connections.getFlightsAvailable()) {
            if (flight.getDepartureAirport().equals(departure)) {
                List<Flight> result = new ArrayList<>();
                result.add(flight);
                for (Flight el : connections.getFlightsAvailable()) {
                    if ((flight.getArrivalAirport().equals(el.getDepartureAirport()) && el.getArrivalAirport().equals(arrival))) {
                        result.add(el);
                    }
                }
                if (result.size() == 2) {
                    return result;
                }
            }
        }
        return null;
    }
}



package com.kodilla.good.patterns.challenges.Flight;

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

    public Set<Airports> routeFrom(String departure) {
        return connections.getFlightsAvailable().stream().
                filter(e -> e.getDepartureAirport().
                        equals(departure)).collect(Collectors.toSet());
    }

    public Set<Airports> routeTo(String arrival) {
        return connections.getFlightsAvailable().stream().
                filter(e -> e.getArrivalAirport().
                        equals(arrival)).collect(Collectors.toSet());
    }

    public Set<List<Airports>> routeConnecting(String departure, String arrival) {
        Set<List<Airports>> flights = new HashSet<>();
        for (Airports flight : connections.getFlightsAvailable()) {
            if (flight.getDepartureAirport().equals(departure)) {
                List<Airports> via = new ArrayList<>();
                for (Airports el : connections.getFlightsAvailable()) {
                    if ((flight.getArrivalAirport().equals(el.getDepartureAirport()) && el.getArrivalAirport().equals(arrival))) {
                        via.add(el);
                    }
                    if (via.size() > 0) {
                        List<Airports> routes = new ArrayList<>();
                        routes.add(flight);
                        routes.addAll(via);
                        flights.add(routes);
                    }
                }

            }
        }
        return flights;
    }
}



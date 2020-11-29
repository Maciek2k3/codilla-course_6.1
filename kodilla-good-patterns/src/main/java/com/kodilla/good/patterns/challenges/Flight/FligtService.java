package com.kodilla.good.patterns.challenges.Flight;

import java.util.ArrayList;
import java.util.Map;

public class FligtService {
    private Connections connections;
    String departure;
    String arrival;
    ArrayList<String> viaConnection;

    public FligtService(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Connections getConnections() {
        return connections;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public FligtService(Connections connections) {
        this.connections = connections;
    }

    public boolean flightSercherDepatrutre(String departure) {
        if (connections.fillDB().entrySet().stream().map(Map.Entry::getKey).equals(departure)) {
            return true;
        } else {
            System.out.println("no Departure Flight");
            return false;
        }
    }

    public boolean flightSercherArrival(String arrival) {
        if (connections.fillDB().entrySet().stream().map(Map.Entry::getValue).equals(arrival)) {
            return true;
        } else {
            System.out.println("no Arrival Flight");
            return false;
        }
    }

    public void flightRoute() {
        if (flightSercherDepatrutre(departure) == true && flightSercherArrival(arrival) == true) {
            System.out.println("We found your flight");
            viaConnection.add(connections.fillDB().entrySet().stream().map(Map.Entry::getValue).toString());
        } else {
            System.out.println("Not find Flight");
            connectionFlight();
        }
    }

    public void connectionFlight() {
        if (viaConnection.get(0).equals(connections.fillDB().entrySet().stream().map(Map.Entry::getKey).equals(departure))) {
            System.out.println("We found flight via" + viaConnection.get(0));
        } else {
            System.out.println("No connnecting flights");
        }

    }
}



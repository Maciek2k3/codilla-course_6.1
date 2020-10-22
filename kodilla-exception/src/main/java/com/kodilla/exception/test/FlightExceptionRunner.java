package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;
import com.kodilla.exception.nullpointer.MessageSender;
import com.kodilla.exception.nullpointer.User;

import java.util.HashMap;
import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        FlightController flightController=new FlightController();
        try {
          flightController.airport("ABC");
        } catch (RouteNotFoundException e) {
            System.out.println("Fly is NOK," +
                    "but my program still running very well!");
        }

    }
}


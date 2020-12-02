package com.kodilla.good.patterns.challenges.flight;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightTest {
    private static FligtService fligtService;
    private static Connections connectionsMock;
    private static Set<Flight> flightsAvailable;

    @BeforeClass
    public static void beforeClass() {
        flightsAvailable = new HashSet<>();
        flightsAvailable.add(new Flight("WAW", "RAD"));
        flightsAvailable.add(new Flight("KRK", "GDN"));
        flightsAvailable.add(new Flight("GDN", "WRO"));
        connectionsMock = mock(Connections.class);
        when(connectionsMock.getFlightsAvailable()).thenReturn(flightsAvailable);
        fligtService = new FligtService(connectionsMock);
    }

    @Test
    public void shouldReturnFlightsFromTest() {
        //given
        String departure = "WAW";

        //when
        Set<Flight> sum = fligtService.routeFrom(departure);

        //then
        Set<Flight> expect = Set.of(new Flight("WAW", "RAD"));
        Assert.assertEquals(expect, sum);
    }

    @Test
    public void shouldReturnNoFlightsFromTest() {
        //given
        String departure = "LUB";

        //when
        Set<Flight> sum = fligtService.routeFrom(departure);

        //then
        Set<Flight> expect = Collections.emptySet();
        Assert.assertEquals(expect, sum);
    }

    @Test
    public void shouldReturnflightTestTO() {
        //gien
        String arrival = "WRO";
        //when
        Set<Flight> sum = fligtService.routeTo(arrival);
        //then
        Set<Flight> expect = Set.of(new Flight("GDN", "WRO"));
        Assert.assertEquals(expect, sum);
    }

    @Test
    public void shouldNoReturnflightTestTO() {
        //gien
        String arrival = "LUB";
        //when
        Set<Flight> sum = fligtService.routeTo(arrival);
        //then
        Set<Flight> expect = Collections.emptySet();
        Assert.assertEquals(expect, sum);
    }


    @Test
    public void shouldFindConnectingFlight() {
        //given
        String departure = "KRK";
        String arrival = "WRO";

        //when
        List<Flight> sum = fligtService.routeConnecting(departure, arrival);

        //then
        List<Flight> expect = new ArrayList<>();
        expect.add(new Flight("KRK", "GDN"));
        expect.add(new Flight("GDN", "WRO"));
        Assert.assertEquals(expect, sum);
    }

    @Test
    public void shouldNotFindFirstFlight() {
        //given
        String departure = "TEST";
        String arrival = "WRO";

        //when
        List<Flight> sum = fligtService.routeConnecting(departure, arrival);

        //then
        Assert.assertNull(sum);
    }

    @Test
    public void shouldNotFindSecondFlight() {
        //given
        String departure = "KRK";
        String arrival = "TEST";

        //when
        List<Flight> sum = fligtService.routeConnecting(departure, arrival);

        //then
        Assert.assertNull(sum);
    }
}

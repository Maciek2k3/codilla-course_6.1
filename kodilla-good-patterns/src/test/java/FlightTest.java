import com.kodilla.good.patterns.challenges.Flight.Airports;
import com.kodilla.good.patterns.challenges.Flight.Connections;
import com.kodilla.good.patterns.challenges.Flight.FligtService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightTest {
    private static FligtService fligtService;
    private static Connections connectionsMock;
    private static Set<Airports> flightsAvailable;

    @BeforeClass
    public static void beforeClass() {
        connectionsMock = mock(Connections.class);
        fligtService = new FligtService(connectionsMock);
        flightsAvailable = new HashSet<Airports>();
        flightsAvailable.add(new Airports("WAW", "RAD"));
        flightsAvailable.add(new Airports("KRK", "GDN"));
        flightsAvailable.add(new Airports("GDN", "WRO"));
    }

    @Test
    public void flightTest() {
        String departure = "WAW";
        Set<Airports> expect = new HashSet<>();
        expect.add(new Airports("WAW", "RAD"));
        when(connectionsMock.getFlightsAvailable()).thenReturn((HashSet<Airports>) flightsAvailable);
        Set<Airports> sum = fligtService.routeFrom(departure);
        Assert.assertEquals(expect, sum);

    }

    @Test
    public void flightTestTO() {
        String arrival = "WRO";
        Set<Airports> expect = new HashSet<>();
        expect.add(new Airports("GDN", "WRO"));
        when(connectionsMock.getFlightsAvailable()).thenReturn((HashSet<Airports>) flightsAvailable);
        Set<Airports> sum = fligtService.routeTo(arrival);
        Assert.assertEquals(expect, sum);
    }

    @Test
    public void conectingFlight() {
        String departure = "WAW";
        String arrival = "WRO";
        Set<List<Airports>> expect = new HashSet<>();
        List<Airports> connecting = new ArrayList<>();
        connecting.add(new Airports("WAW", "GDN"));
        connecting.add(new Airports("GDN", "WRO"));
        expect.add(connecting);
        when(connectionsMock.getFlightsAvailable()).thenReturn((HashSet<Airports>) flightsAvailable);
        Set<List<Airports>> sum=fligtService.routeConnecting(departure,arrival);
        Assert.assertEquals(expect,sum);
    }
}

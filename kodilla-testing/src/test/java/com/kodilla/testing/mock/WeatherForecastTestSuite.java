package com.kodilla.testing.mock;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("Test sensors")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test averange")
    @Test
    void testCalculateForecastWithMockAverange() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 5.0);
        temperaturesMap.put("Krakow", 5.0);
        temperaturesMap.put("Wroclaw", 8.0);
        temperaturesMap.put("Warszawa", 5.0);
        temperaturesMap.put("Gdansk", 5.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double ar = weatherForecast.calculateForecast().size();
        double avarange = (((weatherForecast.calculateForecast().values().stream().mapToInt(i -> i.intValue()).sum()))) / ar;

        //Then
        assertThat(5.6).isEqualTo(avarange);
    }

    @DisplayName("Test median")
    @Test
    void testCalculateForecastWithMockMedian() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 3.0);
        temperaturesMap.put("Krakow", 2.0);
        temperaturesMap.put("Wroclaw", 1.0);
        temperaturesMap.put("Warszawa", 4.0);
        temperaturesMap.put("Gdansk", 5.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        SortedSet<Double> sort = new TreeSet<Double>(weatherForecast.calculateForecast().values());
        List<Double> list = new ArrayList<>();
        double median;
        for (Double st : sort) {
            list.add(st);
        }
        if (sort.size() % 2 == 0) {
            median = (list.get(sort.size() / 2) + list.get(sort.size() / 2 - 1)) / 2;
        } else
            median = list.get(sort.size() / 2);

        //Then
        assertThat(3.0).isEqualTo(median);
    }
}


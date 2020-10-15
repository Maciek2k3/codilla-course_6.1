package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        //Given
        List<Continent> continents = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", new BigDecimal(500000000)));
        countries.add(new Country("Germany", new BigDecimal(400000000)));
        continents.add(new Continent(countries, "Europe"));
        World world = new World(continents);
        world.getContinentList();


        //When
        BigDecimal peopleQuantity = world.getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream().map(country -> country.getPeopleQuantity()))
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal quantity = new BigDecimal("900000000");
        Assert.assertEquals(quantity, peopleQuantity);
    }
}


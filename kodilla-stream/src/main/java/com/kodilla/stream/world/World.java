package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinentList() {
        return continents;

    }

    public BigDecimal getPeopleQuantity() {
      BigDecimal peopleQuanti=continents.stream()
              .flatMap(continent -> continent.getCountryList().stream())
              .map(Country::getPeopleQuantity)
              .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
        return peopleQuanti;
    }
}

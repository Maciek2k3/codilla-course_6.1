package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private final List<Country> countryList;
    private final String continentName;

    public Continent(List<Country> countryList, String coninentName) {
        this.countryList = countryList;
        this.continentName = coninentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public boolean addCountry(Country country) {
        return countryList.add(country);
    }
}

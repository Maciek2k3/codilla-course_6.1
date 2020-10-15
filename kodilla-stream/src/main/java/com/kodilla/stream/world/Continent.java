package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countryList;
    private final String coninentName;

    public Continent(List<Country> countryList, String coninentName) {
        this.countryList = countryList;
        this.coninentName = coninentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public String getConinentName() {
        return coninentName;
    }
    public boolean addCountry (Country country){
        return countryList.add(country);
    }
}

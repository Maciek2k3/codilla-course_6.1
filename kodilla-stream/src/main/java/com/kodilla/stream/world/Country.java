package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuant=new BigDecimal(String.valueOf(peopleQuantity));
        return peopleQuant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return peopleQuantity == country.peopleQuantity &&
                Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, peopleQuantity);
    }
}

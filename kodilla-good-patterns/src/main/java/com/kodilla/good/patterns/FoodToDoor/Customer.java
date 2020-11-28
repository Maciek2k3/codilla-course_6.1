package com.kodilla.good.patterns.FoodToDoor;

public class Customer {
    private String name;
    private String surname;
    private int id;

    public Customer(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}

package com.kodilla.good.patterns.allegroOrder;

public class User {
    private String name;
    private String surname;
    private int id;

    public User(String name, String surname, int id) {
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

package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final String surname;
    private final List<Observer> observers;
    private final List<String> homeworks;

    public Student(String surname) {
        this.surname = surname;
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }
}


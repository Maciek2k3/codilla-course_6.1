package com.example.kodillaspring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<String> books = new ArrayList<>();


    private LibraryDbController libraryDbController;

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {

    }

    public void saveTodata() {
        libraryDbController.saveData();
    }

    public void loadData() {
        libraryDbController.loadData();
    }
}

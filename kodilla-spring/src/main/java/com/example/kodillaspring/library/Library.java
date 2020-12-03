package com.example.kodillaspring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books = new ArrayList<>();
    @Autowired
    private LibraryDbController libraryDbController;

    public void saveTodata() {
        libraryDbController.saveData();
    }

    public void loadData() {
        libraryDbController.loadData();
    }
}

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;


import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BookAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("no", "no", 1988, "sign"));
        bookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("no", "no", 1988, "sign"));
        bookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("no", "no", 2001, "sign"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(1988,median,0);
    }
}

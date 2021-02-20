package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasyfier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasyfier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book book1 =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getSignature(), book.getPublicationYear());
            bookMap.put(new BookSignature(book.getSignature()), book1);
        }
        return medianPublicationYear(bookMap);
    }
}


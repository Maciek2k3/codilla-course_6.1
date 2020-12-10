package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {
    @Test
    public void libraryTest() {
        //given

        Book book1 = new Book("NoName", "NoName", LocalDate.of(1998, 10, 23));
        Book book2 = new Book("NoName", "NoName", LocalDate.of(1998, 10, 23));
        Book book3 = new Book("NoName", "NoName", LocalDate.of(1998, 10, 23));
        Library library = new Library("Books");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}

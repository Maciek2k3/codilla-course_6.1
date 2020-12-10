package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.setBooks(new HashSet<>());
        for (Book book : getBooks()) {
            cloneLibrary.addBook(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return cloneLibrary;
    }
}

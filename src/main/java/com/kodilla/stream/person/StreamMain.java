package com.kodilla.stream.person;


import com.kodilla.stream.book.BookDirectory;

public class StreamMain {
    public static void main(String[] args) {

        BookDirectory bookDirectory = new BookDirectory();

        bookDirectory.getBook().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

    }

}

package com;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

   private static LibraryService instance;
    private List<Book> books = new ArrayList<>();

    private LibraryService() {}

    public static synchronized LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title, User user) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else if (book instanceof BorrowBookInterface) {
            BorrowBookInterface borrowable = (BorrowBookInterface) book;
            if (!borrowable.isAvailable()) {
                System.out.println(title + " is not available.");
            } else {
                borrowable.borrowBook(user);
            }
        } else {
            System.out.println(title + " cannot be borrowed (not borrowable).");
        }
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else if (book instanceof BorrowBookInterface) {
            ((BorrowBookInterface) book).returnBook();
        } else {
            System.out.println(title + " cannot be returned (not borrowable).");
        }
    }
}

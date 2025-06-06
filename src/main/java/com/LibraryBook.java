package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class LibraryBook extends Book implements BorrowBookInterface {
    private boolean isAvailable;

    public LibraryBook(String title) {
        super(title);
        this.isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        notifyObservers("Book " + getTitle() + " is now available");
    }

    // Observer pattern implementation
    // This class can notify observers about changes in the book's availability
    List<Observer> observers = new ArrayList<>();

    public void notifyObservers(String msg) {
        for (Observer o : observers)
            o.update(null, msg);
    }

    public void addObserver(UserObserver o) {
        observers.add((Observer) o);
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }
}

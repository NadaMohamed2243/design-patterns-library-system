package com;

// Convert external JSON to our book entity
public class ExternalBookAdapter extends LibraryBook {
    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.getBookTitle());
        this.setAvailable(externalBook.isBorrowable());
    }
}

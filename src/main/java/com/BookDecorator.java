package com;

abstract class BookDecorator implements BorrowBookInterface {
    BorrowBookInterface originalBook;

    public BookDecorator(BorrowBookInterface book) {  // dependency injection
        this.originalBook = book;
    }

    @Override
    public void borrowBook(User user) {
        originalBook.borrowBook(user);
    }

    @Override
    public void returnBook() {
        originalBook.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return originalBook.isAvailable();
    }

    @Override
    public void setAvailable(boolean available) {
        originalBook.setAvailable(available);
    }
}

package com;

public class PremiumBook extends BookDecorator {

    public PremiumBook(BorrowBookInterface originalBook) {
        super(originalBook);
    }

    @Override
    public void borrowBook(User user) {
        originalBook.borrowBook(user); 
        System.out.println("Extra 10 days granted for premium users.");
    }

    @Override
    public void returnBook() {
        originalBook.returnBook();
        System.out.println("Extra 10 days granted for premium users.");
    }
}

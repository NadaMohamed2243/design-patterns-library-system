package com;

public interface BorrowBookInterface{
    boolean isAvailable();
     void setAvailable(boolean available);
    void borrowBook(User user);
    void returnBook();
}

package com;

public class LibraryBook extends Book implements BorrowBookInterface{
    private boolean isAvailable;

    public LibraryBook(String title) {
        super(title);
        this.isAvailable = true;
    }


    @Override
    public boolean isAvailable(){
        return isAvailable;
    }
    @Override 
    public void setAvailable(boolean available){
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
    }
}

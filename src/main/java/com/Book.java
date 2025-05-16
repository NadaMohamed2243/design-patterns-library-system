package com;

public class Book implements BookInterface{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String getTitle() {
        return title;
    }

}

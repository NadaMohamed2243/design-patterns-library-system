package com;

public class UserObserver implements ObserverInterface {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}

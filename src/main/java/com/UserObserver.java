package com;

public class UserObserver implements ObserverInterface {
    private User user;

    public UserObserver(User user) {
        this.user = user;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + user.getName() + ": " + message);
    }
}

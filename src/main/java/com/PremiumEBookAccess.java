package com;

public class PremiumEBookAccess implements AccessStrategyInterface {

    @Override
    public void access(User user) {
        if (user.isPremium()) {
            System.out.println("Premium access granted to eBook.");
        } else {
            System.out.println("Upgrade to premium to access this eBook.");
        }
    }
}

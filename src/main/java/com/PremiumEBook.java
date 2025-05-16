package com;

public class PremiumEBook extends EBook {
    private EBook ebook;

    public PremiumEBook(EBook ebook) {
        super(ebook.getTitle());
        this.ebook = ebook;
    }

    public void accessPremiumContent(User user) {
        if(user.isPremium()) {
            System.out.println("Premium content unlocked for " + user.getName() + " on ebook " + ebook.getTitle());
        } else {
            System.out.println("Upgrade to premium to access extra content.");
        }
    }

    @Override
    public String getTitle() {
        return ebook.getTitle();
    }
}


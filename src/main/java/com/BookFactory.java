package com;

public class BookFactory {
    public static Book createBook(String type, String title) {
        if (type.toLowerCase() == "physical") {
            return new PhysicalBook(title);
        } else if (type.toLowerCase() == "historical") {
            return new HistoricalBook(title);
        } else if (type.toLowerCase() == "ebook") {
            return new EBook(title);
        } else {
            throw new IllegalArgumentException("Unknown book type");
        }
    }
}

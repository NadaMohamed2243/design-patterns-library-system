package com;

public class BookFactory {
    public static Book createBook(String type, String title) {
        if ("physical".equalsIgnoreCase(type)) {
            return new PhysicalBook(title);
        } else if ("historical".equalsIgnoreCase(type)) {
            return new HistoricalBook(title);
        } else if ("ebook".equalsIgnoreCase(type)) {
            return new EBook(title);
        }
        throw new IllegalArgumentException("Unknown book type: " + type);
    }
}

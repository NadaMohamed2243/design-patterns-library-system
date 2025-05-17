package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();
        // Book book = new Book("Harry Potter");
        // Book physicalBook = new PhysicalBook("Lord of the Rings");
        // Book historicalBook = new HistoricalBook("Outlander");
        Book physicalBook = BookFactory.createBook("physical", "Lord of the Rings");
        Book historicalBook = BookFactory.createBook("historical", "Outlander");
        Book book = BookFactory.createBook("ebook", "Digital Fortress");
        // library.addBook(book);
        // library.addBook(physicalBook);
        library.addBook(physicalBook);
        library.addBook(historicalBook);
        library.addBook(book);

        // Create users
        User john = new User("John", false);
        User Alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john);
        System.out.printf("\n" + "=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", john);
        System.out.println("=============================");
        // library.returnBook("Lord of the Rings")
        library.borrowBook("math", john);
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", Alice);
        System.out.println("=============================");
        library.borrowBook("Outlander", Alice);
        System.out.println("=============================");
        library.addBook(historicalBook);
        library.borrowBook("Outlander", Alice);

        BorrowBookInterface premiumBook = new PremiumBook(new LibraryBook("Outlander"));
        premiumBook.borrowBook(Alice);
        System.out.println("=============================");
        premiumBook.returnBook();
        System.out.println("=============================");
        library.borrowBook("Digital Fortress", Alice);
        System.out.println("=============================");
        library.borrowBook("Digital Fortress", john);
        System.out.println("=============================");
        library.returnBook("Digital Fortress");
        System.out.println("=============================");

        Approver librarian = new Librarian();
        Approver manager = new Manager();
        Approver director = new Director();
        librarian.setNext(manager);
        manager.setNext(director);

        librarian.approveRequest("Design Patterns", 5); // Librarian approves
        librarian.approveRequest("Design Patterns", 10); // Manager approves
        librarian.approveRequest("Design Patterns", 20); // Director approves

        User premiumUser = new User("Alice", true);
        User regularUser = new User("John", false);

    
        library.fullBorrowProcess(premiumUser, "Digital Fortress", 10);

    
        try {
            library.fullBorrowProcess(regularUser, "Digital Fortress", 5);
        } catch (PremiumRequiredException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
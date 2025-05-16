package com;

public class Librarian extends Approver {
    @Override
    public void approveRequest(String bookTitle, int days) {
        if (days <= 7) {
            System.out.println("Librarian approved the borrowing request for " + bookTitle);
        } else if (next != null) {
            next.approveRequest(bookTitle, days);
        }
        else {
            System.out.println("Request rejected: not enough authority.");
        }
    }
}

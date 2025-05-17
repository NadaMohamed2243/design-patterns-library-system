package com;

public class Manager extends Approver {
    @Override
    public void approveRequest(String bookTitle, int days) {
        if (days <= 14) {
            System.out.println("Manager approved the borrowing request for " + bookTitle);
        } else if (next != null) {
            next.approveRequest(bookTitle, days);
        } else {
            System.out.println("Request rejected: not enough authority.");
        }
    }
}

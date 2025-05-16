package com;

public class Director extends Approver {
    @Override
    public void approveRequest(String bookTitle, int days) {
        if (days > 14) {
            System.out.println("Director approved the borrowing request for " + bookTitle);
        } else {
            System.out.println("Request rejected: not enough authority.");
            if (next != null) {
                next.approveRequest(bookTitle, days);
            } else {
                System.out.println("No further approvers available.");
            }
        }
    }
}

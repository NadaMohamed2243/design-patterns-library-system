package com;

public abstract class Approver {
    protected Approver next;

    public Approver setNext(Approver next) {
        this.next = next;
        return next;
    }

    public abstract void approveRequest(String bookTitle, int days);
}


package com.gap.scms.domain;

public class Ticket {
    private final String description;

    public static Ticket ticket(String description) {
        return new Ticket(description);
    }

    public Ticket(String description) {
        this.description = description;
    }
}

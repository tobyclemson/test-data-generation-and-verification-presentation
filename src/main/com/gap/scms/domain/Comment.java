package com.gap.scms.domain;

public class Comment {
    private String value;

    public static Comment comment(String value) {
        return new Comment(value);
    }

    public Comment(String value) {
        this.value = value;
    }
}

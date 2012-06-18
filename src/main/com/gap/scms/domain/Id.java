package com.gap.scms.domain;

public class Id {
    private final Integer value;

    public static Id id(Integer value) {
        return new Id(value);
    }

    public Id(Integer value) {
        this.value = value;
    }
}

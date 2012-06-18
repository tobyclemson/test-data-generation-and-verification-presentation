package com.gap.scms.domain;

import java.math.BigDecimal;

public class Duty {
    private final BigDecimal duty;

    public static Duty duty(String duty) {
        return new Duty(duty);
    }

    public Duty(String duty) {
        this.duty = new BigDecimal(duty);
    }
}

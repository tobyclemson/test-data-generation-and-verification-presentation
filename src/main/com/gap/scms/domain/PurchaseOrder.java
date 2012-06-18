package com.gap.scms.domain;

import java.math.BigDecimal;
import java.util.Set;

import static com.gap.scms.domain.Item.toQuantity;
import static org.javafunk.funk.Eagerly.sum;
import static org.javafunk.funk.Lazily.map;

public class PurchaseOrder {
    private final Integer id;
    private final String status;
    private final String shippingMethod;
    private final BigDecimal duty;
    private final String garmentType;
    private final String ticket;
    private final Set<Item> items;
    private final String comment;

    public PurchaseOrder(
            Integer id,
            String status,
            String shippingMethod,
            BigDecimal duty,
            String garmentType,
            String ticket,
            Set<Item> items,
            String comment) {
        this.id = id;
        this.status = status;
        this.shippingMethod = shippingMethod;
        this.duty = duty;
        this.garmentType = garmentType;
        this.ticket = ticket;
        this.items = items;
        this.comment = comment;
    }

    public Integer getTotalQuantity() {
        return sum(map(items, toQuantity()));
    }
}

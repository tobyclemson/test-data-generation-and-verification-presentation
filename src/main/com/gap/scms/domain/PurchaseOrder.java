package com.gap.scms.domain;

import java.util.Set;

import static com.gap.scms.domain.Item.toQuantity;
import static org.javafunk.funk.Eagerly.sum;
import static org.javafunk.funk.Lazily.map;

public class PurchaseOrder {
    private final Id id;
    private final Status status;
    private final ShippingMethod shippingMethod;
    private final Duty duty;
    private final GarmentType garmentType;
    private final Ticket ticket;
    private final Set<Item> items;
    private final Comment comment;

    public PurchaseOrder(
            Id id,
            Status status,
            ShippingMethod shippingMethod,
            Duty duty,
            GarmentType garmentType,
            Ticket ticket,
            Set<Item> items,
            Comment comment) {
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

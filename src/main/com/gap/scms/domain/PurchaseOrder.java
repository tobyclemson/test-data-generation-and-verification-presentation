package com.gap.scms.domain;

import java.util.Set;

import static com.gap.scms.domain.Item.toQuantity;
import static org.javafunk.funk.Eagerly.sum;
import static org.javafunk.funk.Lazily.map;

public class PurchaseOrder {
    private Set<Item> items;

    public PurchaseOrder(Set<Item> items) {
        this.items = items;
    }

    public Integer getTotalQuantity() {
        return sum(map(items, toQuantity()));
    }
}

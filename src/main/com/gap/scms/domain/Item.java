package com.gap.scms.domain;

import lombok.Getter;
import org.javafunk.funk.functors.Mapper;

public class Item {
    @Getter private String name;
    @Getter private Integer quantity;

    public Item(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    static Mapper<Item, Integer> toQuantity() {
        return new Mapper<Item, Integer>() {
            @Override public Integer map(Item item) {
                return item.getQuantity();
            }
        };
    }
}

package com.gap.scms.domain;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.javafunk.funk.Literals.setWith;

public class PurchaseOrderTest {
    @Test
    public void shouldCalculateTotalOrderQuantityFromItemQuantities() {
        // Given
        Item smallPants = new Item("Small Pants", 10);
        Item largePants = new Item("Large Pants", 12);
        Set<Item> items = setWith(smallPants, largePants);

        PurchaseOrder purchaseOrder = new PurchaseOrder(items);

        // When
        Integer totalQuantity = purchaseOrder.getTotalQuantity();

        // Then
        assertThat(totalQuantity, is(22));
    }
}

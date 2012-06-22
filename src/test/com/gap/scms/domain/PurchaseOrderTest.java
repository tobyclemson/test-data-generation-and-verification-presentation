package com.gap.scms.domain;

import org.junit.Test;

import static com.gap.scms.domain.Id.id;
import static com.gap.scms.domain.Item.item;
import static com.gap.scms.domain.PurchaseOrderBuilder.purchaseOrderBuilder;
import static com.gap.scms.domain.Status.Draft;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PurchaseOrderTest {
    @Test
    public void shouldCalculateTotalOrderQuantityFromItemQuantities() {
        // Given
        PurchaseOrder purchaseOrder = purchaseOrderBuilder()
                .withItems(
                        item("Small Pants", 10),
                        item("Large Pants", 12))
                .build();

        // When
        Integer totalQuantity = purchaseOrder.getTotalQuantity();

        // Then
        assertThat(totalQuantity, is(22));
    }

    @Test
    public void shouldExerciseBuilderSoMethodAreUsed() throws Exception {
        purchaseOrderBuilder()
                .withId(id(12345))
                .withStatus(Draft)
                .build();
    }
}

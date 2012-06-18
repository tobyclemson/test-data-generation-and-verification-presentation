package com.gap.scms.domain;

import java.util.Set;

import static com.gap.scms.domain.Comment.comment;
import static com.gap.scms.domain.Duty.duty;
import static com.gap.scms.domain.GarmentType.garmentType;
import static com.gap.scms.domain.Id.id;
import static com.gap.scms.domain.Item.item;
import static com.gap.scms.domain.ShippingMethod.Air;
import static com.gap.scms.domain.Status.Draft;
import static com.gap.scms.domain.Ticket.ticket;
import static org.javafunk.funk.Literals.setBuilderWith;
import static org.javafunk.funk.Literals.setWith;

    public class PurchaseOrderBuilder {
        private Id id = id(1000065);
        private Status status = Draft;
        private ShippingMethod shippingMethod = Air;
        private Duty duty = duty("10.5");
        private GarmentType garmentType = garmentType(10023, "Pants");
        private Ticket ticket = ticket("LP4 Men's Pants");
        private Set<Item> items = setWith(item("Large Pants", 5), item("Small Pants", 8));
        private Comment comment = comment("Heavy Denim");

        public static PurchaseOrderBuilder purchaseOrderBuilder() {
            return new PurchaseOrderBuilder();
        }

        public PurchaseOrder build() {
            return new PurchaseOrder(
                    id, status, shippingMethod, duty,
                    garmentType, ticket, items, comment);
        }

        public PurchaseOrderBuilder withId(Id id) {
            this.id = id;
            return this;
        }

        public PurchaseOrderBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PurchaseOrderBuilder withShippingMethod(ShippingMethod shippingMethod) {
            this.shippingMethod = shippingMethod;
            return this;
        }

        public PurchaseOrderBuilder withDuty(Duty duty) {
            this.duty = duty;
            return this;
        }

    public PurchaseOrderBuilder withGarmentType(GarmentType garmentType) {
        this.garmentType = garmentType;
        return this;
    }

    public PurchaseOrderBuilder withTicket(Ticket ticket) {
        this.ticket = ticket;
        return this;
    }

    public PurchaseOrderBuilder withItems(Set<Item> items) {
        this.items = items;
        return this;
    }

    public PurchaseOrderBuilder withItems(Item first, Item... rest) {
        this.items = setBuilderWith(first).and(rest).build();
        return this;
    }

    public PurchaseOrderBuilder withComment(Comment comment) {
        this.comment = comment;
        return this;
    }
}

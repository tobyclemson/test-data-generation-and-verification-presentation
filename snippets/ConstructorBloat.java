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

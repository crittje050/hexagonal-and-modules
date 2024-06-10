package domain;

import java.util.UUID;

public class Order {

    private final UUID orderId;
    private final String customerName;

    public Order(String customerName) {
        this.orderId = UUID.randomUUID();

        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("customerName cannot be null or empty");
        }

        this.customerName = customerName;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
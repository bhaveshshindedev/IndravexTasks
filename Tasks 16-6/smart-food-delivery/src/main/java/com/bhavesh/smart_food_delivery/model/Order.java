package com.bhavesh.smart_food_delivery.model;

public class Order {
    private int orderId;
    private String customerName;
    private double amount;
    private String status;

    public Order(int orderId, String customerName, double amount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}

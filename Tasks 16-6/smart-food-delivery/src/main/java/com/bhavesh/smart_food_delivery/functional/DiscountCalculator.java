package com.bhavesh.smart_food_delivery.functional;

@FunctionalInterface
public interface DiscountCalculator {
    double calculateDiscount(double amount);

    default void showMessage() {
        System.out.println("Discount Applied Successfully");
    }

    static void companyPolicy() {
        System.out.println("Discount policy active");
    }
}

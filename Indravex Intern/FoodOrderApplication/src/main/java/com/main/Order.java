package com.main;

import java.util.ArrayList;

class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to order.");
    }

    public void viewOrder() {
        if (items.isEmpty()) {
            System.out.println("No items in order.");
            return;
        }

        System.out.println("\n----- ORDER SUMMARY -----");
        for (MenuItem item : items) {
            System.out.println(item.getItemName() + " - ₹" + item.getPrice());
        }

        System.out.println("Total Amount: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

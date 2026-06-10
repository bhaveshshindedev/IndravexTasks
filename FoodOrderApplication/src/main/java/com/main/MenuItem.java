package com.main;

class MenuItem {
    private int itemId;
    private String itemName;
    private double price;

    public MenuItem(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return itemId + ". " + itemName + " - ₹" + price;
    }
}
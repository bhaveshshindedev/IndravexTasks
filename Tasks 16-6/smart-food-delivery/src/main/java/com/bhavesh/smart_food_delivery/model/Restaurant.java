package com.bhavesh.smart_food_delivery.model;

public class Restaurant {
    private int restaurantId;
    private String restaurantName;
    private double rating;
    private String city;

    public Restaurant(int restaurantId, String restaurantName, double rating, String city) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.city = city;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }



    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public double getRating() {
        return rating;
    }

    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                '}';
    }
}
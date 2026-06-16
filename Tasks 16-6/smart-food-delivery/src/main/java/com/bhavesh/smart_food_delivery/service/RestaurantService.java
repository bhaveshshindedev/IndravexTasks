package com.bhavesh.smart_food_delivery.service;

import com.bhavesh.smart_food_delivery.functional.DiscountCalculator;
import com.bhavesh.smart_food_delivery.model.MenuItem;
import com.bhavesh.smart_food_delivery.model.Order;
import com.bhavesh.smart_food_delivery.model.Restaurant;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    public void executeTasks() {

        List<Restaurant> restaurants = Arrays.asList(
                new Restaurant(1, "Food Hub", 4.5, "Mumbai"),
                new Restaurant(2, "Spice Villa", 3.9, "Pune"),
                new Restaurant(3, "Burger Point", 4.7, "Delhi"),
                new Restaurant(4, "Pizza Corner", 4.2, "Mumbai")
        );

        List<MenuItem> menuItems = Arrays.asList(
                new MenuItem(1, "Burger", "Fast Food", 250),
                new MenuItem(2, "Pizza", "Italian", 450),
                new MenuItem(3, "Pasta", "Italian", 300),
                new MenuItem(4, "Sandwich", "Snacks", 150)
        );

        List<Order> orders = Arrays.asList(
                new Order(101, "Bhavesh", 1200, "COMPLETED"),
                new Order(102, "Amit", 700, "PENDING"),
                new Order(103, "Bhavesh", 2500, "COMPLETED"),
                new Order(104, "Riya", 1800, "COMPLETED")
        );

        task1(restaurants);

        task2(menuItems);

        task3(orders);

        task4();

        task5(restaurants);

        task6(restaurants, menuItems);

        task7();
    }

    /*
     * Task 1 : Restaurant Filtering
     */
    private void task1(List<Restaurant> restaurants) {

        System.out.println("\n========== TASK 1 ==========");

        System.out.println("\nAll Restaurants:");

        restaurants.forEach(System.out::println);

        System.out.println("\nRestaurants with Rating > 4.0:");

        restaurants.stream()
                .filter(r -> r.getRating() > 4.0)
                .forEach(System.out::println);

        System.out.println("\nSorted by Rating Desc:");

        restaurants.stream()
                .sorted(Comparator.comparing(Restaurant::getRating)
                        .reversed())
                .forEach(System.out::println);

        System.out.println("\nRestaurant Names:");

        List<String> names = restaurants.stream()
                .map(Restaurant::getRestaurantName)
                .collect(Collectors.toList());

        System.out.println(names);
    }

    /*
     * Task 2 : Menu Item Processing
     */
    private void task2(List<MenuItem> menuItems) {

        System.out.println("\n========== TASK 2 ==========");

        System.out.println("\nItems costing less than ₹300:");

        menuItems.stream()
                .filter(item -> item.getPrice() < 300)
                .forEach(System.out::println);

        System.out.println("\nItem Names in Uppercase:");

        menuItems.stream()
                .map(item -> item.getItemName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nTotal Menu Items:");

        long count = menuItems.stream().count();

        System.out.println(count);

        System.out.println("\nMost Expensive Item:");

        menuItems.stream()
                .max(Comparator.comparing(MenuItem::getPrice))
                .ifPresent(System.out::println);
    }

    /*
     * Task 3 : Customer Order Analysis
     */
    private void task3(List<Order> orders) {

        System.out.println("\n========== TASK 3 ==========");

        System.out.println("\nCompleted Orders:");

        orders.stream()
                .filter(order ->
                        order.getStatus().equalsIgnoreCase("COMPLETED"))
                .forEach(System.out::println);

        System.out.println("\nTotal Revenue:");

        double revenue = orders.stream()
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println("₹" + revenue);

        System.out.println("\nHighest Order:");

        orders.stream()
                .max(Comparator.comparing(Order::getAmount))
                .ifPresent(System.out::println);

        System.out.println("\nDistinct Customers:");

        orders.stream()
                .map(Order::getCustomerName)
                .distinct()
                .forEach(System.out::println);
    }

    /*
     * Task 4 : Functional Interface & Lambda
     */
    private void task4() {

        System.out.println("\n========== TASK 4 ==========");

        DiscountCalculator above1000 =
                amount -> amount * 0.10;

        DiscountCalculator below1000 =
                amount -> amount * 0.05;

        DiscountCalculator.companyPolicy();

        System.out.println("\n10% Discount on ₹1500:");

        System.out.println("₹" +
                above1000.calculateDiscount(1500));

        above1000.showMessage();

        System.out.println("\n5% Discount on ₹800:");

        System.out.println("₹" +
                below1000.calculateDiscount(800));

        below1000.showMessage();
    }

    /*
     * Task 5 : Optional
     */
    private void task5(List<Restaurant> restaurants) {

        System.out.println("\n========== TASK 5 ==========");

        Optional<Restaurant> foundRestaurant =
                restaurants.stream()
                        .filter(r ->
                                r.getRestaurantName()
                                        .equalsIgnoreCase("Food Hub"))
                        .findFirst();

        foundRestaurant.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Restaurant Not Found")
        );

        Optional<Restaurant> notFound =
                restaurants.stream()
                        .filter(r ->
                                r.getRestaurantName()
                                        .equalsIgnoreCase("ABC"))
                        .findFirst();

        notFound.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Restaurant Not Found")
        );
    }

    /*
     * Task 6 : Method References
     */
    private void task6(List<Restaurant> restaurants,
                       List<MenuItem> menuItems) {

        System.out.println("\n========== TASK 6 ==========");

        System.out.println("\nRestaurant Names:");

        restaurants.stream()
                .map(Restaurant::getRestaurantName)
                .forEach(System.out::println);

        System.out.println("\nMenu Items Sorted by Price:");

        menuItems.stream()
                .sorted(Comparator.comparing(MenuItem::getPrice))
                .forEach(System.out::println);
    }

    /*
     * Task 7 : Date and Time API
     */
    private void task7() {

        System.out.println("\n========== TASK 7 ==========");

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current Date & Time:");
        System.out.println(now);

        System.out.println("\nExpected Delivery Time:");
        System.out.println(now.plusMinutes(45));

        System.out.println("\nToday's Day:");
        System.out.println(LocalDate.now().getDayOfWeek());
    }
}

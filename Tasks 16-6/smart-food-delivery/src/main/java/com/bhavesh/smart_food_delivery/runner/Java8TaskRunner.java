package com.bhavesh.smart_food_delivery.runner;


import com.bhavesh.smart_food_delivery.service.RestaurantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Java8TaskRunner implements CommandLineRunner {

    private final RestaurantService foodDeliveryService;

    public Java8TaskRunner(RestaurantService foodDeliveryService) {
        this.foodDeliveryService = foodDeliveryService;
    }

    @Override
    public void run(String... args) {

        System.out.println("\n======================================");
        System.out.println(" SMART FOOD DELIVERY SYSTEM - JAVA 8 ");
        System.out.println("======================================");

        foodDeliveryService.executeTasks();

        System.out.println("\n======================================");
        System.out.println("       ALL TASKS COMPLETED");
        System.out.println("======================================");
    }
}

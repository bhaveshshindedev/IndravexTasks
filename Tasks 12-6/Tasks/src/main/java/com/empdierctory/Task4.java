package com.empdierctory;

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Amit");
        employees.put(102, "Bhavesh");
        employees.put(103, "Rohit");
        employees.put(104, "Priya");

        System.out.println("Employee Records:");
        System.out.println(employees);

        System.out.println("\nEmployee with ID 102:");
        System.out.println(employees.get(102));

        employees.put(103, "Rohan");

        System.out.println("\nAfter updating ID 103:");
        System.out.println(employees);

        employees.remove(104);

        System.out.println("\nAfter removing ID 104:");
        System.out.println(employees);

        System.out.println("\nKey 101 exists? "
                + employees.containsKey(101));

        System.out.println("Value 'Amit' exists? "
                + employees.containsValue("Amit"));
    }
}
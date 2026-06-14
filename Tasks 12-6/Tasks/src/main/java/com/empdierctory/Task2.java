package com.empdierctory;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Amit");
        students.add("Bhavesh");
        students.add("Rohit");
        students.add("Priya");
        students.add("Neha");
        students.add("Karan");
        students.add("Sneha");
        students.add("Vikas");
        students.add("Amit");
        students.add("Priya");

        System.out.println("Students:");
        System.out.println(students);

        System.out.println("\nInsertion order is maintained.");

        students.remove("Karan");

        System.out.println("\nAfter removing Karan:");
        System.out.println(students);

        System.out.println("\nDoes Priya exist? "
                + students.contains("Priya"));
    }
}
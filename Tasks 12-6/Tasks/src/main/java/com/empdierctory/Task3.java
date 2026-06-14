package com.empdierctory;

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(25);
        numbers.add(90);
        numbers.add(33);
        numbers.add(67);
        numbers.add(5);
        numbers.add(54);
        numbers.add(18);

        System.out.println("Sorted Elements:");
        System.out.println(numbers);

        System.out.println("\nFirst Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        System.out.println("\nElements greater than 30:");
        System.out.println(numbers.tailSet(31));

        System.out.println("\nElements less than 50:");
        System.out.println(numbers.headSet(50));

        numbers.remove(25);

        System.out.println("\nAfter removing 25:");
        System.out.println(numbers);
    }
}
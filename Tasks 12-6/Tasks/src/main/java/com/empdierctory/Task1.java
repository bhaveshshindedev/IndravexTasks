package com.empdierctory;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(20);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);

        System.out.println("HashSet Elements:");
        System.out.println(numbers);

        System.out.println("\nDuplicate values are not stored.");

        int search = 40;
        System.out.println("\nDoes " + search + " exist? "
                + numbers.contains(search));

        numbers.remove(30);

        System.out.println("\nAfter removing 30:");
        System.out.println(numbers);
    }
}
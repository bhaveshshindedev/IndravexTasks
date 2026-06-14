package com.empdierctory;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Amit", 45000));
        list.add(new Employee(101, "Bhavesh", 55000));
        list.add(new Employee(105, "Priya", 50000));
        list.add(new Employee(102, "Rohit", 40000));
        list.add(new Employee(104, "Neha", 60000));

        Collections.sort(list);

        System.out.println("Sorted by Employee ID:");

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
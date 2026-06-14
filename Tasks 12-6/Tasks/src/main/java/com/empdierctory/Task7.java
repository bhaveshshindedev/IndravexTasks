package com.empdierctory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {

    int id;
    String name;
    double salary;

    Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class NameComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.name.compareTo(e2.name);
    }
}

class SalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(103, "Amit", 45000));
        list.add(new Employee1(101, "Bhavesh", 55000));
        list.add(new Employee1(105, "Priya", 50000));
        list.add(new Employee1(102, "Rohit", 40000));
        list.add(new Employee1(104, "Neha", 60000));

        Collections.sort(list, new NameComparator());

        System.out.println("Sorted by Name:");

        for (Employee1 e : list) {
            System.out.println(e);
        }

        Collections.sort(list, new SalaryComparator());

        System.out.println("\nSorted by Salary:");

        for (Employee1 e : list) {
            System.out.println(e);
        }
    }
}
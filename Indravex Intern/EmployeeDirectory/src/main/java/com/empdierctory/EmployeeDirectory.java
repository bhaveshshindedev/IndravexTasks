package com.empdierctory;

import java.util.Scanner;
import java.util.Vector;

public class EmployeeDirectory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Employee> employees = new Vector<>();

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE DIRECTORY =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Remove Employee by ID");
            System.out.println("4. Display All Employees");
            System.out.println("5. Count Total Employees");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    employees.add(new Employee(id, name));

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.getEmployeeId() == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println(emp);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 3:
                    System.out.print("Enter Employee ID to Remove: ");
                    int removeId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).getEmployeeId() == removeId) {
                            employees.remove(i);
                            System.out.println("Employee Removed Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found.");
                    } else {
                        System.out.println("\n----- Employee List -----");

                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }

                    break;

                case 5:
                    System.out.println("Total Employees: " + employees.size());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
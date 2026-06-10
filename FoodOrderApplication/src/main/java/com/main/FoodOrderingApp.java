package com.main;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrderingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer(1, "Bhavesh", "Mumbai");
        DeliveryAgent agent = new DeliveryAgent(101, "Ram", "4565");

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem(1, "Burger", 120));
        menu.add(new MenuItem(2, "Pizza", 250));
        menu.add(new MenuItem(3, "Sandwich", 100));
        menu.add(new MenuItem(4, "Coffee", 80));
        Order order = new Order();

        int choice;

        do {
            System.out.println("\n===== FOOD ORDERING APPLICATION =====");
            System.out.println("Welcome, " + customer.getName());
            System.out.println("1. Display Food Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order Summary");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n----- FOOD MENU -----");
                    for (MenuItem item : menu) {
                        System.out.println(item);
                    }
                    break;

                case 2:
                    System.out.println("\nEnter Item ID to Add:");
                    int itemId = sc.nextInt();

                    boolean found = false;

                    for (MenuItem item : menu) {
                        if (item.getItemId() == itemId) {
                            order.addItem(item);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid Item ID.");
                    }
                    break;

                case 3:
                    order.viewOrder();
                    break;

                case 4:

                    if (order.isEmpty()) {
                        System.out.println("Please add items before payment.");
                        break;
                    }

                    double total = order.calculateTotal();

                    System.out.println("\nTotal Amount: ₹" + total);

                    System.out.println("Choose Payment Method:");
                    System.out.println("1. UPI");
                    System.out.println("2. Card");
                    System.out.println("3. Cash");

                    int paymentChoice = sc.nextInt();

                    Payment payment = null;

                    switch (paymentChoice) {
                        case 1:
                            payment = new UPIPayment();
                            break;

                        case 2:
                            payment = new CashPayment();
                            break;

                        default:
                            System.out.println("Invalid Payment Method.");
                    }

                    if (payment != null) {
                        payment.pay(total);

                        System.out.println("Order Placed Successfully!");
                        System.out.println("Delivery Agent: "
                                + agent.getName()
                                + " (Vehicle: "
                                + agent.getVehicleNumber()
                                + ")");

                        System.out.println("Thank You for Ordering!");
                    }

                    break;

                case 5:
                    System.out.println("Thank You for Using Food Ordering System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
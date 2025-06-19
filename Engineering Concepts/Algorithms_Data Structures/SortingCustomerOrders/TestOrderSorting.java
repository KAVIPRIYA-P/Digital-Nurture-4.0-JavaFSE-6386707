package SortingCustomerOrders;

import java.util.Scanner;

public class TestOrderSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for order " + (i + 1));
            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Total Price: ");
            double price = sc.nextDouble();
            orders[i] = new Order(id, name, price);
        }
        OrderSorter.bubbleSort(orders);
        System.out.println("\nOrders sorted by Bubble Sort:");
        for (Order o : orders) {
            System.out.println(o);
        }
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders sorted by Quick Sort:");
        for (Order o : orders) {
            System.out.println(o);
        }

        sc.close();
    }

}

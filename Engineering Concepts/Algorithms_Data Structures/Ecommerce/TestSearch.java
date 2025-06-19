package Ecommerce;

import java.util.Scanner;

public class TestSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Let the user decide how many products to enter
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Product[] products = new Product[n];

        // Input details for each product
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Input productId to search
        System.out.print("Enter the Product ID to search: ");
        int targetId = sc.nextInt();

        // Linear Search
        Product result1 = LinearSearch.linearSearch(products, targetId);
        if (result1 != null) {
            System.out.println("Linear Search Result: " + result1);
        } else {
            System.out.println("Linear Search Result: Product not found.");
        }

        // Sort before Binary Search
        BinarySearch.sortProducts(products);
        Product result2 = BinarySearch.binarySearch(products, targetId);
        if (result2 != null) {
            System.out.println("Binary Search Result: " + result2);
        } else {
            System.out.println("Binary Search Result: Product not found.");
        }

        sc.close();
    }
}

package InventoryManagementSystem;

import java.util.Scanner;

public class TestInventory {

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Display Inventory\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    id = sc.nextInt();
                    System.out.print("Enter new Quantity: ");
                    qty = sc.nextInt();
                    System.out.print("Enter new Price: ");
                    price = sc.nextDouble();
                    manager.updateProduct(id, qty, price);
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    id = sc.nextInt();
                    manager.deleteProduct(id);
                    break;
                case 4:
                    manager.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

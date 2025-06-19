package TaskManagementSystem;

import java.util.Scanner;

public class TestTaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n1. Add Task\n2. Search Task\n3. Traverse Tasks\n4. Delete Task\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    manager.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int searchId = sc.nextInt();
                    Task task = manager.searchTask(searchId);
                    System.out.println((task != null) ? task : "Task not found.");
                    break;

                case 3:
                    manager.traverseTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteTask(deleteId);
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

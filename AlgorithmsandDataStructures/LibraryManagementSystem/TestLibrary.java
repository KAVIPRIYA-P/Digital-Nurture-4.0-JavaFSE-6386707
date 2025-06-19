package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TestLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Python Basics", "Guido van Rossum"),
                new Book(103, "Data Structures", "Robert Lafore"),
                new Book(104, "Algorithms", "Thomas Cormen"),
                new Book(105, "Operating Systems", "Abraham Silberschatz")
        };

        System.out.println("Enter book title to search (Linear Search): ");
        String title = sc.nextLine();
        Book result1 = SearchAlgorithms.linearSearch(books, title);
        System.out.println(result1 != null ? "Found: " + result1 : "Book not found!");

        Arrays.sort(books, Comparator.comparing(b -> b.title));

        System.out.println("\nEnter book title to search (Binary Search): ");
        String binaryTitle = sc.nextLine();
        Book result2 = SearchAlgorithms.binarySearch(books, binaryTitle);
        System.out.println(result2 != null ? "Found: " + result2 : "Book not found!");

        sc.close();
    }

}

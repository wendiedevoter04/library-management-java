import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        // Book 1
        Book book1 = new Book();
        book1.title = "Petals of Blood";
        book1.author = "Ngũgĩ wa Thiong'o";
        book1.id = 1;
        book1.isAvailable = true;

        library.add(book1);

        // Book 2
        Book book2 = new Book();
        book2.title = "The River Between";
        book2.author = "Ngũgĩ wa Thiong'o";
        book2.id = 2;
        book2.isAvailable = true;

        library.add(book2);

        // Book 3
        Book book3 = new Book();
        book3.title = "Dust";
        book3.author = "Yvonne Adhiambo Owuor";
        book3.id = 3;
        book3.isAvailable = true;

        library.add(book3);

        // Display all books
        System.out.println("=== LIBRARY BOOKS ===");

        for (Book b : library) {
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ID: " + b.id);
            System.out.println("Available: " + b.isAvailable);
            System.out.println("-------------------");
        }
    }
}
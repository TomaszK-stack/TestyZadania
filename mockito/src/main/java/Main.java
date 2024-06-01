import java.util.ArrayList;
import java.util.List;

// Osoba


// Ksiazka


// Biblioteka

public class Main {
    public static void main(String[] args) {

        // Tworzenie osób
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        // Tworzenie autorow
        Person javaAuthor = new Person("Autor");
        Person dsAuthor = new Person("Autor");

        // Tworzenie książki
        Book book1 = new Book("J", javaAuthor);
        Book book2 = new Book("Data", dsAuthor);

        // Tworzenie biblioteki
        Library library = new Library();
        library.addBook(book1);

        // Sprawdzanie ksizek
        System.out.println(book1.getTitle() + " napisana przez " + book1.getAuthor().getName());
        System.out.println(book2.getTitle() + " napisana przez " + book2.getAuthor().getName());

        alice.borrowBook(book1);
        alice.borrowBook(book2);
        bob.borrowBook(book2);

        System.out.println(alice.getName() + " wypożyczona: ");
        alice.getBorrowedBooks().stream().forEach(elem -> System.out.println(elem.getTitle()));

        System.out.println("\n");
        System.out.println(bob.getName() + " wypożyczona: ");
        bob.getBorrowedBooks().stream().forEach(elem -> System.out.println(elem.getTitle()));
    }
}
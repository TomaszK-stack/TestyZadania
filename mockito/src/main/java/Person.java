import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private List<Book> borrowedBooks;

    public Person(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}

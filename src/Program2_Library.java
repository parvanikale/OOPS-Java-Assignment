
import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }
}

public class Program2_Library {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("Python", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();
    }
}
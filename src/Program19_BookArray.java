class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class Program19_BookArray {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 500);
        books[1] = new Book("C++ Guide", "Bjarne Stroustrup", 650);
        books[2] = new Book("Python Intro", "Guido van Rossum", 400);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
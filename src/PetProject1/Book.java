package PetProject1;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String name;
    private String author;
    private boolean isTaken;
    private int isbn;

    public Book(String name) {
        this.name = name;
    }

    public Book(String author, String name, int isbn) {
        this.author = author;
        this.name = name;
        this.isbn = isbn;
        this.isTaken = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isTaken=" + isTaken +
                '}';
    }

    public class Catalog {
        private Map<Integer, Book> listOfBooks;

        public Catalog() {
            this.listOfBooks = new HashMap<>();
        }

        public Map<Integer, Book> getListOfBooks() {
            return listOfBooks;
        }

        public void addBookToList(String name, String author, int isbn) {
            Book book = new Book(author, name, isbn);
            listOfBooks.put(isbn, book);
            System.out.println("Book successfully added: " + book);
        }

        public Book searchBook(int isbn) {
            return listOfBooks.get(isbn);
        }
    }
}

package homeWorks.exeptions;

import java.util.ArrayList;
import java.util.List;

public class exercise2 {
    public static void main(String[] args) throws
            NoBookFoundException {
        BookRepository bookrepository = new BookRepository();
        bookrepository.add(new Book("The freezing Order", "Bill Browder", "33452"));
        bookrepository.add(new Book("The freezing Order Part 2" ,"Bill Browder", "9986"));
        List<Book> book = bookrepository.findByName("??");
        Book book1 = bookrepository.findByIsbn("??");
        bookrepository.delete("43");
    }
}
class NoBookFoundException extends Exception {
    public NoBookFoundException(String message) {
        super(message);
    }
}
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        this.books.add(book);
    }

    public void delete(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return;
            }
        }
        throw new NoBookFoundException("Cant find book with isbn: " + isbn);
    }

    public List<Book> findByName(String name) throws
            NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Cant find book by name" + name);
        }
        return booksByName;
    }

    public Book findByIsbn(String s) {
        return null;
    }
}


// Create the BookRepository class, which will be responsible for:
//1.adding Book objects
//2.removing Book objects
//3.searching for objects of the Book type with the indicated name
//4.searching for objects of the Book type with the indicated id
//5.removing objects of the Book type based on the provided id
//
//The Book class should include the following fields:
//1.id
//2.title
//3.author
//4.year of release
//
// NoBookFoundException
// In case of lack of searched results an exception should be thrown. This exception should
// accept the String parameter object with information about which elements could not be found.


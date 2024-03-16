package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        library.addBook(new Book("1984", "George Orwell", 3));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 4));

    }

    @Test
    void testSearchBooksByID() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add(1); // ID of "The Great Gatsby"

        ArrayList<Book> result = library.searchBooks(SearchByType.ID, keys);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("The Great Gatsby", result.get(0).getTitle());
    }

    @Test
    void testSearchBooksByTitle() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add("To Kill a Mockingbird");

        ArrayList<Book> result = library.searchBooks(SearchByType.TITLE, keys);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("To Kill a Mockingbird", result.get(0).getTitle());
    }

    @Test
    void testSearchBooksByAuthor() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add("George Orwell");

        ArrayList<Book> result = library.searchBooks(SearchByType.AUTHOR, keys);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("1984", result.get(0).getTitle());
    }

    @Test
    void testSearchBooksByNameReturnsNull() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add("John Doe");

        ArrayList<Book> result = library.searchBooks(SearchByType.NAME, keys);
        assertNull(result);
    }
}

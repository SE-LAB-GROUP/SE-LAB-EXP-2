package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;
    private Book book;
    private Student student;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("Golestan", "Sadi", 1);
        student = new Student("Alice", 1);
        library.addBook(book);
        library.addStudent(student);
    }

    @Test
    public void testLendBookSuccess() {
        assertTrue(library.lendBook(book, student));
        assertFalse(library.getBooks().contains(book)); // Book should not be in the library after lending
        assertTrue(student.hasBook(book)); // Student should have the book after lending
    }

    @Test
    public void testLendBookFailureBookNotInLibrary() {
        Book newBook = new Book("Boostan", "Sadi", 2);
        assertFalse(library.lendBook(newBook, student)); // Attempt to lend a book not in the library
        assertTrue(library.getBooks().contains(book)); // Original book should still be in
    }

    @Test
    public void testLendBookFailureStudentNotInLibrary() {
        Student non_member_student = new Student("Jeff", 2);
        assertFalse(library.lendBook(book, non_member_student));
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testReturnBookSuccess() {
        library.lendBook(book, student);
        assertTrue(library.returnBook(book, student));
        library.returnBook(book, student);
        assertTrue(library.getBooks().contains(book));
        assertFalse(student.hasBook(book));
    }

    @Test
    public void testReturnBookFailureBookNotInStudentBookList() {
        Book newBook = new Book("Boostan", "Sadi", 2);
        library.addBook(newBook);
        library.lendBook(book, student);
        assertFalse(library.returnBook(newBook, student));
        assertTrue(library.returnBook(book, student));
        assertTrue(library.getBooks().contains(newBook));
    }

    @Test
    public void testStudentOrBookNotNull() {
        assertFalse(library.returnBook(null, student));
        assertFalse(library.returnBook(book, null));
    }
}
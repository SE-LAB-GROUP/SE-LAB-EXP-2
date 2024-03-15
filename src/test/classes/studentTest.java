package test.classes;

import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class studentTest {

    @Test
    public void testSearchStudents() {
        ArrayList<Object> testObjects = createTestObjects();
        ArrayList<Student> testStudents = (ArrayList<Student>) testObjects.get(0);
        Library testLibrary = (Library) testObjects.get(1);
        Student student1 = testStudents.get(0);
        Student student2 = testStudents.get(1);
        Student student3 = testStudents.get(2);

        System.out.println(student1 + " " + student2 + " " + student3);

        // Search for student by ID
        ArrayList<Object> keys = new ArrayList<>();
        keys.add(2); // Search for student with ID 2
        ArrayList<Student> result = testLibrary.searchStudents(SearchByType.ID, keys);

        // Check if the result contains the expected student
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(student2, result.get(0));

        // Search for student by name
        keys = new ArrayList<>();
        keys.add("Alice"); // Search for student with name "Alice"
        result = testLibrary.searchStudents(SearchByType.NAME, keys);

        // Check if the result contains the expected student
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(student2, result.get(0));
    }

    public ArrayList<Object> createTestObjects() {
        // Create some sample students
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Alice", 2);
        Student student3 = new Student("Bob", 3);

        // Add students to a list
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(student1);
        testStudents.add(student2);
        testStudents.add(student3);

        // Create a test instance of Library
        Library testLibrary = new Library();
        testLibrary.addStudent(student1);
        testLibrary.addStudent(student2);
        testLibrary.addStudent(student3);

        ArrayList<Object> testObjects = new ArrayList<>();
        testObjects.add(testStudents);
        testObjects.add(testLibrary);

        return testObjects;
    }
}
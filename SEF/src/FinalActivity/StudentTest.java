package FinalActivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testConstructor() {
        Student bob = new Student("Bob", 22, "RTU", 3);
        assertEquals("firstname not set", bob.getFirstName(), "Bob");
        assertEquals("age not set", bob.getAge(), 22);
        assertEquals("highschool not set", bob.getHighSchool(), "RTU");
        assertEquals("grade not set", bob.getGrade(), 3);
    }

    @Test
    public void testGetSet() {
        Student bob = new Student("Bob", 22, "RTU", 3);

        bob.setHighSchool("LU");
        assertEquals("highschool not set", bob.getHighSchool(), "LU");

        bob.setGrade(2);
        assertEquals("grade not set", bob.getGrade(), 2);

    }
}

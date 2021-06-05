package FinalActivity;

import org.junit.Test;


import static junit.framework.Assert.*;

public class PersonTest {

    @Test(expected = IncorrectNameException.class)
    public void testDigitsInFirstname() throws IncorrectNameException {
        Person bob = new Person("bob", 22);
        bob.setFirstName("Ivan3");
    }

    @Test
    public void testGettterSetterFirstanem() throws IncorrectNameException {
        Person bob = new Person("bob", 22);
        bob.setFirstName("John");
        assertEquals("getter or setter error", bob.getFirstName(), "John");
    }
    @Test
     public void testConstructorPersonName () {
        Person bob = new Person("bob", 22);
        assertEquals("firstname not set", bob.getFirstName(), "bob");
        assertEquals("age not set", bob.getAge(), 22);
    }
     @Test
     public void testConstructorPersonNameAndAge () {
         Person bob = new Person("bob");

         assertEquals("firstname not set", bob.getFirstName(), "bob");
     }

}
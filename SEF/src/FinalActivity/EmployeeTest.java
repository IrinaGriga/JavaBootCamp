package FinalActivity;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class EmployeeTest  {


    @Test
    public void testConstructorEmployee() throws IncorrectNameException {
        Employee bob = new Employee("bob", 22, "QA Engeneer", "Hitachi", 1500.22);

        assertEquals("age not set", bob.getAge(), 22);
        assertEquals("occupation not set", bob.getOccupation(), "QA Engeneer");
        assertEquals("company Name not set", bob.getCompanyName(), "Hitachi");
        assertEquals("salary not set", bob.getSalary(), 1500.22);
    }

    @Test
    public void testGeterrSeterrEmployee() {
        Employee bob = new Employee("bob", 22, "QA Engeneer", "Hitachi", 1500.22);

        bob.setOccupation("QA Engeneer");
        assertEquals("occupation not set", bob.getOccupation(), "QA Engeneer");

        bob.setCompanyName("Hitachi");
        assertEquals("company Name not set", bob.getCompanyName(), "Hitachi");

        bob.setSalary(1500.22);
        assertEquals("salary not set", bob.getSalary(), 1500.22);
    }
}

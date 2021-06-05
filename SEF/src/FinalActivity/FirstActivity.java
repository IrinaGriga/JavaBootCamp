package FinalActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {

    private List<Employee> employees = new ArrayList<Employee>();


    public static void main(String[] args) {

        FirstActivity activity = new FirstActivity();

        activity.addEmployee(new Employee("George", 25, "Developer", "AMG", 2500.50));
        activity.addEmployee(new Employee("Margaret", 28, "Project manager", "SONY", 1400.75));
        activity.addEmployee(new Employee("Henry", 35, "Accounter", "LG", 1400.75));
        activity.addEmployee(new Employee("Maicle", 55, "Director", "HITACHI", 1250.90));
        activity.addEmployee(new Employee("Jhon", 22, "Test engeneer", "ARISTON", 3250.44));


        activity.sortEmployees();

        for  (int i = 0; i < activity.getemployees().size(); i++) {
            Employee current = activity.getemployees().get(i);
            System.out.println(current.getFirstName() + " - salary: " + current.getSalary());
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortEmployees() {
        employees.sort(Collections.reverseOrder());
    }

    public List<Employee> getemployees() {
        return employees;
    }

}









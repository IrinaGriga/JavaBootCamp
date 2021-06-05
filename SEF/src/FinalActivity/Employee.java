package FinalActivity;

public class Employee extends Person implements Comparable<Employee> {

//private int id;
	private String occupation;
	private String companyName;
	private Double salary;

	public Employee(String name, int age, String occupation, String companyName) {
		super(name, age);
		this.occupation = occupation;
		this.companyName = companyName;
	}
	public Employee(String name, int age, String occupation, String companyName, double salary) {
		super(name, age);
		this.occupation = occupation;
		this.companyName = companyName;
		this.salary = salary;
	}
	public Employee(String occupation, String companyName) {
		this.occupation = occupation;
		this.companyName = companyName;
	}

	public static void main(String[] args) {


		Employee bob = new Employee("Bob", 22, "Manager", "Google");
		bob.introduce();
	}

	public void introduce() {
		System.out.println(
				"My name is " + this.getFirstName() + " I am " + this.getAge() +
				" I am " + this.getOccupation() +
				" I work in " + this.getCompanyName());
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		return this.salary.compareTo(employee.getSalary());
	}
}
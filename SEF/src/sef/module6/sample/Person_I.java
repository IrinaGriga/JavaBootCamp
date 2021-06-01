package sef.module6.sample;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String name;
	private int age;

		
	//Behavior - default constructor
	public Person_I(){
		this.name="Sarah Johnson";
		this.age = 21;
		System.out.println("I'm Person_I constructor"); // Called when creating a Person instance
	}

	
	// getter for String name
	public String getName() {
		return name;
	}
	
	// setter for String name
	public void setName(String name) {
		this.name = name;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}	
	
	public void announce(){
		System.out.println("Inside Person Class");
	}

}

package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {


	private String name;
	private int age;

	
	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	{System.out.println( "I am Person_I Constructor");}
	
	//Behavior - write parameterized constructor

public Person_I(String name, int age){
		this.name = name;
		this.age = age;

		}
		public String getName (String name){
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

// This method is overloaded by Student sub class
public void address(String city, String state)
{System.out.println("*** address() method called in class Person_I ***");
		}

// This method is overridden in Student class
public void announce(){
		System.out.println("Inside Person Class");
		}


		}


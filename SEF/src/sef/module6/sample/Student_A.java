package sef.module6.sample;

public class Student_A extends Person_A {
	
	//Attributes
	private int grade;
	private String school;
	private String name;
	private int age;

	//Behavior - default constructor
	public Student_A(){ 
		System.out.println("I'm Student_A constructor"); 
	}
	
	// getter for int grade
	public int getGrade() {
		return grade;
	}
	
	// setter for int grade
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// getter for String school
	public String getSchool() {
		return school;
	}
	
	// setter for String school
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name="<S>"+name;
	}

	public int getAge() {return age;}
	public void setAge (int age) {this.age = age;}

	
}

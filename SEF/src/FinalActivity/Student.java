package FinalActivity;

public class Student extends Person {


    private String highSchool;
    private int grade;


    public Student(String name, int age, String highSchool, int grade) {
        super(name, age);
        this.highSchool = highSchool;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student("Tom", 19, "Latvian University", 2);
        student.introduce();

    }

    public void introduce() {
        System.out.println("My name is " + getFirstName()  + " I am study at " + getHighSchool());

    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



}


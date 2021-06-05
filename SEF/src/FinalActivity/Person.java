package FinalActivity;

public class Person {

    private String firstName;
    private String lastName;
    private char gender;
    private int age;


    public static void main(String[] args) throws IncorrectNameException{

        Person person1 = new Person("John", 22);

        try {
            person1.setFirstName("Ivan 3");

        } catch (Exception e) {

            System.out.println("error: " + e.getMessage());
        }
    }

    public Person (){
        firstName = "Lucy";
    }

    public Person(String firstName) {

        System.out.println("Welcome ");
        this.firstName = firstName;
    }

    public Person(String name, int age) {
        try {
            setFirstName(name);
        }
        catch (Exception e) {
            System.out.println(" Can't set First Name! ");
        };

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IncorrectNameException {
        if (checkDigitsExists(firstName)) {
            throw new IncorrectNameException("firstName have digits");
        }
        this.firstName = firstName;
    }

    public static boolean checkDigitsExists(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IncorrectNameException {
        if (checkDigitsExists(lastName)) {
            throw new IncorrectNameException("lastName have digits");
        }
        this.lastName = lastName;
    }

    public void introduce() {
        System.out.println("My name is " + this.firstName + " I am " + this.age + " year old");
    }
}

	

package sef.module7.activity;

public class Driver {
    private String name;
    private Moving driverMoving;


    public Driver(String name) {
        this.name = name;
    }

    public void setDriverMovings(Moving driverMoving) {
        this.driverMoving = driverMoving;

    }

    public void driverStartDriving() {
        System.out.println("Driver " + this.name);
        this.driverMoving.drive();
    }
}

//5. Create a new public class Driver
//5.1 create two private attributes for this class
//5.1.1 String name
//5.1.2 Moving driversMoving
//5.2. Implement Constructor for Driver class with parameter name
//5.3. Implement Setter in Driver class for Moving were parameter type is Moving
//5.4 Implement new method driverStartsDriving() which will sout "Driver " + name and this method
// also should include function Moving.drive();
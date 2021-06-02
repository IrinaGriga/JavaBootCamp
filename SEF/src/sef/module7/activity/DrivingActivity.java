package sef.module7.activity;

public class DrivingActivity {
   public static void main (String [] args){
       Car car = new Car();
       Motorcycle motorcycle = new Motorcycle();
       Driver driver = new Driver("Irina");

    driver.setDriverMovings(car);
    driver.driverStartDriving();

    driver.setDriverMovings(motorcycle);
    driver.driverStartDriving();
    }
}
//6. Create a new public class DrivingActivity
//6.1. Create main class
//6.2 In main class inicialize both driving implementations
//6.3 Inicialize Driver with your name
//6.4 set Drivers moving options and inicialize driving for both of them
//
//Outcome should be in logs:
//Driver (Your name) is driving car!
//Driver (Your name) is driving motorcycle!
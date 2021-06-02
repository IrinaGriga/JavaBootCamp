package sef.module7.activity;

import sef.module7.sample.Strategy;


 public class Car implements Moving{

     public void drive() {

         System.out.println( "is driving car!");
    }
}

//3. Create new public class Car which will implement Moving interface class
//3.1. Implemented for a Car class drive method, which will print out line
// "is driving car!"
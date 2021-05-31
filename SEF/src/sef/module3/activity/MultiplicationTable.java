
package sef.module3.activity;

public class MultiplicationTable {


	public static void main(String[] args) {


		int x = 1;
		int y = 20;
		while (x < y) {
			System.out.println("The value of x is:=" + x++);
		}


		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of " + i + " ***");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j + " = " + i * j);
			}


		}

	}}

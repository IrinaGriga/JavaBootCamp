package sef.module9.sample;
//Needs to be completed
import java.util.*;

import sef.module3.sample.WhileLoopSample;


public class SetSample {
	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();


//		/1 - Create a new HashSet and name it monthSet

		Set monthset = new HashSet();
		monthset.add("April");
		monthset.add("January");
		monthset.add("January");
		monthset.add("February");
		monthset.add("February");
		monthset.add("March");
		//monthset.
//		
//		monthset.add(4);
//		monthset.add(3);
//		monthset.add(1);
//		monthset.add(2);
//		
		
		//System.out.println(monthset.add("January"));


		monthset.remove("January");

		System.out.println("After removing element " + monthset);

        boolean m = monthset.remove("February");      // true

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));
		monthset.add("January");{
		System.out.println("Output :" + monthset);
						}
		//System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		monthset.add("January");
		//You'd notice that duplicate names are not printed. 
		print(monthset);
	}
	static void print(Set set) {
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
}

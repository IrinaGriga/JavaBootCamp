package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

	static String temp = "My Testing" ;

		public static void main(String[] args) {
			Map map = new HashMap();
			map.put("A", "A String");

			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name


			print(temp);
			print1(10);
			print2("map");
			print3("A String");

            {System.out.println(map.get("A"));}
			//2 - Call print method to print the map passed as its parameter.

		}

		static void print(String test)
		{
			int temp = Integer.valueOf(test);

			System.out.println(test.toUpperCase());

		}
		static void print1(int a)
		{
			//int a = 10;
			for (int i = 0 ; i< a; i++) {




			}

		}
		static void print2(String test)
		{
			int temp = Integer.valueOf(test);

			System.out.println(test.toUpperCase());

		}
		static void print3(String test)
		{
			int temp = Integer.valueOf(test);

			System.out.println(test.toUpperCase());

		}
	}

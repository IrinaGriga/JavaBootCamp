package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		List list = new ArrayList();
		//1 - Type code to create a list of names. Use ArrayList.
		ListSample obj = new ListSample();
		obj.print(list);

		//2 - Call print method to print the list passed as its parameter.

	}

	void print(List list) {
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			//3 - Type code to print this list
			//Notice the order in which elements get printed.

		}
	}
}
package sef.module8.sample;
// Needs to be completed

public class AssertSample {

	public static void test()
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements

		assert 5%2 == 1;
		assert 6%2 == 1: "Mistacke!";
		
	}
	public static void main(String arg[]){
		AssertSample.test();
		
		
	}			
}

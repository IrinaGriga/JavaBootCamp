package sef.module8.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	String str;
	
	public static void main(String[] args) {
		try {
			
			TryCatchFinallySample obj = new TryCatchFinallySample();
			obj.catchMeIfYouCan();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void catchMeIfYouCan()
	{
		//As long as we try to print it, it'd work and print null.		
		System.out.println(str);
		str = "Intelligent student ";
		int temp1=0;
		int temp2 = 10;
		

		
		try {
			System.out.println(str.toUpperCase());
			
			System.out.println(temp1/temp2);
		} catch (NullPointerException e) {
			System.out.println("A variable is not initialized");
		}catch(ArithmeticException e) {
			System.out.println("I can not perform division operation if divident is zero");
		}finally {
			System.out.println("Noth wrong has happend while executing the code ! ");
		}
	}
	
}

package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){
		if(age < 0 ){

			throw new IllegalArgumentException("Parameter age cannot be less than 0");

		}
	}

	public static void main(String arg[]){
				setAge(-1);

	}
}

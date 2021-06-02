package sef.module8.activity;
//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
	public static void main(String[] args) {
		new ExceptionSequenceActivity().divide(10, 0);
	}

	void divide(int num1, int num2) {
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("Exception!!!");

			try {
				System.out.println(10 / 0);
			} catch (ArithmeticException ArithEx) {
				System.out.println("Division by zero is not allowed");
			}

		}
	}
}
//key points:
//Exceptions and Errors,
//Handling them.
//1. try-catch-finally
//2. throws
//3. assert
//Complete all Activities- 1 to 5 and commit code in Git.

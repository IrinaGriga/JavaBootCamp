package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();

		System.out.println("you are 100");
	}

	void catchMeIfYouCan() {
		try {
			int[] arr = {0, 1, 2, 3, 4, 5, 23, 7, 8, 9};

			for (int i = 0; i <= 10; i++) {
				System.out.println(arr[i]);
			}

			{
				System.out.println("You will see this message always");
			}

		} catch (Exception e) {

			System.out.println("Fail"+100/0);
		} finally {
			System.out.println("Finaly result pass! ");
		}
		{
			System.out.println("Show if there any mistacke");
		}
	}
}
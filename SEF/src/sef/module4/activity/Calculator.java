/**
 * 
 */
package sef.module4.activity;




/**
 * @author 
 *
 */
public class Calculator {

	public static final int CALC_TYPE_BASIC = 0;
	public static final int CALC_TYPE_NORMAL = 1;

	private int calcType;

	Calculator(int type) {
		calcType = type;
	}


	public String getCalculatorType() {
		if (calcType == Calculator.CALC_TYPE_BASIC) {
			return "BASIC";
		} else if (calcType == Calculator.CALC_TYPE_NORMAL) {
			return "NORMAL";
		} else {
			return "UNKNOWN";
		}
	}


	public static void main(String[] args) {
//		Person p1 = new Person("Atif");
//		Person p2 = new Person("Gatis");

		int x = 10;
		int y = 0;

		int[] nums = {1, 2, 3, 4};
//	
//	System.out.println("Addition - " + add(x,y));
//	System.out.println("Subtraction - " + subtract(x,y)); // x = 10, y - 20 =  10 - (-20)
//	System.out.println("Multiply - " + multiply(nums));
		System.out.println("Divide - " + divide(x, y));

		//if

	}

	public static int add(int x, int y) {
		int sum = x + y;

		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			// complete the code
			diff = x - y;
		} else {
			// complete the code
			diff = y - x;
		}

		return diff;
	}

	public static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	public static int divide(int x, int y) {
		int divValue = 0;
		if (y == 0) {
			System.out.println("One of the number is 0, I can't do the divide operation");
			// complete the code 
		} else {
			divValue = x / y;
			// complete the code
		}
		return divValue;

	}

}


/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */

public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.

	}

	public static double divide(double x, double y) {
		
		double result = x / y;
		
		return result;
	}
	
	public static int divide(int x, int y) {
		
		int result = x / y;
		
		return result;
	}
	
	public static boolean isDivisibleBy7(int x) {
		
		if(x == 0) {
			return true;
		}
		int remainder = x % 7;
		
		if(remainder == 0) {
			return true;
		}
		return false;
	}
	
	public static String main(String val) {
		
		String newString = "Overloaded main method was passed \"" + val + "\"."; 
		return newString;
	}
	public static int findMin(int x, int y, int z) {
		
		if(x < y) {
			if (x < z) {
				return x;
			}
		}
		if (y < x) {
			if (y < z) {
				return y;
			}
		}
		return z;
	}
	
	public static int findMin(int[] array) {
		
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double average(int[] array) {
		double total = 0.0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double average = total / array.length;
		return average;
	}
	
	public static String[] toLowerCase(String[] array) {
		for(int i = 0; i < array.length; i++) {
			String val = array[i];
			array[i] = val.toLowerCase();
		}
		return array;
	}
	
	public static String[] toLowerCaseCopy(String [] array) {
		String[] newArray = new String[array.length];
		for(int i = 0; i < array.length; i++) {
			String val = array[i].toLowerCase();
			newArray[i] = val;
		}
		return newArray;
	}
	
	public static int[] removeDuplicates(int[] array) {
		
		for(int i = 0; i < array.length; ++i) {
			int val = array[i];
			for(int j = i + 1; j < array.length; j++) {
				if(val == array[j]) {
					array[j] = 0;
					array[i] = 0;
				}
			}
		}
		return array;
	}
}
	
	


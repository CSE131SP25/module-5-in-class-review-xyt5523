package review5;

public class E02FirstLast {

	//Write a method that takes in an array of ints and
	//returns the sum of the first and last values of 
	//the array. Call your method to ensure that it works!
	
	public static void main(String[] args) {
		int [] testArray = {1,2,3,4};
		int value = sumOfFirstAndLast(testArray);
		System.out.println(value);
	}
	
	public static int sumOfFirstAndLast(int[] array) {
		int first = array [0];
		int last = array[array.length-1];
		return first + last;
	}
}

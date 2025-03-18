package review5;

public class E03AddArrays {

	//Write a method that will take in two arrays of ints
	//and add them together. Note that the arrays may not
	//be the same size! For example:
	
	//[3, 4, 5, 1]
	//	+
	//[1, 6]
	//	=
	//[4, 10, 5, 1] 
	public static void main(String[] args) {
		int[] arrayOne = {3,4,5,1};
		int[] arrayTwo = {1,6};
		int[] result = addArrays(arrayOne,arrayTwo);
		for(int i = 0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] addArrays(int[] one,int[] two) {
		int maxSize = one.length;
		if(two.length > one.length) {
			maxSize = two.length;
		}
		int[] result = new int[maxSize];
		for(int i = 0; i<maxSize; i++) {
			if(i< one.length) {
				result[i] +=one[i];
			if(i< two.length) {
				result[i] +=two[i];
			}
		}
	}
		return result;
	}
}

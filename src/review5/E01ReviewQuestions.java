package review5;

public class E01ReviewQuestions {
	
	public static void main(String[] args) {
		
//1. What are the parts of a method definition?
		
		/*(defining operations, reuse the code)
		 * public static
		 * "void" return type
		 * "main"
		 * "(sth.)" parameters in parenthesis
		 */
		
//2. What is an argument / parameter?
		
		/* parameter allow us to change the variable
		 */
		
//3. What is a function call?
			//3a. How do you call a function?
			
			anotherMethod("Doug");
			anotherMethod("Pearl");
			anotherMethod("Simon");
			
			int value = addTwoInts(2,7);
			System.out.println(value);
			
//4. What is scope?
	//4a. How do we determine the scope of a variable?
			
		
//5. What does it mean to return something?
			/*
			 * 1. return to the method call when a method is done
			 * 2. also specifies what the return value should be 
			 */
		
//6. What is the main method used for?
			/*
			 * main is the entry point to a program
			 * the first in main is the first line that will run
			 * 
			 */	
			
	}
	
	
	//define the method
	public static void anotherMethod(String name) {
		int x = 2;
		System.out.println("Hello "+name+"!");
	}
	
	public static int addTwoInts(int a , int b) {
		return a+b;
	}
	
}

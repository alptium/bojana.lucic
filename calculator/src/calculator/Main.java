package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner (System.in)) {
		
		System.out.println("Enter your first number");
		int firstNumber = sc.nextInt();
				
		System.out.println("Chose your operation +, -, *, / ");
		String operation = sc.next();
		
		System.out.println("Enter your second number");
		int secondNumber = sc.nextInt();
		
		System.out.println("Calculating the results...");
		int result = 0;
		
		if(operation.equals("+")) {
			result = firstNumber + secondNumber;
		} else if(operation.equals("-")) {
			result = firstNumber - secondNumber;
		} else if(operation.equals("*")) {
			result = firstNumber * secondNumber;
		} else if(operation.equals("/")) {
			result = firstNumber / secondNumber;
		}
	
			
		System.out.println("The first number is: " + firstNumber);
		System.out.println("The second number is: " + secondNumber);
		System.out.println("The result is: " +result);
		}
		
		
	}

}

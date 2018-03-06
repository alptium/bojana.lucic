package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);{
			
			System.out.println("Enter first number");
			int firstNumber = sc.nextInt();
					
			System.out.println("Choose operation +, -, * ,/");
			String operation = sc.next();
					
			System.out.println("Enter second number");
			int secondNumber = sc.nextInt();
			
			System.out.println("Calculating the result...");
			int result = 0 ;
		}

	}

}
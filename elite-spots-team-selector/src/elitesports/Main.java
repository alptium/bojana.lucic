package elitesports;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Elite Sport Manager!");
		System.out.println("Please complete the application form below.");

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				System.out.println("Enter your name.");
				String firstName = sc.next();

				System.out.println("Enter your surname.");
				String lastName = sc.next();

				System.out.println("Enter your age.");
				int age = sc.nextInt();

				System.out.println("Enter your gender.");
				String gender = sc.next();

				System.out.println("Enter your weight.");
				int weight = sc.nextInt();

				System.out.println("Enter your height.");
				int height = sc.nextInt();

				System.out.println("Enter your primary position.");
				String primaryPosition = sc.next();

				System.out.println("Enter your preferred position.");
				String preferredPosition = sc.next();

				Candidate candidate = new Candidate(firstName, lastName, age, gender, weight, height, primaryPosition,
						preferredPosition);

				if (age <= 16 || height >= 170 || weight <= 57) {
					System.out.println("The application is accepted.");
				} else
					System.out.println("The application is rejected");
			}
		}
	}
}

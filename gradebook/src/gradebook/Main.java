package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Electronic Gradebook, Mrs James.");
		System.out.println("");

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Students' No.1 Name: ");
			String studentNo1Name = sc.next();
			System.out.println("Enter Students' No.1 Surname: ");
			String studentNo1Surname = sc.next();
			System.out.println("Enter Students' No.1 Grade: ");
			int studentNo1Grade = sc.nextInt();

			System.out.println("Enter Students' No.2 Name: ");
			String studentNo2Name = sc.next();
			System.out.println("Enter Students' No.2 Surname: ");
			String studentNo2Surname = sc.next();
			System.out.println("Enter Students' No.2 Grade: ");
			int studentNo2Grade = sc.nextInt();

			System.out.println("Enter Students' No.3 Name: ");
			String studentNo3Name = sc.next();
			System.out.println("Enter Students' No.3 Surname: ");
			String studentNo3Surname = sc.next();
			System.out.println("Enter Students' No.3 Grade: ");
			int studentNo3Grade = sc.nextInt();

			System.out.println("Enter Students' No.4 Name: ");
			String studentNo4Name = sc.next();
			System.out.println("Enter Students' No.4 Surname: ");
			String studentNo4Surname = sc.next();
			System.out.println("Enter Students' No.4 Grade: ");
			int studentNo4Grade = sc.nextInt();

			System.out.println("Enter Students' No.5 Name: ");
			String studentNo5Name = sc.next();
			System.out.println("Enter Students' No.5 Surname: ");
			String studentNo5Surname = sc.next();
			System.out.println("Enter Students' No.5 Grade: ");
			int studentNo5Grade = sc.nextInt();

			System.out.println("This is the list of students and their grades: ");
			System.out.println("Student No.1: " + studentNo1Name + " " + studentNo1Surname + " " + studentNo1Grade);
			System.out.println("Student No.2: " + studentNo2Name + " " + studentNo2Surname + " " + studentNo2Grade);
			System.out.println("Student No.3: " + studentNo3Name + " " + studentNo3Surname + " " + studentNo3Grade);
			System.out.println("Student No.4: " + studentNo4Name + " " + studentNo4Surname + " " + studentNo4Grade);
			System.out.println("Student No.5: " + studentNo5Name + " " + studentNo5Surname + " " + studentNo5Grade);

			System.out.println("");
			int totalGrade = studentNo1Grade + studentNo2Grade + studentNo3Grade + studentNo4Grade + studentNo5Grade;
			System.out.println("The Sum of the all students' grades is: " + totalGrade);
		}

	}

}

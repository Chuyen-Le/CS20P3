package SkillBuilders;

import java.util.Scanner;

public class GradeAvgPart1of2 {

	public static void main(String[] args) 
	{
		// Declaration
		int Sum = 0;
		int NumberOfGrade = 1;
		
		// Ask user to enter 5 grades 
		while (NumberOfGrade <= 5) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the " + NumberOfGrade + " grade: ");
			int grade = scanner.nextInt();
			
			// Find sum of 5 grades
			Sum += grade;
			NumberOfGrade++;
		}
		System.out.print("The average of the grades: " + (double)Sum / (double)NumberOfGrade);
	}

}

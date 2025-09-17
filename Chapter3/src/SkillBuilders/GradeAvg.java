package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) 
	{
		// Declaration
		int Sum = 0;
		int NumberOfGrade = 0;
		
		// Ask user to enter 5 grades 
		while (NumberOfGrade < 5) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the " + (NumberOfGrade + 1) + " grade: ");
			int grade = scanner.nextInt();
			
			// Find sum of 5 grades
			Sum += grade;
			NumberOfGrade++;
		}
		double average = (double)Sum / NumberOfGrade;
		// Print the average
		System.out.printf("The average of the grades: %.2f%%", average);
	}

}

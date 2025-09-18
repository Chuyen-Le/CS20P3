package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		// Ask user to enter a two-digit number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a two-digit number: ");
		int number = scanner.nextInt();
		
		// Find the ones and tens
		int Ones = number % 10;
		int Tens = number / 10;
		
		// Prompt the ones-place and tens-place digits
		System.out.println("The ones-place digits is: " + Ones);
		System.out.println("The tens-place digits is: " + Tens);
	}

}

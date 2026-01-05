package SkillBuilders;

import java.util.Scanner;

public class Delivery 
{
	public static void main(String[] args) 
	{
		// Ask the user about the size of a package
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the length of your package: ");
		double length = scanner.nextDouble();
		
		System.out.print("What is the width of your package: ");
		double width = scanner.nextDouble();
		
		System.out.print("What is the height of your package: ");
		double height = scanner.nextDouble();
		
		// Check if the dimensions are valid 
		if (length <= 10 && width <= 10 && height <= 10) 
		{
			System.out.print("Accept");
		} 
		else 
		{
			System.out.print("Reject");
		}
		
		scanner.close();
	}
}

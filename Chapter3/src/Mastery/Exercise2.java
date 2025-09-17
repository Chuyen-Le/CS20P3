package Mastery;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
	{
		// Ask user to enter the size of a pizza
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the diameter of the pizza in inches: ");
		int diameter = scanner.nextInt();
		
		// Prompts the cost of making the pizza
		System.out.print("The cost of making the pizza is: $" + (float)(0.75 + 1.00 + 0.5 * diameter * diameter));
	}

}

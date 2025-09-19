package Mastery;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) 
	{
		// Question a
		
		// Ask the user how many burgers, fries and sodas they want
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the number of burgers: ");
		int NumberOfBurgers = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter the number of fries: ");
		int NumberOfFries = scanner2.nextInt();
	
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Enter the number of sodas: ");
		int NumberOfSodas = scanner3.nextInt();
		
		//Find the sum
		float Sum = (float)(1.69*NumberOfBurgers + 1.09*NumberOfFries + 0.99*NumberOfSodas);
		
		// Find and print the total, tax and the final cost
		float Tax = (float)(Sum*0.065);
		float FinalCost = (float)(Sum*1.065);
		
		System.out.printf("Total before tax: $%.2f%n", Sum);
		System.out.printf("Tax: $%.2f%n", Tax);
		System.out.printf("Final total: $%.2f%n", FinalCost);		
		
		
		// Question b
		
		// The amount tendered
		Scanner scanner4 = new Scanner(System.in);
		System.out.print("Enter amount tendered: $");
		int AmountTendered = scanner4.nextInt();
		
		// Find and print the change
		float Change = (float)(AmountTendered - FinalCost);
		System.out.printf("Change: $%.2f%n", Change);
	}

}

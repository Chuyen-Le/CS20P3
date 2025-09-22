package Mastery;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// Question a
		
		// Ask the user how many burgers, fries and sodas they want
		System.out.print("Enter the number of burgers: ");
		int NumberOfBurgers = scanner.nextInt();
		
		System.out.print("Enter the number of fries: ");
		int NumberOfFries = scanner.nextInt();
	
		System.out.print("Enter the number of sodas: ");
		int NumberOfSodas = scanner.nextInt();
		
		//Find the
		double Sum = 1.69*NumberOfBurgers + 1.09*NumberOfFries + 0.99*NumberOfSodas;
		
		// Find and print the total, tax and the final cost
		double Tax = Sum*0.065;
		double FinalCost = Sum*1.065;
		
		System.out.printf("Total before tax: $%.2f%n", Sum);
		System.out.printf("Tax: $%.2f%n", Tax);
		System.out.printf("Final total: $%.2f%n", FinalCost);		
		
		
		// Question b
		
		// Ask about the amount tendered
		System.out.print("\nEnter amount tendered: $");
		double AmountTendered = scanner.nextInt();
		
		// Find and print the change
		double Change = AmountTendered - FinalCost;
		System.out.printf("Change: $%.2f%n", Change);
	}

}

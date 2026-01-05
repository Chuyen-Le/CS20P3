package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class Exercise14 
{
	public static void main(String[] args) 
	{
		// Ask the user about data
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter initial bacteria amount: ");			// The number of initial bacteria
		double InitialAmount = scanner.nextDouble();
		
		System.out.print("Enter a constant value for k: ");				// The value of k
		double k = scanner.nextDouble();
		
		System.out.print("Enter the growth time period in hours: ");	// The amount of time
		double hours = scanner.nextDouble();
		
		// Calculate final bacteria amount
		double FinalAmount = InitialAmount * Math.exp(k * hours);
		
		// Format the Final Amount to get the 1 decimal place number
		String formattedFinalAmount = String.format("%.1f", FinalAmount);  
		
		// Prompt out the result
		System.out.print(formattedFinalAmount + " bacteria will be present after " + hours + " hours.");
		
		scanner.close();
	}
}

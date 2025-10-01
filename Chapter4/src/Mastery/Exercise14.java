package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class Exercise14 
{

	public static void main(String[] args) 
	{
		// Ask the user about data
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter initial bacteria amount: ");
		double InitialAmount = scanner.nextDouble();
		
		System.out.print("Enter a constant value for k: ");
		double k = scanner.nextDouble();
		
		System.out.print("Enter the growth time period in hours: ");
		double hours = scanner.nextDouble();
		
		// Calculate final bacteria amount
		double FinalAmount = InitialAmount * Math.exp(k * hours);
		String formattedFinalAmount = String.format("%.1f", FinalAmount);
		System.out.print(formattedFinalAmount + " bacteria will be present after " + hours + "hours.");
	}

}

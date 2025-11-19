package SkillBuilders;

import java.util.Scanner;

public class Exponentiation 
{
	public static void powerOf(double base, double exponent) 
	{
		double result = Math.pow(base, exponent);
		
		System.out.println(base + " raised to the power of " + exponent + " is " + result);
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		double base = scanner.nextDouble();
		
		System.out.print("Enter the exponent: ");
		double exponent = scanner.nextDouble();
		
		powerOf(base, exponent);
	}
}

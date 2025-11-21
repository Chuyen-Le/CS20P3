package SkillBuilders;

import java.util.Scanner;

public class Exponentiation 
{
	public static void powerOf(int base, int exponent) 
	{
		double result = Math.pow(base, exponent);
		
		System.out.println(base + " to the power of " + exponent + " is " + result);
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a base number: ");
		int base = scanner.nextInt();
		
		System.out.print("Enter an exponent: ");
		int exponent = scanner.nextInt();
		
		powerOf(base, exponent);
	}
}

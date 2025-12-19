package SkillBuilders;

import java.util.Scanner;
import java.lang.Math;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		// Ask the user for an integer 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int Integer = scanner.nextInt();
		
		// Case 1: Integer < 0
		if (Integer < 0) 
			System.out.print(Integer + " is not a perfect square");
			
		// Case 2: Integer >= 0
		long IntSqRt = (long) Math.sqrt(Integer);
		
		// if the square of the round square root is equal the initial integer, then it is true
		if (Integer == IntSqRt * IntSqRt) 
		{ 			
			System.out.print(Integer + " is a perfect square");
		} 
		else 
		{
			System.out.print(Integer + " is not a perfect square");
		}
		
		scanner.close();
	}

}

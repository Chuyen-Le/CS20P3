package SkillBuilders;

import java.util.Random;
import java.util.Scanner;

public class RandomNum 
{

	public static void main(String[] args) 
	{
		// Ask the user prompts 2 numbers
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int Minimum = scanner.nextInt();
		
		System.out.print("Enter a number: ");
		int Maximum = scanner.nextInt();
		
		// Prompt the random number
		Random r = new Random();
		int RandomNum = r.nextInt(Maximum - Minimum + 1) + Minimum;
		System.out.print("A random number between " + Minimum + " and " + Maximum + ": " + RandomNum);
	}

}

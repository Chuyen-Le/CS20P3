package SkillBuilders;

import java.util.Random;
import java.util.Scanner;

public class RandomNum 
{
	public static void main(String[] args) 
	{
		// Ask the user to prompt 2 numbers
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the minimum value: ");
		int Minimum = scanner.nextInt();
		
		System.out.print("Enter the maximum value: ");
		int Maximum = scanner.nextInt();
		
		// Prompt the random number in the range [Minimum , Maximum]
		Random random = new Random();
		int RandomNum = random.nextInt(Maximum - Minimum + 1) + Minimum;
		System.out.print("A random number between " + Minimum + " and " + Maximum + ": " + RandomNum);
		
		scanner.close();
	}
}

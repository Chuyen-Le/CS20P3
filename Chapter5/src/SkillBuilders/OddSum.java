package SkillBuilders;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int count = 1;
		int sum = 0;
		
		while (count <= number)
		{
			if (count % 2 == 1)
			{
				sum += count;
			}
			count += 1;
		}
		
		System.out.print("The sum of the odd numbers is " + sum);
	}

}

package SkillBuilders;

import java.util.Scanner;

public class NumbersSum 
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
			System.out.println(count);
			sum += count;
			count += 1;
		}
		
		System.out.print("The sum of the integers is " + sum);
	}

}

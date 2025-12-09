package SkillBuilders;

import java.util.Scanner;

public class CountLetters 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String str = scanner.nextLine();
		
		scanner.close();

		int countLetter = 0;
		
		for (char c : str.toCharArray())
		{
			if (Character.isLetter(c)) 
			{
				countLetter++;
			}
		}

        System.out.println("The number of letters is: " + countLetter); 
	}

}

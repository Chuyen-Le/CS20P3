package Mastery;

import java.util.Scanner;

public class e14 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int size = 5;
		
		String[] array1 = new String[size];
		
		System.out.println("What is your table? ");
		
		for (int i = 0; i < size; i++)
		{
			array1[i] = scanner.nextLine();
		}
		
		for (String letter: array1) 
		{
            System.out.println(letter);
        }
		
		
		scanner.close();
		
	}

}

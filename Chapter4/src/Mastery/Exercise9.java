package Mastery;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 
{
	public static void main(String[] args) 
	{
		// Setting the guessing gam
		Random r = new Random();
		int ComputerNum = r.nextInt(20) + 1;           // Range of random number: [1,20]
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int PlayerNum = scanner.nextInt();
		
		// Display the game
		System.out.println("Computer's number: " + ComputerNum);
		System.out.println("Player's number: " + PlayerNum);
		
		if (ComputerNum == PlayerNum) 
		{
			System.out.print("You won!");
		} 
		else 
		{
			System.out.print("Better luck next time");
		}
		
		scanner.close();
	}
}

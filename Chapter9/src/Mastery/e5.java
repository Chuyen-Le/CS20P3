/*

Name: Minh Chuyen Le
Class: Computer Science 20 P3

Requirements: 
The game of Mastermind is played as follows: One player (the code maker) chooses a secret arrangement of colored pegs and the other player (the code breaker) tries to guess it. For each guess, the code
breaker puts forth an arrangement of colored pegs, and the code maker reports two numbers:
1. The number of pegs that are the correct color and in the correct position.
2. The number of pegs that are the correct color regardless of whether they are in the correct position

*/

package Mastery;

import java.util.Scanner;
import java.util.Random;

public class e5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// the number of pegs
		System.out.print("Enter the number of pegs <1-10>: ");				
		int numPeg = scanner.nextInt();
		
		// the number of possible colors
		System.out.print("Enter the number of colors <1-9>: ");				
		int numColor = scanner.nextInt();
		
		int[] correctAns = new int[numPeg];		// array stores correct answer 
		int[] userGuess = new int[numPeg];		// array stores the user's guess
		
		Random rand = new Random();
		
		// set up random colors for each peg
		for (int i = 0; i < numPeg; i++)									
		{
			correctAns[i] = rand.nextInt(numColor) + 1; 
		}
		
		// counter to keep track of how many guesses the user has made
		int numTrial = 1;	
		
		// main game loop
		while (true)
		{
			System.out.println("\nGuess: " + numTrial);
			int countPeg = 0;					// count of pegs that are correct in both color and position
			int countColor = 0;					// count of pegs that have the correct color but wrong position
			
			// boolean array to mark which pegs are already matched
			boolean[] correctPegUsed = new boolean[numPeg];	
			// boolean array to mark which pegs in the user's guess are matched
			boolean[] guessColorUsed = new boolean[numPeg];
			
			// the user's guess and check for correct peg and position
			for (int i = 0; i < numPeg; i++)
			{
				System.out.printf("Color for peg %d: ", i+1);
				int ans = scanner.nextInt();
				userGuess[i] = ans;
				
				if (ans == correctAns[i])
				{
					// if the user's answer is correct, update the number of correct guesses
					// assign the boolean of this index is true
					countPeg++;
					correctPegUsed[i] = true;							
				    guessColorUsed[i] = true;
				}
			}
			
			// check for correct colors in the wrong positions
			for (int i = 0; i < numPeg; i++) 
			{
				// check the index in the boolean is false
			    if (!guessColorUsed[i]) 
			    {
			        for (int j = 0; j < numPeg; j++) 
			        {
			            if (!correctPegUsed[j] && (userGuess[i] == correctAns[j])) 
			            {
			            	// update how many color the user guesses correctly
			            	countColor++;
			                correctPegUsed[j] = true;		// assign the boolean of this index is true
			                break;
			            }
			        }
			    }
			}
			
			// if all guesses are correct, the user wins and the game stops
			if (countPeg == numPeg)
			{
				System.out.print("\nYou have broken the code in " + numTrial + " guesses");
				break;
			}
			
			// if the user don't get all correct answers, prompts out feedback and continue the while loop
			System.out.println("You have " + countPeg + " peg<s> correct and " + countColor + " color<s> correct.");
			
			// update the number of trials
			numTrial++;
		}
	
		scanner.close();
	}
}

//Test case
/*
Enter the number of pegs <1-10>: 3
Enter the number of colors <1-9>: 5

Guess: 1
Color for peg 1: 1
Color for peg 2: 2
Color for peg 3: 3
You have 2 peg<s> correct and 0 color<s> correct.

Guess: 2
Color for peg 1: 1
Color for peg 2: 2
Color for peg 3: 5
You have 1 peg<s> correct and 0 color<s> correct.

Guess: 3
Color for peg 1: 4
Color for peg 2: 2
Color for peg 3: 3
You have 2 peg<s> correct and 0 color<s> correct.

Guess: 4
Color for peg 1: 3
Color for peg 2: 2
Color for peg 3: 3

You have broken the code in 4 guesses
*/
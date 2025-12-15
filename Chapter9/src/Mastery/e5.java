package Mastery;

import java.util.Scanner;
import java.util.Random;

public class e5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// Set the number of pegs
		System.out.print("Enter the number of pegs <1-10>: ");				
		int numPeg = scanner.nextInt();
		
		// set the number of colors
		System.out.print("Enter the number of colors <1-9>: ");				
		int numColor = scanner.nextInt();
		
		int[] correctAns = new int[numPeg];		// an array for correct answer
		int[] userGuess = new int[numPeg];		// an array for user's answer
		
		Random rand = new Random();
		
		// set the values for correct answers
		for (int i = 0; i < numPeg; i++)									
		{
			correctAns[i] = rand.nextInt(numColor) + 1; 
		}
		
		// the number of trials
		int numTrial = 1;													
		while (true)
		{
			System.out.println("\nGuess: " + numTrial);
			int countPeg = 0;
			int countColor = 0;
			
			boolean[] correctPegUsed = new boolean[numPeg];					
			boolean[] guessColorUsed = new boolean[numPeg];
			
			for (int i = 0; i < numPeg; i++)
			{
				System.out.printf("Color for peg %d: ", i+1);
				int ans = scanner.nextInt();
				userGuess[i] = ans;
				
				if (ans == correctAns[i])
				{
					// if the user's answer is correct, 
					// update the number of correct guesses
					// assign the boolean of this index is true
					countPeg++;
					correctPegUsed[i] = true;							
				    guessColorUsed[i] = true;
				}
			}
			
			for (int i = 0; i < numPeg; i++) 
			{
				// check the index that the boolean is false
			    if (!guessColorUsed[i]) 
			    {
			        for (int j = 0; j < numPeg; j++) 
			        {
			            if (!correctPegUsed[j] && (userGuess[i] == correctAns[j])) 
			            {
			            	// update how many color user guesses correctly
			            	countColor++;
			                correctPegUsed[j] = true;		// assign the boolean of this index is true
			                break;
			            }
			        }
			    }
			}
			
			// if the user guesses correctly all numbers, it prompts out a line and stop the program.
			if (countPeg == numPeg)
			{
				System.out.print("\nYou have broken the code in " + numTrial + " guesses");
				break;
			}
			
			// if the user don't get all correct answers, it prompts out a line and continue the while loop
			System.out.println("You have " + countPeg + " peg<s> correct and " + countColor + " color<s> correct.");
			
			// update the number of trials
			numTrial++;
		}
	
		scanner.close();
	}
}

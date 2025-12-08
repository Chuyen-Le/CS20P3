/*

Name: Minh Chuyen Le
Class: Computer Science 20 P3

Requirements: 
The Adder game prompts a player for the answer to an addition problem. The Adder game creates 
a problem from two randomly selected integers between 0 and 20. Adder allows the player three tries 
to enter a correct answer. If the correct answer is entered on the first try, the player is awarded 
5 points. If the correct answer is entered on the second try, 3 points are awarded. The correct 
answer on the third try earns 1 point. If after three tries, the correct answer is still not entered, 
the player receives no points and the correct answer is displayed. The game continues until
999 is entered as an answer. At the end of the game, Adder displays the player’s score.

*/

package Mastery;

import java.util.Scanner;
import java.util.Random;


class Adder
{
	private int num1, num2;
	
	public Adder(int num1, int num2) 
	{
        this.num1 = num1;
        this.num2 = num2;
    }
	
	public int getSum()
	{
		return num1 + num2;								// the correct answer 
	}

	public String getQues() 
	{
        return num1 + " + " + num2 + " = ";				// the question prompts out
    }
}


public class Exer8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		int score = 0;									// set the score value
		
		while (true)									// continue the loop until user quits
		{
			int num1, num2;								// set values for num1 and num2
			num1 = rand.nextInt(21);
			num2 = rand.nextInt(21);
			
			Adder number = new Adder(num1, num2);
			
			boolean correct = false;					// "correct" is false
			
			for (int i = 5; i > 0; i-=2)				// numbers of attempt (3) and score (5, 3, 1)
			{
				System.out.print(number.getQues());
				int answer = scanner.nextInt();
				
				if (answer == 999)
				{
					System.out.println("Your score is: " + score);		// the "return" will exit the while loop  
                    scanner.close();
                    return;             
	            }
				else if (answer == number.getSum())
				{
					score += i;											// update the new score
					correct = true;										// it stops the for loop and "correct" is true
					break;
				}
			}
			
			if (correct) 								// check if the program returns to the start or continues
			{
		        continue;   							// if "correct" is true, return to the start of the while loop
		    }
			
			// after the for loop, if user can't not answer question and doesn't want to leave
			// so the "correct" is still false, it won't return right away and print out the below line
			// then return to the start of the while loop
			System.out.println("Wrong answer. Enter another answer: " + number.getSum());
		}
	}
}

// Test case
/*
18 + 1 = 19
0 + 7 = 0
0 + 7 = 7
20 + 7 = 27
14 + 5 = 999
Your score is: 13
*/

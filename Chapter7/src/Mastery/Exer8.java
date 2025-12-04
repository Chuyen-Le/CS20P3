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
		return num1 + num2;
	}

	public String getQues() 
	{
        return num1 + " + " + num2 + " = ";
    }
}

public class Exer8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = 0;
		int score = 0;
		
		
		while (true)
		{
			int num1, num2;
			num1 = rand.nextInt(21);
			num2 = rand.nextInt(21);
			
			Adder number = new Adder(num1, num2);
			
			boolean correct = false;
			
			for (int i = 5; i > 0; i-=2)
			{
				System.out.print(number.getQues());
				answer = scanner.nextInt();
				
				if (answer == 999)
				{
					System.out.println("Your score is: " + score);
                    scanner.close();
                    return;             
	            }
				else if (answer == number.getSum())
				{
					score += i;
					correct = true;
					break;
				}
			}
			
			if (correct) 
			{
		        continue;   
		    }
			
			System.out.println("Wrong answer. Enter another answer: " + number.getSum());
		}
	}
}


/*

18 + 1 = 19
0 + 7 = 0
0 + 7 = 7
20 + 7 = 27
14 + 5 = 999
Your score is: 13

*/

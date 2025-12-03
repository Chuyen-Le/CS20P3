/*

Name: Minh Chuyen Le
Class: Computer Science 20 P3

Requirements: 
Create a DigitExtractor application that prompts the user for an integer and then displays the ones,
tens, and hundreds digit of the number. The DigitExtractor application should include a Num object
that can return the ones digit, tens digit, hundreds digit, and the whole number. 

*/

package Mastery;

import java.util.Scanner;

// Background
class Num															
{
	private int answer; 
	
	public Num(int answer)
	{
		this.answer = answer;
	}

	public int getWhole() 
    {
    	return answer;
    }
	
    public int getOne() 						 
    {
    	return answer % 10;							// formula to get the ones digit
    }

    public int getTen() 
    {
    	return (answer / 10) % 10;					// formula to get the tens digit
    }

    public int getHundred() 
    {
    	return (answer / 100) % 10;					// formula to get the hundreds digit
    }
}


// Main
public class Exer2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		
		System.out.print("Enter an integer: ");					// check if the user enters a number
		if (scanner.hasNextInt())
		{
			answer = scanner.nextInt();
		}
		else
		{
			System.out.println("Sorry, Please try again");
			return;
		}
		
		while (true)
		{
			System.out.println("show (W)hole number");
			System.out.println("show (O)nes number");
			System.out.println("show (T)ens number");
			System.out.println("show (H)undreds number");
			System.out.println("(Q)uit");
			
			System.out.print("Enter your choice: ");
			String choice = scanner.next().toUpperCase();		// upper case letter to reduce the amount of cases we should check
			
			Num number = new Num(answer);
			
			if (choice.equals("Q"))
			{
				break;
			}
			else if (choice.equals("W"))						// case: whole number
			{
				System.out.println(number.getWhole());
			}
			else if (choice.equals("O"))						// case: ones digit
			{
				System.out.println(number.getOne());	
			}
			else if (choice.equals("T"))						// case: tens digit
			{
				System.out.println(number.getTen());
			}
			else if (choice.equals("H"))						// case: hundreds digit
			{
				System.out.println(number.getHundred());
			}
			else 												// case: the user enters an invalid letter 
			{
				System.out.println("Sorry, please try again");
			}
			
			System.out.println();								// make a blank line  
		}
		scanner.close(); 	
	}	
}

// Test case
/*

Enter an integer: 562
show (W)hole number
show (O)nes number
show (T)ens number
show (H)undreds number
(Q)uit
Enter your choice: o
2

show (W)hole number
show (O)nes number
show (T)ens number
show (H)undreds number
(Q)uit
Enter your choice: afad
Sorry, please try again

show (W)hole number
show (O)nes number
show (T)ens number
show (H)undreds number
(Q)uit
Enter your choice: T
6

show (W)hole number
show (O)nes number
show (T)ens number
show (H)undreds number
(Q)uit
Enter your choice: q

*/


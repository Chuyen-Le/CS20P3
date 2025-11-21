/*

Name: Minh Chuyen Le
Class: Computer Science 20 P3

Requirements: 
Create a PerfectIntegers application that displays all perfect integers up to 100. A perfect integer is a
number which is equal to the sum of all its factors except itself. For example, 6 is a perfect number
because 1 + 2 + 3 = 6. The application should include a boolean method isPerfect().

*/

package Mastery;

public class Exercise7 
{
	// Method that determine if a number is a perfect number
	public static boolean isPerfect(int number) 
	{
		int sum = 0;
		
		double maxDivisor = Math.ceil(number / 2);				// To reduce the loop's execution times
		
		for (int count = 1; count <= maxDivisor; count++) 
		{ 
			if (number % count == 0) 
			{
				sum += count;
			}
		}
		
		return sum == number;
	}

	public static void main(String[] args) 
	{
		System.out.println("Perfect numbers up to 100 are:");
		
		for (int i = 1; i <= 100; i++) 					        // Check the integers from 1 to 100
		{
			if (isPerfect(i)) 							        // If true, print the number
			{
				System.out.println(i);
			}
		}
	}
}

// Test case 
/*

Perfect numbers up to 100 are:
6
28

*/

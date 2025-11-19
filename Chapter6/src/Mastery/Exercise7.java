package Mastery;

public class Exercise7 
{
	// Method that returns true if n is a perfect number
	public static boolean isPerfect(int n) 
	{
		int sum = 0;
		for (int i = 1; i < n; i++) 
		{ 
			if (n % i == 0) 
			{
				sum += i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) 
	{
		System.out.println("Perfect numbers up to 100 are:");
		for (int i = 1; i <= 100; i++) 
		{
			if (isPerfect(i)) 
			{
				System.out.println(i);
			}
		}
	}
	
}

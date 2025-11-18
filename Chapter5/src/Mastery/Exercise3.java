package Mastery;

public class Exercise3 
{

	public static void main(String[] args) 
	{
		double total_money = 2500;
		int count = 0;
		
		while (total_money <= 5000)
		{
			double next_year_money = total_money * 1.075;
			total_money = next_year_money;
			
			count += 1;
		}
		
		System.out.print("The total years we need to make sure our investment to be worth at least $5,000: " + count);
	}

}

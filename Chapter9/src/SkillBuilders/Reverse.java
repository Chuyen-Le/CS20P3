package SkillBuilders;

public class Reverse 
{

	public static void main(String[] args) 
	{
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++)
		{
			num[i] = i;
		}
		
		System.out.println("Countdown");
		for (int i = num.length; i > 0; i--) 
		{
			System.out.println(num[i - 1]);
		}
		
		System.out.print("Boom!");

	}

}

package SkillBuilders;

public class Evens 
{

	public static void main(String[] args) 
	{
		int count = 1;
		
		System.out.println("The even numbers between 1 and 20, inclusive: ");

		while (count <= 20) 
		{
			if (count % 2 == 0)
			{
				System.out.print(count + " ");
			}
			count += 1;
		}
	}

}

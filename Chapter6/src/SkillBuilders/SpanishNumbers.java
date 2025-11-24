package SkillBuilders;

public class SpanishNumbers 
{
	public static void SpanishNumber(int number) 
	{
		// A string for numbers in Spanish
		String[] spanishNum = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	
		// For each number, add a Spanish word after that number
		System.out.println(number + " - " + spanishNum[number - 1]);
	}
	
	public static void main(String[] args) 
	{
		for (int count = 1; count <= 10; count++) 
		{
			SpanishNumber(count);
		}
	}
}

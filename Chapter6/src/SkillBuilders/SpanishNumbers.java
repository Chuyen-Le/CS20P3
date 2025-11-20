package SkillBuilders;

public class SpanishNumbers 
{
	public static void displaySpanish(int number) 
	{
		// A string of Spanish numbers
		String[] spanish = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	
		// For each number, add the Spanish word of that number
		System.out.println(number + " - " + spanish[number - 1]);
	}
	
	public static void main(String[] args) 
	{
		for (int count = 1; count <= 10; count++) 
		{
			displaySpanish(count);
		}
	}
	
}

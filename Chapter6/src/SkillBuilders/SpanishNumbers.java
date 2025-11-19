package SkillBuilders;

public class SpanishNumbers 
{
	public static void displaySpanish(int number) 
	{
		String[] spanish = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	
		System.out.println(number + " - " + spanish[number - 1]);
	}
	
	public static void main(String[] args) 
	{
		int count = 1;
		while (count <= 10) 
		{
			displaySpanish(count);
			count += 1;
		}
	}
	
}

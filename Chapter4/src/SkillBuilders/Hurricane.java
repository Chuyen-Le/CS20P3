package SkillBuilders;

import java.util.Scanner;

public class Hurricane 
{

	public static void main(String[] args) 
	{
		// Ask the user about the hurricane category
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hurricane category (1-5): ");
		int HurricaneCategory = scanner.nextInt();
		
		switch (HurricaneCategory) 
		{
		case 1: System.out.print("Catagory " + HurricaneCategory + ": 74-95 mph or 64-82 kt or 119-153 km/hr");
		case 2: System.out.print("Catagory " + HurricaneCategory + ": 96-110 mph or 83-95 kt or 154-177 km/hr");
		case 3: System.out.print("Catagory " + HurricaneCategory + ": 111-130 mph or 96-113 kt or 178-209 km/hr");
		case 4: System.out.print("Catagory " + HurricaneCategory + ": 131-155 mph or 114-135 kt or 210-249 km/hr");
		case 5: System.out.print("Catagory " + HurricaneCategory + ": greater than 155 mph or 135 kt or 249 km/hr");
		}
	}

}

package SkillBuilders;

import java.util.Scanner;

public class StudentRoster 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the number of student? ");
		int numStudent = scanner.nextInt();
		scanner.nextLine();
		
		String[] nameStudent = new String[numStudent];
		for (int i = 1; i <= numStudent; i++)
		{
			System.out.print("What is the " + i + "th student name? ");
			String name = scanner.next();
			nameStudent[i-1] = name;
		}
		
		System.out.println("\nStudent Roster:");
        for (int i = 1; i <= numStudent; i++) 
        {
            System.out.println(i + ". " + nameStudent[i-1]);
        }
        
        scanner.close();
	}

}

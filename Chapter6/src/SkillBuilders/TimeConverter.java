package SkillBuilders;

import java.util.Scanner;

public class TimeConverter 
{
	public static void HourToMinute()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("The total of hours: ");
		double hour = scanner.nextInt(); 
		
		double minute = hour * 60;
		
		System.out.print("The total of minutes is " + minute);
		
		scanner.close();
	}
	
	public static void DayToHour()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("The total of days: ");
		double day = scanner.nextInt(); 
		
		double hour = day * 24;
		
		System.out.print("The total of hours is " + hour);
		
		scanner.close();
	}
	
	public static void MinuteToHour()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("The total of minutes: ");
		double minute = scanner.nextInt(); 
		
		double hour = minute / 60;
		
		System.out.print("The total of hours is " + hour);
		
		scanner.close();
	}
	
	public static void HourToDay()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("The total of hours: ");
		double hour = scanner.nextInt(); 
		
		double day = hour / 24;
		
		System.out.print("The total of days is " + day);
		
		scanner.close();
	}

	public static void main(String[] args) 
	{
		System.out.println("1. Time convert from hour to minute");
		System.out.println("2. Time convert from day to hour");
		System.out.println("3. Time convert from minute to hour");
		System.out.println("4. Time convert from hour to day");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Which time convertor do you want (1, 2, 3, 4): ");
		int answer = scanner.nextInt(); 
		
		switch (answer)
		{
		case 1: 
			HourToMinute();
			break;
		case 2: 
			DayToHour();
			break;
		case 3: 
			MinuteToHour();
			break;
		case 4: HourToDay();
		}
		
		scanner.close();
	}
}

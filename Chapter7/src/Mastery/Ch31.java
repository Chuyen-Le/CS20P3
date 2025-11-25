package Mastery;

import java.util.Scanner;

public class Ch31 
{
	public static double price(int numberofOrder, double price)
	{
		double totalPrice;
		
		totalPrice = numberofOrder * price;
		return(totalPrice);
	}
	
	public static String foodInfo(String food, double fat, double carbs, double fiber)
	{
		String foodInformation;
		
		foodInformation = "Each " + food + " has " + fat + "g of fat, " 
		                   + carbs + "g of carbs, and " + fiber + "g of fiber.";
		return(foodInformation);
	}
	
	public static void main(String[] args) 
	{
		String[] food = {"hamburger", "salad", "fries", "soda"};
		double[] price = {1.85, 2, 1.3, 0.95};
		double[] fat = {9, 1, 11, 0};
		double[] carbs = {33, 11, 36, 38};
		double[] fiber = {1, 5, 4, 0};
		
		double total = 0;
		int numberOfItem = food.length;
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= numberOfItem; i++)
		{
			System.out.print("Enter number of " + food[i - 1] + ": ");
			int numberofOrder = scanner.nextInt();
			
			System.out.print(foodInfo(food[i - 1], fat[i - 1], carbs[i - 1], fiber[i - 1]) + "\n\n");
			
			total += price(numberofOrder, price[i - 1]);
		}
		scanner.close();
		
		System.out.printf("Your order comes to: $%.2f%n", total);
	}
}

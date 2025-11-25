package Mastery;

import java.util.Scanner;

class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    public Food(double price, double fat, double carbs, double fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }

    public String getInfo(String itemName) {
        return String.format(
            "Each %s has %.0fg of fat, %.0fg of carbs, and %.0fg of fiber.",
            itemName, fat, carbs, fiber
        );
    }
}

public class Ch3 {

    public static void main(String[] args) {

        // Create Food objects
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        String[] names = {"hamburger", "salad", "fries", "soda"};
        Food[] foods = {hamburger, salad, fries, soda};

        Scanner scanner = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < foods.length; i++) {

            System.out.print("Enter number of " + names[i] + ": ");
            int count = scanner.nextInt();

            System.out.println(foods[i].getInfo(names[i]));
            System.out.println();

            total += count * foods[i].getPrice();
        }

        scanner.close();

        System.out.printf("Your order comes to: $%.2f%n", total);
    }
}


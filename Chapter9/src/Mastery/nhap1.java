package Mastery;

import java.util.Scanner;

public class GridSaver {

    // Define the dimensions as constants for clarity
    private static final int ROWS = 20;
    private static final int COLUMNS = 20;

    // Declare the 2D array to hold your data
    // Example: Storing integers. Change 'int' to 'String', 'char', or another type as needed.
    private char[][] grid = new char[ROWS][COLUMNS];

    public void initializeAndSaveInput() {
        // --- Input/Saving logic goes here ---

        // Example: Populating the grid with sample data (e.g., row * col)
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                // Assuming you get your input from a source (user input, file reading, etc.)
                // This line saves data into the grid:
                grid[i][j] = i * j; // Replace 'i * j' with your actual input value
            }
        }
        System.out.println("20x20 grid successfully saved into a 2D array.");
    }

    public static void displayGrid() {
        System.out.println("\nDisplaying the grid data:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        GridSaver saver = new GridSaver();
        saver.initializeAndSaveInput();
        saver.displayGrid();
    }
}

public class nhap1 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your data?" );
		String bang = scanner.next();
		
		GridSaver talbe = new GridSaver(); 
		GridSaver.displayGrid();

	}
}

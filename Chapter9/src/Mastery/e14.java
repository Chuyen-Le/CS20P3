package Mastery;

import java.util.Scanner;
import java.util.Arrays;

public class e14 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int size = 5;

		char[][] grid = new char[size][size];

		for (int row = 0; row < size; row++) 
		{
		    String line = scanner.nextLine(); 
		    grid[row] = line.toCharArray();   
		}
		
		char[][] newGrid = Arrays.copyOf(grid, size);
	
		scanner.close();
		
		for (int r = 1; r < size - 1; r++) 
		{
		    for (int c = 1; c < size - 1; c++) 
		    {
		    	if (grid[r][c] == 'X')
		    	{
		    		int count = 0;
		    		for (int i = -1; i <= 1; i++) {
		    			for (int j = -1; i <= 1; i++) {
		    				if (grid[r+i][c+j] == 'X') {
		    					count += 1;
		    				}
		    			}
		    		}
		    		
		    		if (count < 3){
		    			newGrid[r][c] = '0';
		    		} else {
		    			newGrid[r][c] = 'X';
		    		}
		    	}
		    }
		}
		
		for (int r = 0; r < size; r++) 
		{
		    for (int c = 0; c < size; c++) 
		    {
		    	System.out.print(newGrid[r][c]);
		    }
		    System.out.println();
		}
		
		
		
	}

}

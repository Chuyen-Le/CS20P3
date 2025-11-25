package SkillBuilders;

public class Rectangle 
{
	// Primary setting
	private double length, width;
	
	public Rectangle() 
	{
		length = 1;
		width = 1;
	}
	
	// Set length and width
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	// Main methods 
	public double perimeter()
	{
		double perimeter;
		
		perimeter = 2 * (length + width);
		return(perimeter);
	}
	
	public double area()
	{
		double area;
		
		area = length * width;
		return(area);
	}
	
	public String displayAreaFormula()
	{
		return(length + " x " + width);
	}
	
	public boolean equals(Object Rec2)
	{
		Rectangle test = (Rectangle)Rec2;
		
		if (test.getLength() == length && test.getWidth() == width)
		{
			return(true);
		} 
		else 
		{
			return(false);
		}
	}
	
	public String toString()
	{
		String rectangleString;
		
		rectangleString = "Rectangle has length " + length + " and width " + width;
		return(rectangleString);
	}
	
	// Return length, width
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
}

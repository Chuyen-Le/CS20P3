package SkillBuilders;

public class Circle 
{
	// Primary setting
	private static final double PI = 3.14;
	private double radius;
	
	public Circle() 
	{
		radius = 1;
	}
	
	// Set radius
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}

	// Main methods
	public double circumference()
	{
		double circleCircumference;
		
		circleCircumference = 2 * PI * radius;
		return(circleCircumference);
	}
	
	public double area()
	{
		double area;
		
		area = PI * radius * radius;
		return(area);
	}
	
	public String displayAreaFormula()
	{
		return(PI + " x " + radius + " x " + radius);
	}
	
	public boolean equals(Object Cir2)
	{
		Circle test = (Circle)Cir2;
		
		if (test.getRadius() == radius)
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
		String circleString;
		
		circleString = "Circle has radius " + radius;
		return(circleString);
	}
	
	// Return radius
	public double getRadius()
	{
		return(radius);
	}
}

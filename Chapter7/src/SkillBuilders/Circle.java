package SkillBuilders;

public class Circle 
{
	private static final double PI = 3.14;
	private double radius;
	
	public Circle() 
	{
		radius = 1;
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}

	public double circumference()
	{
		double circleCircumference;
		
		circleCircumference = 2 * PI * radius;
		return(circleCircumference);
	}
	
	public double getRadius()
	{
		return(radius);
	}

}

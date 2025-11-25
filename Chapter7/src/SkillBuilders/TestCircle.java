package SkillBuilders;

public class TestCircle 
{
	public static void main(String[] args)
	{
		// Circle 1
		Circle spot1 = new Circle();
		spot1.setRadius(5);
		System.out.println("Circle radius: " + spot1.getRadius());
		System.out.println("Circle circumference: " + spot1.circumference());
		System.out.println("Rectangle area: " + spot1.displayAreaFormula() + " = " + spot1.area());
		
		// A line between 2 rectangles
		System.out.println();
		
		// Circle 2
		Circle spot2 = new Circle();
		spot2.setRadius(4);
		System.out.println("Circle radius: " + spot2.getRadius());
		System.out.println("Circle circumference: " + spot2.circumference());
		System.out.println("Rectangle area: " + spot2.displayAreaFormula() + " = " + spot2.area());
		
		// A line between circle and comparison
		System.out.println();
		
		// Compare 2 circles
		if (spot1.equals(spot2)) 
		{
			 System.out.println("Circles are equal.");
		} 
		else 
		{
			 System.out.println("Circles are not equal.");
		}
		
		System.out.println(spot1);
		System.out.println(spot2);
	}
}
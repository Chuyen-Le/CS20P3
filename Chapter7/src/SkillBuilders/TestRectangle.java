package SkillBuilders;

public class TestRectangle 
{
	public static void main(String[] args)
	{
		// Rectangle 1
		Rectangle spot1 = new Rectangle();
		spot1.setLength(4);
		spot1.setWidth(1.5);
		System.out.println("Rectangle length: " + spot1.getLength());
		System.out.println("Rectangle width: " + spot1.getWidth());
		System.out.println("Rectangle perimeter: " + spot1.perimeter());
		System.out.println("Rectangle area: " + spot1.displayAreaFormula() + " = " + spot1.area());
		
		// A line between 2 rectangles, to make it clear
		System.out.println();
		
		// Rectangle 2
		Rectangle spot2 = new Rectangle();
		spot2.setLength(4);
		spot2.setWidth(1.5);
		System.out.println("Rectangle length: " + spot2.getLength());
		System.out.println("Rectangle width: " + spot2.getWidth());
		System.out.println("Rectangle perimeter: " + spot2.perimeter());
		System.out.println("Rectangle area: " + spot2.displayAreaFormula() + " = " + spot2.area());
		
		// A line between rectangle and comparison
		System.out.println();
		
		// Compare 2 rectangles
		if (spot1.equals(spot2)) 
		{
			 System.out.println("Rectangles are equal.");
		} 
		else 
		{
			 System.out.println("Rectangles are not equal.");
		}
		
		System.out.println(spot1);
		System.out.println(spot2);
	}
}
 
import java.util.*;

class Rectangle
{
	float length, breadth;
	double a, p;

	void set()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		length = obj.nextFloat();

		System.out.println("Enter the breadth of rectangle: ");
		breadth = obj.nextFloat();
	}

	void area()
	{	
		a = length * breadth;
	}

	void perimeter()
	{
		p =  2 * (length + breadth);
	}

	void display()
	{
		System.out.println("Length is: " + length + " cm");
		System.out.println("Breadth is: " + breadth + " cm");
		System.out.println("Area of rectangle is: " + a + " sq cm");
		System.out.println("Perimeter of rectangle is: " + p + " cm");
	}
}

class RectangleMain
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		rect.set();
		rect.area();
		rect.perimeter();
		
		System.out.println("\nRectangle having: ");
		rect.display();
	}
}
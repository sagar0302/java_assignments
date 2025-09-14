class Square
{
	double a;
	
	Square(double side)
	{
		a = side;
	}

	double area()
	{
		return a * a;
	}
}

class Cube extends Square
{
	Cube(double side)
	{
		super(side);
	}
	
	double area()
	{
		return 6 * super.area();
	}
}

class SquareMain
{
	public static void main(String[] args)
	{
		Square sq = new Square(10);
		System.out.println("Area of the square is: " + sq.area());

		Cube cu = new Cube(5);
		System.out.println("Surface area of the cube is: " + cu.area());
	}
}
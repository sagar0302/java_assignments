class Calculator
{
	int add(int a, int b)
	{	
		return a + b;
	}

	float add(float a, float b)
	{
		return a + b;
	}

	double add(double a, double b)
	{
		return a + b;
	}
}

class Overload
{
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		
		int intSum = cal.add(10, 20);
		System.out.println("\nSum of integer elements is: " + intSum);

		float floatSum = cal.add(15.4f, 15.6f);
		System.out.println("Sum of float elements is: " + floatSum);

		double doubleSum = cal.add(100.04, 200.06);
		System.out.println("Sum of double elements is: " + doubleSum);
	}
}
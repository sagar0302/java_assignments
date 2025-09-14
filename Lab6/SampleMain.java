interface Sample
{
	int x = 10;

	int square(int num);

	default int cube(int num)
	{
		return num * num * num;
	}

	static void meth1()
	{
		System.out.println("Value of x: " + x);
	}
}

class SampleMain implements Sample
{
	public int square(int num)
	{
		return num * num;
	}

	public static void main(String[] args)
	{
		Sample.meth1();
		SampleMain obj = new SampleMain();
		int num1 = 5;
		
		int sq = obj.square(num1);
		System.out.println("Square is: " + sq);
		int cu = obj.cube(num1);
		System.out.println("Cube is: " + cu);
	}
}
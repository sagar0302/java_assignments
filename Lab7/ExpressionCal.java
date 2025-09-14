class ExpressionCal
{
	public static void main(String[] args)
	{
		for(double x=1.0; x<=5.0; x+=0.5)
		{
			for(double y=0.0; y<=4.0; y+=1.0)
			{
				try
				{
					if (x==y)
					{
						throw new ArithmeticException("Division by zero not allowed");
					}
					
					double denominator = (x * x) - (y * y);
					double f = x / denominator;
					
					System.out.println("f=x/(x^2 - y^2) is: " + f);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
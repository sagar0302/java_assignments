import java.util.*;

class SumSquare
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = obj.nextInt();

		double sum = 0;
		for(int i=1; i<=num; i++)
		{
			sum = sum + (i * i);
		}
		System.out.println("The sum of squares of " + num + " numbers is: " + sum);
	}
}
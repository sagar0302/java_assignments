import java.util.*;

class Power
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the values of m: ");
		int m = obj.nextInt();
		
		System.out.println("\nEnter the values of n: ");
		int n = obj.nextInt();
		
		int pow = 1;
		int count = 1;

		do
		{
			pow = pow * m;
			count++;
		}while(count <= n);
		System.out.println("\nThe power of " + m + " and " + n + " is " + pow);
		
	}
}
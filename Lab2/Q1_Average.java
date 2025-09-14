import java.util.*;

class Average
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter how many numbers do you want: ");
		int n = obj.nextInt();
		
		double sum = 0.0;
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter number: ");
			int num = obj.nextInt();
			sum += num;
		}

		double avg = sum / n;
		System.out.println("\nThe average of numbers is: " + avg);
	}
}
import java.util.*;

class AverageOfNum
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = obj.nextInt();

		double avg = 0;
		for(int i=0; i<=num; i++)
		{
			avg = avg + i;
		}
		System.out.println("The average of " + num + " numbers is: " + avg);
	}
}
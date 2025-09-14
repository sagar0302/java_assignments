import java.util.*;

class BigLowArray
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter how many elements you want in a array: ");
		int n = obj.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = obj.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}

			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("\nThe biggest element in an array is: " + max);
		System.out.println("The lowest element in an array is: " + min);
	}
}
import java.util.*;

class InsertInSortedArray
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the how many element you want in an array: ");
		int n = obj.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter element " + (i + 1) + ": "); 
			arr[i] = obj.nextInt();
		}	
		
		System.out.println("\nEnter the element to insert: ");
		int element = obj.nextInt();

		int[] newarr = new int[n + 1];
		int position = 0;

		while (position < n && arr[position] < element)
		{
			position++;
		}

		for(int i=0; i<position; i++)
		{
			newarr[i] = arr[i];
		}
		
		newarr[position] = element;

		for(int i=position; i<n; i++)
		{
			newarr[i+1] = arr[i];
		}

		System.out.println("The new sorted array is: ");
		for (int i = 0; i < newarr.length; i++) 
		{
    			System.out.print(newarr[i] + " ");
		}
	}
}
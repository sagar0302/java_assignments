import java.util.*;

class OnedArray
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter how many element do you want: ");
		int n = obj.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) 
		{
            		System.out.print("Enter element " + (i + 1) + ": ");
            		numbers[i] = obj.nextInt();
		}
		System.out.println("\nThe elements in the array are:");

	        for (int i = 0; i < numbers.length; i++) 
		{
        	    System.out.print(numbers[i] + " ");
		}
	}

}
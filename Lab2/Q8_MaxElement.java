import java.util.*;

class MaxElement
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

		int max = numbers[0];
		
		for (int i = 1; i < n; i++) 
		{
            		if (numbers[i] > max) 
			{
                		max = numbers[i];
            		}
        	}

        	System.out.println("The maximum element in the array is: " + max);
	}

}
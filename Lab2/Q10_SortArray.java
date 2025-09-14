import java.util.*;

class SortArray 
{
    public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);

        	System.out.println("Enter how many elements you want: ");
        	int n = obj.nextInt();

	        int[] numbers = new int[n];

	        for (int i = 0; i < n; i++) 
		{
        		System.out.print("Enter element " + (i + 1) + ": ");
            		numbers[i] = obj.nextInt();
        	}

	        for (int i = 0; i < n - 1; i++) 
		{
        	    for (int j = i + 1; j < n; j++) 
			{
                		if (numbers[i] > numbers[j]) 
				{
                    			int temp = numbers[i];
                    			numbers[i] = numbers[j];
                    			numbers[j] = temp;
                		}
            		}
        	}

        	System.out.println("\nThe sorted array is:");
        	for (int number : numbers) 
		{
            		System.out.print(number + " ");
       		}
    }
}
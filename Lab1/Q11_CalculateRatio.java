import java.util.Scanner;

public class CalculateRatio 
{
    public static void main(String[] args) 
	{        
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter value for a: ");
        	int a = scanner.nextInt();

        	System.out.print("Enter value for b: ");
        	int b = scanner.nextInt();

        	System.out.print("Enter value for c: ");
        	int c = scanner.nextInt();

        	System.out.print("Enter value for d: ");
        	int d = scanner.nextInt();

        	int denominator = c - d;
        
        	if (denominator != 0) 
		{            
            		int numerator = a + b;

            		double ratio = (double) numerator / denominator;
           
            		System.out.println("\nThe ratio of (a+b) to (c-d) is: " + ratio);
        	}
		else 
		{     
            		System.out.println("\nError: (c - d) is zero.");
        	}
    	}
}
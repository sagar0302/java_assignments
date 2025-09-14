import java.util.Scanner;

public class LambdaPattern 
{
    public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number of rows for the triangle: ");
        	int rows = sc.nextInt();

        	Thread starThread = new Thread(() -> {
            		for (int i = 1; i <= rows; i++) 
			{
                		for (int j = 1; j <= i; j++) 
				{
                    			System.out.print("* ");
                		}
                		System.out.println();
            		}
        	});

        	starThread.start();
    	}
}

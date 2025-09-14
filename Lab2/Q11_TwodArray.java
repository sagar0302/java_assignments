import java.util.*;

class TwodArray
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = obj.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int cols = obj.nextInt();

		
		int[][] matrix = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) 
		{
            		for (int j = 0; j < cols; j++) 
			{
                		System.out.print("Enter element the element: ");
                		matrix[i][j] = obj.nextInt();
           		}
       		}

		for (int i = 0; i < rows; i++) 
		{
            		for (int j = 0; j < cols; j++) 
			{
                		System.out.print(matrix[i][j] + "\t");
            		}
			System.out.println();
		}
	}

}
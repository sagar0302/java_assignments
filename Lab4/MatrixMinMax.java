import java.util.*;

class MatrixMinMax
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = obj.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = obj.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("\nEnter the elements for the matrix: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print("Enter elements: ");
				matrix[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("\nThe entered matrix is: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{	
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int min = matrix[0][0];
		int max = matrix[0][0];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(matrix[i][j] < min)
				{
					min = matrix[i][j];
				}
				if(matrix[i][j] > max)
				{
					max = matrix[i][j];
				}
			}
		}

		System.out.println("\nThe smallest element in the matrix is: " + min);
		System.out.println("The largest element in the matrix is: " + max);
	}
}

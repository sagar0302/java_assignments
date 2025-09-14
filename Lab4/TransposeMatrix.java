import java.util.*;

class TransposeMatrix
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = obj.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = obj.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("\nEnter the elements for matrix: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println("Enter elements: ");
				matrix[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("\nThe matrix: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{	
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] traMatrix = new int[cols][rows];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				traMatrix[j][i] = matrix[i][j];
			}
		}

		System.out.println("\nTranspose of the matrix");
		for(int i=0; i<cols; i++)
		{
			for(int j=0; j<rows; j++)
			{
				System.out.print(traMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
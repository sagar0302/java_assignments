import java.util.*;
import java.lang.Math;

class MatrixNorm
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = obj.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = obj.nextInt();

		int[][] matrix = new int[rows][cols];
		double SqSum = 0.0;

		System.out.println("\nEnter the elements for the matrix: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print("Enter element: ");
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
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				SqSum += matrix[i][j] * matrix[i][j];
			}
		}

		double norm = Math.sqrt(SqSum);

		System.out.println("\nThe norm of the matrix is: " + norm);
	}
}

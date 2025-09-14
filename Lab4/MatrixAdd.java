import java.util.*;

class MatrixAdd
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = obj.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = obj.nextInt();

		int[][] matrixA = new int[rows][cols];
		int[][] matrixB = new int[rows][cols];
		int[][] sum = new int[rows][cols];

		System.out.println("\nEnter the elements for matrix A: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println("Enter elements: ");
				matrixA[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("\nEnter the elements for matrix B: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{	
				System.out.println("Enter elements: ");
				matrixB[i][j] = obj.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		System.out.println("\nThe Sum of the two matrices is: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
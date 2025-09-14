import java.util.*;

class MatrixDiaSum
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns: ");
		int size = obj.nextInt();

		int[][] matrix = new int[size][size];
		int diagonal = 0;

		System.out.println("\nEnter the elements for matrix: ");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.println("Enter elements: ");
				matrix[i][j] = obj.nextInt();
			}
		}
		
		for(int i=0; i<size; i++)
		{
			diagonal = diagonal + matrix[i][i];
		}

		System.out.println("\nThe entered matrix is:");
        	for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\nThe sum of the main diagonal elements is: " + diagonal);
        }
}
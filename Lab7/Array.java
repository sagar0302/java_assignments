import java.util.Scanner;

class Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter how many elements you want in an array: ");
			int num = sc.nextInt();
		
			int[] arr = new int[num];

			for(int i=0; i<num; i++)
			{
				System.out.println("Enter the element " + (i+1) + ": ");
				arr[i] = sc.nextInt();
			}
			
			System.out.print("\nEnter the array position you want to access: ");
			int index = sc.nextInt();

			System.out.println("The value at position " + index + " is: " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
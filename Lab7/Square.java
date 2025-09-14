import java.util.InputMismatchException;
import java.util.Scanner;

class Square
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try
		{
			int num = sc.nextInt();

			int sq = num * num;
			System.out.println("The square is: " + sq);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}
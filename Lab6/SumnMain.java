import package1.Sumn;
import java.util.Scanner;

class SumnMain extends Sumn
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Sumn obj = new Sumn();
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int res = obj.calSum(num);
		System.out.println("The sum of numbers is: " + res);
	}
}
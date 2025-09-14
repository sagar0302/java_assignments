import java.util.*;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = obj.nextInt();

		int orignum = num;
		int reverse = 0;
		
		while(num != 0)
		{
			int lastdigit = num % 10;
			reverse = reverse * 10 + lastdigit;
			num = num / 10;
		}
		if (orignum == reverse)
		{
			System.out.println("The number is a Palindrome number");
		}
		else
		{
			System.out.println("The number is not a palindrome number");
		}	
	}
}
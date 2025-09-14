import java.util.*;

class ArmstrongNum
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a three-digit number: ");
		int num = obj.nextInt();
		
		int origNum = num;
		int sum = 0;

		while(num > 0)
		{
			int lastdigit = num % 10;
			sum += lastdigit * lastdigit * lastdigit;
			num = num / 10;
		}

		if (sum == origNum)
		{
			System.out.println(origNum + " is an Armstrong number");
		}
		else
		{
			System.out.println(origNum + " is not an Armstrong number");
		}
	}
}

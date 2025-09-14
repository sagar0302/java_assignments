import java.util.Scanner;

class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter minimum two digit number: ");
		int num = obj.nextInt();
		
		int revNum = 0;
		int origNum = num;
		while(num != 0)
		{
			int rem = num % 10;
			num = num / 10;
			revNum = revNum * 10 + rem;
		}
		System.out.println("The reverse of " + origNum + " is:" + revNum);
	}

}
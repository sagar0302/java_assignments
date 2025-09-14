import java.util.Scanner;
class GreatestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();

		System.out.println("Enter number3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2)
		{
			if (num1 > num3)
			{
				System.out.println(num1 + " is the greatest number");
			}
			else
			{
				System.out.println(num3 + " is the greatest number");
			}
		}
		else
		{
			if (num2 > num3)
			{
				System.out.println(num2 + " is the greatest number");
			}
			else
			{
				System.out.println(num3 + " is the greatest number");
			}
		}
	}	
}
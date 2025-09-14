import java.util.Scanner;

class StringReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the text: ");
		String str = sc.nextLine();

		String str1 = str.toLowerCase();
		String reversedStr = new StringBuilder(str1).reverse().toString();

		System.out.println("The Reversed string is: \n" + reversedStr);
	}
}
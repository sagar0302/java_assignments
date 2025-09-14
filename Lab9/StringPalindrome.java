import java.util.Scanner;

class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		String str1 = str.toLowerCase();
		String reversedStr = new StringBuilder(str1).reverse().toString();

		if (str1.equals(reversedStr))
		{
			System.out.println("The string is a Palindrome");
		}
		else
		{
			System.out.println("The string is not a Palindrome");
		}
	}
}
import java.util.*;

@FunctionalInterface
interface Concatenation
{
	String join(String a, String b);
}

class ConcatenationMain
{
	public static void main(String[] args)
	{
		Concatenation concat = (s1, s2) -> s1 + " " + s2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1 = sc.nextLine();

		System.out.println("Enter the String2: ");
		String str2 = sc.nextLine();
		
		String res = concat.join(str1, str2);
		System.out.println("The Concatenated string is: " + res);
	}
}
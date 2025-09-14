import java.util.Scanner;

class StringWordCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String str = sc.nextLine();
	
		String[] words = str.split("\s+");
		int count = words.length;
		System.out.println("The number of words in a sentence are: " + count);
	}
}

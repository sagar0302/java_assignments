import java.util.*;

class RepeatString
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String text = obj.nextLine();
		
		System.out.println("Enter a integer: ");
		int num = obj.nextInt();

		for(int i=1; i<=num; i++)
		{
			System.out.println(text);
			
		}
	}
}
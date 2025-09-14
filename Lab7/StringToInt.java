import java.util.Scanner;

class StringToInt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		try
		{
			System.out.println("Enter the string: ");
			String str = sc.next();
		
			int num = Integer.parseInt(str);
			System.out.println("Converted string to integer is: " + num);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}
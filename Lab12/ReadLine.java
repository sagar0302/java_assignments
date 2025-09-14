import java.io.*;
import java.util.Scanner;

class ReadLine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the file to read: ");
		String name = sc.nextLine();

		File file = new File(name);

		try (BufferedReader bf = new BufferedReader(new FileReader(file)))
		{
			String Line;
		
			while ((Line = bf.readLine()) != null)
			{
				System.out.println(Line);
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
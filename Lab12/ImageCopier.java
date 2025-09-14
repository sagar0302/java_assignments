import java.io.*;
import java.util.Scanner;

class ImageCopier
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the image file: ");
		String img = sc.nextLine();
		
		File f1 = new File(img);

		System.out.print("Enter the name for the image copy file: ");
		String img1 = sc.nextLine();

		try
		{
			FileInputStream fin = new FileInputStream(img);
			FileOutputStream fout = new FileOutputStream(img1);

			byte[] jpg = new byte[1024];
			int Read;

			while ((Read = fin.read(jpg)) != -1)
			{
				fout.write(jpg, 0, Read);
			}

			System.out.println("\nImage copied successfully!");
			System.out.println("Source: " + img);
			System.out.println("Copied to: " + img1);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}


import java.io.*;
import java.util.Scanner;

class FileInfo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
		String txt = sc.nextLine();

		File f1 = new File(txt);

		if (f1.exists()) 
		{
            		System.out.println("File Exists: Yes");
            		System.out.println("File size: " + f1.length() + " bytes");

			try (FileInputStream fin = new FileInputStream(f1)) 
			{
    				int Data;
    
    				while ((Data = fin.read()) != -1) 
				{
        				System.out.print((char) Data);
    				}
			} 
			catch (IOException e) 
			{
    				System.out.println(e);
			}
		}
		else 
		{
            		System.out.println("The file not exist");
		}
	}
}
import java.util.Scanner;

class InvalidBinaryException extends Exception
{
	public InvalidBinaryException(String message)
	{
		super(message);
	}
}

class BinaryToDeci
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String bin = obj.nextLine();

		try
		{
			for(int i=0; i<bin.length(); i++)
			{
				char bit = bin.charAt(i);
				if (bit != '0' && bit != '1')
				{
					throw new InvalidBinaryException("Not a valid Binary number");
				}
			}

		int binary = Integer.parseInt(bin);
			
		int origbin = binary;
		int decimal = 0;
		int base = 1;

		do
		{
			int lastdigit = binary % 10;
			decimal += lastdigit * base;
			base = base * 2;
			binary = binary / 10;
		} while(binary != 0);

		System.out.println("The binary number " + origbin + " to decimal number is: " + decimal);
		}
		catch(InvalidBinaryException e)
		{
			System.out.println(e);
		}
	}
}
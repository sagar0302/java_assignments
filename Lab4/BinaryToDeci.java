import java.util.*;

class BinaryToDeci
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		int binary = obj.nextInt();
		
		int origbin = binary;
		int decimal = 0;
		int base = 1;

		do
		{
			int lastdigit = binary % 10;
			decimal += lastdigit * base;
			base = base * 2;
			binary = binary / 10;
		}while(binary != 0);
			
		System.out.println("The binary number " + origbin + " to decimal number is: " +  decimal);
	}
}
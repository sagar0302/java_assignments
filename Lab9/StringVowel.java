import java.util.Scanner;

class StringVowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String str = sc.nextLine();
	
		str = str.toLowerCase();

		int count = 0, a=0, e=0, i=0, o=0, u=0;
		for(int j=0; j<str.length(); j++)
		{
			char ch = str.charAt(j);

			if (ch == 'a')
			{
                		a++;
			}
            		else if (ch == 'e')
			{
                		e++;
			}
            		else if (ch == 'i')
			{
                		i++;
			}
            		else if (ch == 'o')
			{
                		o++;
			}
            		else if (ch == 'u')
			{
                		u++;
			}
		}

		System.out.println("Count of a: " + a);
        	System.out.println("Count of e: " + e);
        	System.out.println("Count of i: " + i);
        	System.out.println("Count of o: " + o);
        	System.out.println("Count of u: " + u);
	}
}

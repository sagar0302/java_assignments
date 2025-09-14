import java.util.Scanner;

class StringArrange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of names you want: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String names[] = new String[n];

		for (int i = 0; i < n; i++) 
		{
        		System.out.print("Enter name " + (i + 1) + ": ");
            		names[i] = sc.nextLine();
        	}

		String temp;
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(names[i].compareTo(names[j]) > 0)
				{
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
	
		System.out.println("\nThe names in alphabetical order are: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(names[i]);
		}
	}
}
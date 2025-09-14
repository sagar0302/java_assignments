import java.util.Scanner;

class SwitchOperation
{
	public static void main(String[] args)
	{
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Number1: ");
		int x = obj.nextInt();

		System.out.println("Enter Number2: ");
		int y = obj.nextInt();
		
		System.out.println("Select one: \na. +\nb. -\nc. *\nd. /\n");
		String s = obj.next();
		
		char ch = s.charAt(0);
		
		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		float div = (float)x / y;
		
		switch(ch)
			{
				case '+' : 
					System.out.println(x + " + "+ y + " is "+ sum);
				        break;
		
				case '-' : 
					System.out.println(x + " - " + y + " is "+ sub);
					break;
				
				case '*' : 
					System.out.println(x + " * "+ y + " is "+ mul);
				        break;
				
				case '/' : 
					System.out.println(x + " / "+ y + " is "+ div);
				        break;
				
				default : 
					System.out.println("Please Select a valid option");
			}		
	}
}
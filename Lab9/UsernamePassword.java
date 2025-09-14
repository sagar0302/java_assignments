import java.util.Scanner;

class UsernamePassword
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username: ");
		String user = sc.nextLine();
		System.out.println("Enter password: ");
		String pass = sc.nextLine();

		boolean isUsername = true;

		if (user.length() < 8)
		{
			System.out.println("Invalid! Username must be at least 8 characters");
			isUsername = false;
		}

		if (Character.isDigit(user.charAt(0)))
		{
			System.out.println("Invalid! Username cannot start with a number");
			isUsername = false;
		}

		if (user.contains(" "))
		{
			System.out.println("Invalid! Username cannot contain spaces");
			isUsername = false;
		}

		boolean isPassword = true;

		if (pass.length() < 8)
		{
			System.out.println("Invalid! Password must be at least 8 characters");
			isPassword = false;
		}
		else
		{
			boolean isLower = false;
			boolean isUpper = false;
			boolean isDigit = false;

			for (char ch : pass.toCharArray())
			{
				if (Character.isLowerCase(ch))
				{
					isLower = true;
				}
				if (Character.isUpperCase(ch))
				{
					isUpper = true;
				}
				if (Character.isDigit(ch))
				{
					isDigit = true;
				}
			}

			if (!isLower) 
			{
                		System.out.println("Invalid! Password needs at least one lowercase");
                		isPassword = false;
            		}
            		if (!isUpper) 
			{
                		System.out.println("Invalid! Password needs at least one uppercase");
                		isPassword = false;
            		}
            		if (!isDigit) 
			{
                		System.out.println("Invalid! Password needs at least one number.");
                		isPassword = false;
            		}
		}

		if (isUsername && isPassword) 
		{
            		System.out.println("Username and Password is valid!");
        	} 
	}	
}
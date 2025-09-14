class IllegalMarkException extends Exception
{
	public IllegalMarkException(String message)
	{
		super(message);
	}
}

class MarkProcess
{
	int regno, marks;

	MarkProcess(int r, int m)
	{
		regno = r;
		marks = m;
	}
	
	void validation() throws IllegalMarkException
	{
		if(marks < 0)
		{
			throw new IllegalMarkException("Illegal Mark");
		}
	}

	void result()
	{
		if (marks >= 40)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}

class MarkProcessMain
{
	public static void main(String[] args)
	{
		MarkProcess obj = new MarkProcess(101, -4);

		try
		{
			obj.validation();
			obj.result();
		}
		catch(IllegalMarkException e)
		{
			System.out.println(e);
		}		
	}
}
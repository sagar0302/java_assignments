import java.util.Scanner;

class SumOfNatural implements Runnable
{
	int n;
	public SumOfNatural(int n)
	{
		this.n = n;
	}

	@Override
	public void run()
	{	
		int sum = 0;	
		for(int i=1; i<=n; i++)
		{
			sum += i;
		}
		System.out.println("Sum: " + sum);
	}
}

class Factorial implements Runnable
{
	int n;
	public Factorial(int n)
	{
		this.n = n;
	}
	
	@Override
	public void run()
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact *= i;
			System.out.println("Factorial: " + fact);
		}
	}
}

class RunnableMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		SumOfNatural s = new SumOfNatural(num);
		Thread t = new Thread(s);
		t.start();

		Factorial f = new Factorial(num);
		Thread t1 = new Thread(f);
		t1.start();
	}
}
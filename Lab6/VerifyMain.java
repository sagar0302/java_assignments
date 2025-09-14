import java.util.*;

@FunctionalInterface
interface Verify
{
	Boolean check(int a);
}

class VerifyMain
{
	public static void main(String[] args)
	{
		Verify prime = (n) -> {
			for (int i=2; i*i<=n; i++)
			{
				if (n % i == 0)
				{
					return false;
				}
			}
			return true;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is prime: ");
		int primeNo = sc.nextInt();
		
		boolean res = prime.check(primeNo);
		
		System.out.println(res);
	}
}
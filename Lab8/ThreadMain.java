class PrimeThread extends Thread 
{
	@Override
    	public void run() 
	{
        	int count = 0, num = 2;

        	while (count < 25) 
		{
            		if (isPrime(num)) 
			{
                		System.out.print(num + " ");
                		count++;
  			}
        		num++;
		}
        	System.out.println();
    	}

    	boolean isPrime(int n) 
	{
        	if (n <= 1) return false;
        	for (int i = 2; i <= n / 2; i++) 
		{
            		if (n % i == 0) return false;
        	}
        	return true;
    	}
}

class FibonacciThread extends Thread 
{
	@Override
    	public void run() 
	{
        	long n1 = 0, n2 = 1, n3;

        	for (int i = 1; i <= 50; i++) 
		{
            		System.out.print(n1 + " ");
            		n3 = n1 + n2;
            		n1 = n2;
            		n2 = n3;

            		if (i == 25) 
			{
                		try 
				{
                    			Thread.sleep(2000);
                		}
				catch (InterruptedException ex) 
				{
                    			System.out.println(ex);
                		}

                		PrimeThread p = new PrimeThread();
                		p.run();
            		}
        	}
    	}
}

class ThreadMain 
{
    public static void main(String[] args) 
	{
        	FibonacciThread f = new FibonacciThread();
        	f.start();
    	}
}

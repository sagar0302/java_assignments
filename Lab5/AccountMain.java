import java.util.*;

class Account
{
	int accNo;
	String name, accType;
	double accBalance;

	void setValues(int no, String n, String type, double bal)
	{
		accNo = no;
		name = n;
		accType = type;
		accBalance = bal;
	}

	void deposit(double amt)
	{
		accBalance += amt;
		System.out.println("Deposited: " + amt);
	}

	void withdraw(double amt)
	{
		accBalance -= amt;
		System.out.println("Withdrawn: " + amt);
	}

	double checkBalance()
	{
		return accBalance;
	}
}

class SavingsAccount extends Account
{
	void deposit(double amt)
	{
		if (amt > 50000)
		{
			System.out.println("Can deposit only up to 50000 at once");
		}
		else
		{
			super.deposit(amt);
		}
	}

	void withdraw(double amt)
	{
		if (accBalance - amt < 1000)
		{
			System.out.println("Minimum balance of 1000 required");
		}
		else
		{
			super.withdraw(amt);
		}
	}
}

class PrivilegedAccount extends Account
{
	void withdraw(double amt)
	{
		if (accBalance - amt < -5000)
		{
			System.out.println("Overdraft limit of 5000 exceeded");
		}
		else
		{
			super.withdraw(amt);
		}
	}
}

class AccountMain
{
	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount();
		sa.setValues(101, "Kiran", "Savings", 5000);

		sa.deposit(60000);
		sa.deposit(20000);
		sa.withdraw(4500);
		sa.withdraw(4000);

		PrivilegedAccount pa = new PrivilegedAccount();
		pa.setValues(201, "Alex", "Privileged", 2000);

		pa.deposit(50000);
		pa.withdraw(6000);
		pa.withdraw(2000);

		System.out.println("Final Balance (Savings): " + sa.checkBalance());
		System.out.println("Final Balance (Privileged): " + pa.checkBalance());
	}
}

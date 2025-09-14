import java.util.Scanner;

class Emp 
{
    int empCode;
    String name;
    int basicPay;
    float DA, HRA, grossPay;

    void set() 
	{
        	Scanner obj = new Scanner(System.in);

        	System.out.println("Enter Employee Code: ");
        	empCode = obj.nextInt();
	
	    	obj.nextLine(); 

        	System.out.println("Enter Employee Name: ");
        	name = obj.nextLine();

        	System.out.println("Enter Basic Pay: ");
        	basicPay = obj.nextInt();
    	}

    void GrossPay() 
	{
        	if (basicPay < 3500) 
		{
            		DA = 0.45f * basicPay;
            		HRA = 0.20f * basicPay;
        	} 
		else 
		{
            		DA = 0.50f * basicPay;
            		HRA = 1000;
        	}
        	grossPay = basicPay + DA + HRA;
    	}

    void display() 
	{
        	System.out.println("Employee Code: " + empCode);
        	System.out.println("Name: " + name);
        	System.out.println("Basic Pay: " + basicPay);
        	System.out.println("DA: " + DA);
        	System.out.println("HRA: " + HRA);
        	System.out.println("Gross Pay: " + grossPay);
    	}
}

class EmpMain 
{
    public static void main(String[] args) 
	{
        	Emp e = new Emp();
        	e.set();
        	e.GrossPay();

        	System.out.println("\nEmployee Details: ");
        	e.display();
    	}
}

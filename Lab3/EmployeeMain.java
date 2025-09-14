import java.util.*;

class Employee
{
	int empid;
	String empname, design;
	float salary;
	
	void set()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		empid = obj.nextInt();
		
		System.out.println("Enter the employee name: ");
		empname = obj.next();

		System.out.println("Enter the designation: ");
		design = obj.next();

		System.out.println("Enter the salary: ");
		salary = obj.nextFloat();
	}

	void display()
	{
		System.out.println("Employee id: " + empid);
		System.out.println("Employee name: " + empname);
		System.out.println("Designation: " + design);
		System.out.println("Salary: " + salary);
	}
}

class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.set();
		
		Employee emp2 = new Employee();
		emp2.set();

		System.out.println("\nEmployee details are: ");
		emp1.display();
		emp2.display();
	}
}
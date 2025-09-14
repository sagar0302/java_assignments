import java.util.*;

class Employee
{
	int empid, salary;
	String ftname, ltname, dept;

	public Employee(int id, String fn, String ln, String d, int s)
	{
		empid = id;
		ftname = fn;
		ltname = ln;
		dept = d;
		salary = s;
	}
}
class Comp implements Comparator<Employee>
{
	public int compare(Employee obj1, Employee obj2)
	{
		int fn = obj1.ftname.compareTo(obj2.ftname);

		if (fn == 0)
		{
			return obj1.ltname.compareTo(obj2.ltname);
		}
		
		return fn;
	}
}
class EmployeeMain
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "Sagar", "Chavan", "IT", 75000);
        	Employee e2 = new Employee(105, "Alex", "Smith", "HR", 60000);
        	Employee e3 = new Employee(103, "Sagar", "Jadhav", "Finance", 80000);
        	Employee e4 = new Employee(102, "Kiran", "Patil", "IT", 70000);
        	Employee e5 = new Employee(104, "Alex", "Jones", "Marketing", 65000);
		
		Comp c = new Comp();
		TreeSet<Employee> ts = new TreeSet<Employee>(c);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
	
		for(Employee e : ts)
		{	
			System.out.println("\nEmpID: " + e.empid);
			System.out.println("First name: " + e.ftname);
			System.out.println("Last name: " + e.ltname);
			System.out.println("Department: " + e.dept);
			System.out.println("Salary: " + e.salary);
		}
	}
}
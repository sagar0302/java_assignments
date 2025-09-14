class EmployeeSample
{
	int age;
	String name, address;
	double salary;
	long phoneno;

	EmployeeSample(String name, int age, long phoneno, String address, double salary)
	{
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.address = address;
		this.salary = salary;
	}

	void printSalary()
	{
		System.out.println("Salary: Rs. " + salary);
	}

}

class Manager extends EmployeeSample
{
	String department;

	Manager(String name, int age, long phoneno, String address, double salary)
	{
		super(name, age, phoneno, address, salary);
		department = department;
	}
}

class EmployeeSampleMain
{
	public static void main(String[] args)
	{
		Manager manager = new Manager("Sagar Chavan", 20, 9090901234L, "TechPark", 85000);

		manager.printSalary();
	}
}
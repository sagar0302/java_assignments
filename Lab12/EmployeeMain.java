import java.io.*;

class Employee implements Serializable
{
	int id;
	String name, dept;
	
	Employee(int i, String n, String d)
	{
		id = i;
		name = n;
		dept = d;
	}
	public String toString()
	{
		return "ID: " + id + ", Name: " + name + ", Department: " + dept;
	}
}
class EmployeeMain
{
	public static void main(String[] args) throws ClassNotFoundException,IOException
	{
		Employee e1 = new Employee(101, "Radheshyam", "Lawyer");
		Employee e2 = new Employee(102, "Shyamsunder", "Engineer");
		
		Employee[] listOut = new Employee[2];
		listOut[0] = e1;
		listOut[1] = e2;
		
		FileOutputStream fout = new FileOutputStream("emp.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(listOut);

		out.close();
		fout.close();

		FileInputStream fin = new FileInputStream("emp.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee[] listIn = (Employee[]) in.readObject();

		for (Employee emp : listIn)
		{
			System.out.println(emp);
		}

		in.close();
		fin.close();
	}
}
import java.util.*;

class Student
{
	int rollno, age;
	String name;
	double totalmark;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Roll No: ");
		rollno = sc.nextInt();

		System.out.println("Enter the Age: ");
		age = sc.nextInt();

		System.out.println("Enter the Name: ");
		name = sc.nextLine();

		System.out.println("Enter the Total Marks: ");
		totalmark = sc.nextDouble();		
	}
	
	void disp()
	{
		System.out.println("\nRoll No: " + rollno);
		System.out.println("Age: " + age);
		System.out.println("Name: " + name); 
		System.out.println("Total Marks: " + totalmark);
	}

	void findgrade()
	{
		if(totalmark > 900)
		{
			System.out.println("Grade A");
		}
		else if(totalmark > 700)
		{
			System.out.println("Grade B");
		}
		else if(totalmark > 500)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}

class ProjectStudent extends Student
{
	int projid;
	String projtitle, company, projgrade;
	
	void getPDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the Project ID: ");
		projid = sc.nextInt();
		
		System.out.println("Enter the Project Title: ");
		projtitle = sc.nextLine();

		System.out.println("Enter the Company name: ");
		company = sc.next();

		System.out.println("Enter the Project Grade: ");
		projgrade = sc.next();
	}

	void dispPDetails()
	{
		System.out.println("\nProject ID: " + projid);
		System.out.println("Project Title: " + projtitle);
		System.out.println("Company: " + company);
		System.out.println("Project Grade: " + projgrade);
	}
}

class StudentMain
{
	public static void main(String[] args)
	{
		ProjectStudent obj = new ProjectStudent();
		obj.get();
		obj.disp();
		obj.findgrade();
		obj.getPDetails();
		obj.dispPDetails();
	}
}
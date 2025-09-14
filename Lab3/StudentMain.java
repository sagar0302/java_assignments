import java.util.*;

class Student
{
	int rollno;
	String name;
	float mark1, mark2, mark3;
	double total, avg;
	
	void set()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Roll No: ");
		rollno = obj.nextInt();

		System.out.println("Enter the name of a student: ");
		name = obj.next();

		System.out.println("Enter the mark1: ");
		mark1 = obj.nextFloat();

		System.out.println("Enter the mark2: ");
		mark2 = obj.nextFloat();

		System.out.println("Enter the mark3: ");
		mark3 = obj.nextFloat();

		total = mark1 + mark2 + mark3;
		avg = total / 3.0;
	}

	void display()
	{
		System.out.println("\nRoll No is: " + rollno);
		System.out.println("Name is: " + name);
		System.out.println("Mark1 is: " + mark1);
		System.out.println("Mark2 is: " + mark2);
		System.out.println("Mark3 is: " + mark3);
		System.out.println("Total is: " + total);
		System.out.println("Average is: " + avg);
	}
}

class StudentMain
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.set();
		
		System.out.println("\nStudent details are: ");
		s1.display();
	}
}

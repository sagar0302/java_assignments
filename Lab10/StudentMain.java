import java.util.ArrayList;
import java.util.ListIterator;

class Student
{
	int regno;
	String name;
	int marks;

	Student(int r, String n, int m)
	{
		regno = r;
		name = n;
		marks = m;
	}

	void display()
	{
		System.out.println("Registration No: " + regno);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}

class StudentMain
{
	public static void main(String[] args)
	{
		ArrayList<Student> st = new ArrayList<Student>();

		st.add(new Student(101, "Rob", 80));
		st.add(new Student(102, "Jame", 76));
		st.add(new Student(103, "Swift", 83));
		st.add(new Student(104, "Scarlet", 90));

		ListIterator<Student> i = st.listIterator();

		while(i.hasNext())
		{
			Student s = i.next();
			s.display();
		}
	}
}
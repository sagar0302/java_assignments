interface Result
{
	boolean checkStatus(int mark);
}

interface Classify
{
	String checkGrade(int average);
}

class Exam implements Result, Classify
{
	public boolean checkStatus(int mark)
	{
		if (mark >= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String checkGrade(int average)
	{
		if (average >= 60)
		{
			return "First class";
		}
		else if (average >= 50)
		{
			return "Second class";
		}
		else
		{
			return "Third class";
		}
	}
}

class ExamMain
{
	public static void main(String[] args)
	{
		Exam e = new Exam();

		int mark1 = 50;
		int average1 = 75;
		System.out.println("Mark: " + mark1 + " Status: " + e.checkStatus(mark1));
		System.out.println("Average: " + average1 + " Grade: " + e.checkGrade(average1));
	}
}
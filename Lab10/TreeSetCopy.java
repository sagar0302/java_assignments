import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

class TreeSetCopy
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(100);
		t.add(200);
		t.add(300);
		t.add(400);
		t.add(500);

		System.out.println("Original TreeSet: " + t);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int val = sc.nextInt();

		TreeSet<Integer> tr = new TreeSet<Integer>();

		for(Integer num : t)
		{
			if (num >= val)
			{
				tr.add(num);
			}
		}

		System.out.println("Elements in the second Treeset: ");

		Iterator<Integer> i = tr.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
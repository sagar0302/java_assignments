import java.util.*;
import java.util.stream.*;

class StringCount
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
        	list.add("Get");
        	list.add("Hello");
        	list.add("Hill");
        	list.add("Good");
        	list.add("White");
        	list.add("And");

		System.out.println("List of names: " + list);
		
		Scanner sc = new Scanner(System.in);
        	System.out.print("\nEnter the letter to count strings: ");
        	String let = sc.nextLine(); 

		String flet = let.substring(0, 1).toLowerCase();

		long num = list.stream().filter(name -> name.toLowerCase().startsWith(flet)).count();

		System.out.println("\nNumber of names starting with " + let + ": " + num);
	}
}
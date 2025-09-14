import java.util.*;

class TreeMapEntry
{
	public static void main(String[] args)
	{
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Triangle", 3);
		tm.put("Square", 4);
		tm.put("Rectangle", 4);
		tm.put("Circle", 0);

		System.out.println("TreeMap entries: ");

		Iterator<Map.Entry<String,Integer>> i = tm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry m = i.next();
			System.out.println("Key: " + m.getKey() + ", Value: " + m.getValue());	
		}

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a key: ");
		String key = sc.nextLine();
		if (tm.containsKey(key))
		{
			Integer value  = tm.get(key);
			System.out.println("The value for key " + key + " is: " + value);
		}
		else
		{
			System.out.println("Not Exist!");
		}
		
	}
}
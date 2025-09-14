import java.util.*;

class HashMapFreq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		String txt = sc.nextLine();
		txt = txt.toLowerCase();

		String[] words = txt.split("\\s+");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String str: words)
		{
			if (hm.containsKey(str)) 
			{
        			int Count = hm.get(str);
        			hm.put(str, Count + 1);
			} 
			else 
			{
    				hm.put(str, 1);
			}
		}

		Set<Map.Entry<String, Integer>> s = hm.entrySet();
		System.out.println("\nOutput: ");
		for(Map.Entry m: s)
			System.out.println(m.getKey() + " : " + m.getValue());
	}
}
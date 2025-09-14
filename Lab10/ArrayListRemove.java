import java.util.ArrayList;

class ArrayListRemove
{
	public static void main(String[] args)
	{
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Pink");
		color.add("Orange");

		System.out.println("Original ArrayList: " + color);

		color.set(1, "Purple");

		System.out.println("Updated ArrayList: " + color);
		System.out.println("Removing last element: " + color.remove(color.size()-1));

		System.out.println("Final ArrayList: ");
		for(String s: color)
			System.out.println(s);
	}
}
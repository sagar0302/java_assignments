import java.util.ArrayList;

class ArrayListPart
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

		ArrayList<String> extract = new ArrayList<>(color.subList(1, 4));
		System.out.println("Extracted Portion of an ArrayList: " + extract);
	}
}
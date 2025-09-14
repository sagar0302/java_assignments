import java.util.Scanner;

class StringReplace
{
	public static void main(String[] args)
	{
		String text = "You are not happy because you are well. You are well because you are happy. You are not depressed because trouble has come, but trouble has come because you are depressed.";
		String replaceText = text.replace("You", "They").replace("you", "they");
		System.out.println("Replaced string: \n" + replaceText);
	}
}

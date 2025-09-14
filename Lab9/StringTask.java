class StringTask
{
	public static void main(String[] args)
	{
		String s1 = new String("Software Training and Development Centre");
		System.out.println("Length of String: " + s1.length());
		System.out.println("The string ends with 'Centre': " + s1.endsWith("Centre"));
		char[] ch = new char[50];
		s1.getChars(9,16,ch,1);
		System.out.println("Extracted characters: ");
		System.out.println(ch);
	}
}
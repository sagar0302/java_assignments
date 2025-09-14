class Perimeter {
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);
		
		float perimeter = (float)2 * (length + breadth);
		
		System.out.println("Perimeter of a rectangle is " + perimeter);
	}
}

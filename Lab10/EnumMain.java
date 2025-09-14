enum Size
{SMALL, MEDIUM, LARGE, EXTRALARGE;}

class EnumMain
{
	public static void main(String[] args)	
	{
		Size pizzaSize = Size.LARGE;		
	
		switch(pizzaSize)
		{
			case SMALL:
				System.out.println("Pizza size is small");
				break;

			case MEDIUM:
				System.out.println("Pizza size is medium");
				break;

			case LARGE:
				System.out.println("Pizza size is large");
				break;
	
			case EXTRALARGE:
				System.out.println("Pizza size is extralarge");
		}
	}
}
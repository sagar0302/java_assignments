abstract class Animals
{
	abstract void eat();
	abstract void makeNoise();
}

class Cats extends Animals
{
	void makeNoise()
	{
		System.out.println("Cats meow");
	}

	void eat()
	{
		System.out.println("Cats eat fish");
	}
}

class Dogs extends Animals
{
	void makeNoise()
	{
		System.out.println("Dogs bark");
	}

	void eat()
	{
		System.out.println("Dogs eat bones");
	}
}

class AnimalsMain
{
	public static void main(String[] args)
	{
		Cats c = new Cats();
		c.makeNoise();
		c.eat();

		Dogs d = new Dogs();
		d.makeNoise();
		d.eat();
	}
}

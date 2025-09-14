abstract class Vehicle
{
	abstract void color();
}

class Car extends Vehicle
{
	void color()
	{
		System.out.println("The color of the car is Red");
	}
}

class Bus extends Vehicle
{
	void color()
	{
		System.out.println("The color of the bus is Yellow");
	}
}

class VehicleMain
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.color();

		Bus b = new Bus();
		b.color();

		Vehicle ref;
		ref = c;
		ref.color();

		ref = b;
		ref.color();
	}
}

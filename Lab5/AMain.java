class A
{
	void dispmsg()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void dispmsg()
	{
		System.out.println("Class B");
	}
}

class C extends B
{
	void dispmsg()
	{
		System.out.println("Class C");
	}
}

class AMain
{
	public static void main(String[] args)
	{
		A objA = new A();
		System.out.println("Calling method from an object of A");
		objA.dispmsg();
	
		B objB = new B();
		System.out.println("Calling method from an object of B");
		objB.dispmsg();

		C objC = new C();
		System.out.println("Calling method from an object of C");
		objC.dispmsg();
	}
}
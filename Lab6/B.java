import package1.A;

class B extends A
{
	public static void main(String[] args)
	{
		B obj = new B();
		System.out.println("Protected a: " + obj.a);
		//System.out.println("Private b: " + obj.b);
		//System.out.println("Default c: " + obj.c);
		System.out.println("Public d: " + obj.d);
	}
}
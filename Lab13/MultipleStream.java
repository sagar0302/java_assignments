import java.util.stream.*;

class MultipleStream
{
	public static void main(String[] args)
	{
		Stream<Integer> s1 = Stream.iterate(5, n -> n * 5).skip(3).limit(10);
		s1.forEach(System.out::println);
	}
}
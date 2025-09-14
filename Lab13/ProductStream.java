import java.util.*;
import java.util.stream.*;

class Product
{
	int id;
	String name;
	String category;
	double price;

	public Product()
	{
	}

	public Product(int i, String n, String cat, double pz)
	{
		id = i;
		name = n;
		category = cat;
		price = pz;
	}

	public String toString()
	{
		return "ID=" + id + ", Name=" + name + ", Category=" + category + ", Price= Rs." + price;
	}
}
class ProductStream
{
	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<>();
		list.add(new Product(101, "Java Complete", "Books" , 400.0));
		list.add(new Product(102, "The Secret", "Books", 95.0));
		list.add(new Product(103, "Valorant", "Game", 999.0));
		list.add(new Product(104, "Alchemist", "Books", 149));
		
		System.out.println("Product List: ");
		for (Product p : list)
		{
			System.out.println(p);
		}

		System.out.println("\nProduct Category 'Books' with price > 100: ");
		Stream<Product> s1 = list.stream().filter(p -> p.category.equals("Books") && p.price > 100);
		s1.forEach(System.out::println);
		
		System.out.println("\nTotal count: " + list.stream().count());

		double tPrice = list.stream().mapToDouble(p -> p.price).sum();
		System.out.println("\nTotal price: Rs. " + tPrice); 
	}
}
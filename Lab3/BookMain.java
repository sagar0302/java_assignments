class Book
{
	String title, author;
	double price;

	Book()
	{
		this.title = "Kosla";
		this.author = "Bhalchandra Nemade";
		this.price = 449.00;
	}
	
	Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Title: " + this.title);
        	System.out.println("Author: " + this.author);
        	System.out.println("Price: Rs. " + this.price);
	}
}

class BookMain
{
	public static void main(String[] args)
	{
		System.out.println("Details of Book1");
		Book book1 = new Book();
		book1.display();
	
		System.out.println("\nDetails of Book2");
		Book book2 = new Book("The Alchemist", "Paulo Coelho", 249.00);
		book2.display();
	}
}
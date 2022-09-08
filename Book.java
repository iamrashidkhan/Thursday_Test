import java.util.*;
import java.util.stream.Collectors;  //Importing the stream collectors
public class Book
{
	String id;
	String name;
	String author;
	String category;
	float price;
	
	//Parameterized constructor used as a setter
	public Book(String id,String name,String author, String category,float price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.category=category;
		this.price=price;
	}

	//To display the cont3nt
	void display()
	{
		System.out.println("The book id "+id +" having name "+name+" and wrote by "+author+ " is of category "+category+ " and of price "+price);
	}
	
	public static void main(String[] args) {
		Book b =new Book("B123", "AI", "abc", "science", 120);
		Book b1 =new Book("B345", "ML", "xyz", "fiction", 150);
		Book b2 =new Book("B567", "Java", "pqr", "technology", 180);
		b.display();
		b1.display();
		b2.display();
		
		ArrayList<Book> mylist=new ArrayList<Book>();
		mylist.add(b);                            //add a new Book object into the collection
		mylist.add(b1);								//add a new Book object into the collection
		mylist.add(b2);								//add a new Book object into the collection
		
		//searching a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.name).collect(Collectors.toList());
		System.out.println(searchByTitle);
	
		//searching a book based on author and if found display the details
		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);
		
	
	}

}
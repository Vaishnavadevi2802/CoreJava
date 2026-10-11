package Constructor;

public class Book {
	String title;
	String author;
	int price;
	// Default Constructor
	Book(){
		System.out.println("Default Constructor Called!");
		title="Power of Subconsices";
		author="David";
		price=350;
		
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
	

	public static void main(String[] args) {
		Book bl=new Book();
		
	}

}

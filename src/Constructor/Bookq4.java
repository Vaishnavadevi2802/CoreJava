package Constructor;

public class Bookq4 {
	String title;
	String author;
	int price;
	
	Bookq4 (String title,String a,int p){
		//title=t;
		this.title=title;
		author=a;
		price=p;
		
	}

	public void displaydetails() {
		System.out.println("Book title is:"+title);
		System.out.println("Book Author name is:"+author);
		System.out.println("Book price is:"+price);

	}
	public static void main(String[] args) {
		Bookq4 b1=new Bookq4("Alchemist","David",500);
		b1.displaydetails();
		System.out.println();
		Bookq4 b2=new Bookq4("Secret","Sanju",500);
		b2.displaydetails();
		
			
				
	}

}

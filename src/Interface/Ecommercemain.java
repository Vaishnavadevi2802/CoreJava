package Interface;

public class Ecommercemain {

	public static void main(String[] args) {
		Amazon A1=new Amazon();
		A1.placeOrder("Soap",10);
		
		Flipkart F1=new Flipkart();
		F1.placeOrder("Dress", 2);

	}

}

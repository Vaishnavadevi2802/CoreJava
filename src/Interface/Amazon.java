package Interface;

public class Amazon implements Ecommerce{

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println("Order placed on amazon:"+item +quantity );
		
	}

	

	}



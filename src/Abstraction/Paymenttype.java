package Abstraction;

public class Paymenttype {

	public static void main(String[] args) {
		Creditcardpayment card1=new Creditcardpayment();
		card1.makepayment();
		
		UPIPayment upi1=new UPIPayment();
		upi1.makepayment();

	}

}

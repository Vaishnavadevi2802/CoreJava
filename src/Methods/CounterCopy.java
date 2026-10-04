package Methods;

public class CounterCopy {

	public static void main(String[] args) {
		Counter.incrementStatic();
		Counter.incrementStatic();
		
		Counter c1 = new Counter();
		c1.incrementNonStatic();
		c1.incrementNonStatic();
	
	}

}

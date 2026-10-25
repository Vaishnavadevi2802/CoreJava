package Interface;

public class maininterface {

	public static void main(String[] args) {
		Car C1=new Car();
		C1.start();
		C1.refuel(10);
		
		Bike B1=new Bike();
		B1.start();
		B1.refuel(60);
	}

}

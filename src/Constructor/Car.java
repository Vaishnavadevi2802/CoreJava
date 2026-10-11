package Constructor;

public class Car {
	String make;
	String model;
	int year;
	
	Car(String make,String mdl,int y){
		//make=m;
		this.make=make;
		model=mdl;
		year=y;
	}
	

	public void displaycarinfo() {
		System.out.println("Car Making is:"+make);
		System.out.println("Car Model is:"+model);
		System.out.println("Manufacturing Year is:"+year);
		
	}
	public static void main(String[] args) {
		Car c1=new Car("Honda","ivtec",2019);
		c1.displaycarinfo();
		Car c2=new Car("BMW","New X5",2026);
		c2.displaycarinfo();
	}

}

package MethodOverloading;

public class Printer {
	void value(int a) {
		System.out.println("Value:"+a);
		
	}
	void multiply(double b,double c) {
		System.out.println("Multiply(double):"+(b*c));
		
	}
	void value2(String a) {
		System.out.println("Stringname:"+a);
	}
		
		public static void main(String[] args) {
			Printer p1=new Printer();
			p1.value(10);
			p1.multiply(5.5,2.0);
			p1.value2("Hello");
		

	}

}

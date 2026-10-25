package MethodOverloading;

public class Calculator {
void add(int a,int b) {
	System.out.println("Sum:"+(a+b));
}
void add(int a,int b,int c) {
	System.out.println("Sum:"+(a+b+c));
}
void multiply(double a ,double b) {
	System.out.println("Multiplication(double):"+(a*b));
}
void show (String a,int num) {
	System.out.println("Stringfirst:"+a+",Number:"+num);

}
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(5,10);
		c1.add(10,20,30);
		c1.multiply(5.5,2.5);
		c1.show("Hello",10);
		

	}

}

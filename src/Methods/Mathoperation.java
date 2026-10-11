package Methods;

public class Mathoperation {

	public static void multiplynumbers(int a,int b) {
		int results1=a*b;
		System.out.println("Multiplication result is :"+results1);

	}
	public void addnumbers(int c,int d) {
		int sum=c+d;
		System.out.println("Sum is:"+sum);
	}
     public static void main(String[]args) {
    	 multiplynumbers(10,20);
    	 Mathoperation m1=new Mathoperation();
    	 m1.addnumbers(20,20);
     }
}

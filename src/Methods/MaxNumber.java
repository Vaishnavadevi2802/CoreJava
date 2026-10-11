package Methods;

public class MaxNumber {

	public static void findmax(int a,int b ,int c) {
		int max;
		
		if(a>=b && a>=c) {
			max=a;
			
		}else if (b>=a && b>=c) {
			max = b;
		}else {
			max=c;
			
		}
		System.out.println("Maximum number is:"+max);

	}
	public static void main(String[]args) {
		MaxNumber m1=new MaxNumber();
		m1.findmax(100,200,300);
	}

}

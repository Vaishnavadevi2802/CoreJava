package Array;

public class Evenodd {

	public static void main(String[] args) {
		int[]arr= {12,14,16,6,18,7,3};
		
		System.out.println("Even Numbers:");
		for(int num:arr) {
			if (num %2 ==0) {
				System.out.print(num+" ");
				
			}
		}
		System.out.println("\nOdd Numbers:");
		for (int num:arr) {
			if (num %2 !=0) {
				System.out.print(num+" ");
			}
		}

	}

}

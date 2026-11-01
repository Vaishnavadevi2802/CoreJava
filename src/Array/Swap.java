package Array;

public class Swap {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		System.out.println("Array before swapping:");
		for (int num:arr) {
			System.out.print(num+" ");
		}
         int temp=arr[0];
         arr[0]=arr[arr.length-1];
         arr[arr.length-1]=temp;
         
         System.out.println("\nArray after swapping:");
         for (int num:arr) {
        	 System.out.print(num +" ");
         }
	}

}

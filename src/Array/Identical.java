package Array;
import java.util.Arrays;
public class Identical {

	public static void main(String[] args) {
		int[]a= {1,5,3};
		int []b= {3,5,1};
		
		if (Arrays.equals(a,b))
			System.out.println("Array are identical");
		else
			System.out.println("Array are not identical");

	}

}

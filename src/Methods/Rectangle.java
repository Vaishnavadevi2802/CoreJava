package Methods;

import java.util.Scanner;

public class Rectangle {

	public static int calculatearea(int l,int W) {
		System.out.println("Lenth:"+l+",Width:"+W);
		int area = l*W;
		return area;
	

	}
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of Lenth and Width:");
		int Lenth=sc.nextInt();
		int Width=sc.nextInt();
		System.out.println("Area of Rectangle:"+calculatearea(Lenth,Width));
	}

}

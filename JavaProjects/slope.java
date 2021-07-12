package practice;


import java.util.Scanner;
public class slope {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int x1,x2,y1,y2;
		
		System.out.print("ENTER X1");
		x1 = input.nextInt();
		System.out.print("ENTER X2");
		x2 = input.nextInt();
		System.out.print("ENTER Y1");
		y1 = input.nextInt();
		System.out.print("ENTER Y2");
		y2 = input.nextInt();
		
		//Slope formula 
		
		 float slope = (y2-y1)/(x2-x1);
		
		System.out.print("THE SLOPE IS " + slope);
		
		
	}
}

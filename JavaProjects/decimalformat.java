package practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class decimalformat {
		
	public static void main(String[]args) {
		
		int radius;
		double area,circumference;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the circle's radius:  " );
		radius = scanner.nextInt();
		
		area = Math.PI * Math.pow(radius, 2);
		circumference = 2* Math.PI * radius;
		
		
		//Round output to 3 decimal places.
		
		DecimalFormat fmt = new DecimalFormat("0.# # # ");
		
		System.out.println("The circle's are :" + fmt.format(area));
		System.out.print("The circle's circumference:" + fmt.format(circumference));
		
		

		
		
	}
	
	
	
	
	
}

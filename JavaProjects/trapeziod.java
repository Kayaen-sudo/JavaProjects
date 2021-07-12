package practice;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class trapeziod {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		float h = 7,a=5,b=10,area;
		
		area = ((a+b)/2) * h ;
	
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		
		System.out.print("THE AREA IS: " + fmt.format(area));
		
	
	}
}

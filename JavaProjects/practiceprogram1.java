package practice;


import java.util.Scanner;

public class practiceprogram1 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		   
		

			double x1,x2;


		    System.out.print("Enter the value of a: ");
		    double a = input.nextDouble();

		    System.out.print("Enter the value of b: ");
		    double b = input.nextDouble();

		    System.out.print("Enter the value of c: ");
		    double c = input.nextDouble();

			double d = b*b-4 *a*c;
		
		x1 = (-b + Math.sqrt(d)) / (2*a);

		x2 = (-b - Math.sqrt(d)) / (2*a);

	    System.out.print("The values are: ");
	    System.out.println(x1);
	    System.out.println(x2);
	 }
	
}
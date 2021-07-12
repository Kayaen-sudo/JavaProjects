import java.util.Scanner;

public class practiceprogram1 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		   
		double d = b*b-4 *a*c;

		double x1,x2;


		    System.out.print("Enter the value of a: ");
		    double a = input.nextDouble();

		    System.out.print("Enter the value of b: ");
		    double b = input.nextDouble();

		    System.out.print("Enter the value of c: ");
		    double c = input.nextDouble();


		x1 = (-b + Math.sqrt(d)) / (2*a);

		x2 = (-b - Math.sqrt(d)) / (2*a);

		
	 }
	
}
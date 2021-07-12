package practice;
import java.util.Scanner;
import java.util.Random;


public class parallelogramRANDOM {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
		
		int a,b,h,area,perimeter;
		
		 a = generator.nextInt(30)+10;
	      System.out.println("From 10 to 30: " + a);


	     b = generator.nextInt(30)+10;
	      System.out.println("From 10 to 30: " + b);
		
	     h = generator.nextInt(30)+10;
	      System.out.println("From 10 to 30: " + h);
		
	      area = b*h;
	      
	      perimeter = 2*(a+b);
		
	      System.out.println("THE AREA: " + area);	
	      System.out.println("THE PERIMETER " + perimeter);
	      
		
		
 }
}
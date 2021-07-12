package practice;

import java.util.Scanner;
import java.util.Random;

public class RandomIntSINCOS {

public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
		
		
	      int num1,num2,num3;
	      float s,c;

	      num1 = generator.nextInt(20)+1;
	      System.out.println("From 1 to 20: " + num1);


	      num2 = generator.nextInt(20)+1;
	      System.out.println("From 1 to 20: " + num2);

	      num3 = num1+num2;
	      
	      
	     c = (float) Math.cos(90) ;
	     s = (float) Math.sin(90);
	      
	      System.out.println("Sum of both numbers: " + num3);	
	      System.out.println("The cosine of " +num3 + " is" + c);
	      System.out.println("The sine of " +num3 + " is" + s);
		
		
	}
	
}

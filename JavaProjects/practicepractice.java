package practice;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class practicepractice {
		
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		
		int num1;
		float num2;
		
		
		num1 = gen.nextInt();
		System.out.println("Random integer " + num1);
		
		num2 = gen.nextInt(10);
		System.out.println("From 0 to 9" + num2);
		
		num1 = gen.nextInt(10) + 1;
	      System.out.println("From 1 to 10: " + num1);

	      num1 = gen.nextInt(15) + 20;
	      System.out.println("From 20 to 34: " + num1);

	      num1 = gen.nextInt(20) - 10;
	      System.out.println("From -10 to 9: " + num1);

	      num2 = gen.nextFloat();
	      System.out.println("A random float (between 0-1): " + num2);

	      num2 = gen.nextFloat() * 6;  // 0.0 to 5.999999
	      num1 = (int)num2 + 1;
	      System.out.println("From 1 to 6: " + num1);
		
		
		
		
	}
	
	
	
	
	
	
}

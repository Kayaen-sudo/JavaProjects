package practice;


import java.util.Scanner;

public class printsquare {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2,num3,product,square;
		
		
		System.out.print("ENTER FIRST NUMBER");
		num1 = input.nextInt();
		
		System.out.print("ENTER SECOND NUMBER");
		num2 = input.nextInt();
		
		System.out.print("ENTER THIRD NUMBER");
		num3 = input.nextInt();
		
		product = num1*num2*num3;
		square = (int) Math.pow(product, 2);
				
				
		System.out.println("The product is " + product);
		System.out.println("The square is " + square);
		
		
		
	}
	

}

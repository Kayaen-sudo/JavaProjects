package practice;

import java.util.Random;
import java.util.Scanner;

public class printrandomphonenumber {

	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		 Random rand = new Random();

		    int num1, num2, num3;

		    num1 = rand.nextInt (900) + 100;
		    num2 = rand.nextInt (643) + 100;
		    num3 = rand.nextInt (9000) + 1000;

		    System.out.println(num1+"-"+num2+"-"+num3);
	
	
	
}
}
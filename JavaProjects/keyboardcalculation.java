

//Write a program that calculates and prints the sum and product of all the digits in an integer value
//read from the keyboard

import  java.util.Scanner;


public class keyboardcalculation{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int num,mul,sum = 0,prod = 0 ;
	
	System.out.println("ENTER YOUR NUMBER ");
	num = input.nextInt();
	

		while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
		}
		while (num !=0){
			num= num*(num%10)
			num*num/10
			
			
		}
		
		
		
			System.out.println(sum); 

			System.out.println(mul); 
	}
}

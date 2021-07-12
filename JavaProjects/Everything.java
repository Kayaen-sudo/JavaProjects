package practice;
import java.lang.constant.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Random;
public class Everything {

	public static void main(String[]args) {
	

	      Scanner scan = new Scanner( System.in );
	      Random gen = new Random();
	    
	      

	     System.out.print("Please enter your city");
	     String city = scan.nextLine();  
	       		
	     System.out.print("Please enter your country's initials");
		 String initials = scan.nextLine();  
	     
		 System.out.print("Please enter your country");
	     String country = scan.nextLine();	  
	     
	     
	    
		int num1 = gen.nextInt(100)+1;
	
	     
	     System.out.println("New Account: " + city + initials + country + num1);
	   }
	 
	} 

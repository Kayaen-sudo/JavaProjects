package practice;
import java.lang.constant.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class degftodegc {
	
		public static void main(String[]args) {
		
			//Program that converts inches to feet
			
			Scanner input = new Scanner(System.in);
		      
			float degC,degF;
			
			
			System.out.print("Enter the temperature in Fahrenheit: ");
			degF = input.nextFloat(); 
			
			
			
			
			degC = 100*(degF-32)/180;
			
			
			 System.out.print("The temp in degC is " + degC);
			
		}
		
	}


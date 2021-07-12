package mortgage;

import java.util.Scanner;
import java.text.NumberFormat;

public class purchase {

	public static void main(String[] args) {
	
		final double taxRate = 0.06;
		int quantity;
		double subtotal,tax,totalcost,unitprice;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("Enter the quantity:");
		quantity = scanner.nextInt();
		
		System.out.print("Enter the unit price:");
		unitprice = scanner.nextDouble();
		
		subtotal = quantity * unitprice;
		
		tax = subtotal*taxRate ;
		totalcost = subtotal + tax;
		
		
		// Using the number format class
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		//Printing output 
		
		System.out.println("The subtotal is:" + fmt1.format(subtotal));
		System.out.println( "The tax is" + fmt1.format(tax));
		System.out.println("The Taxrate is:"+ fmt2.format(taxRate));
		
		System.out.println("The total is" + fmt1.format(totalcost));
		
		
		
		
	}
	
	
}

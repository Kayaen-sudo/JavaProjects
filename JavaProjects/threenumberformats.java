package practice;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.PrintStream;

public class threenumberformats {

	
	   public static void main(String[] args)
	   {
	      final double TAX_RATE = 0.06;  // 6% sales tax
	      int quantity;
	      double subtotal, tax, totalCost, unitPrice;

	      Scanner scan = new Scanner(System.in);
	      PrintStream output = new PrintStream(System.out);
	      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	      DecimalFormat fmt = new DecimalFormat ("0.##");

	      
	      
	      System.out.print("Enter the quantity: ");
	      quantity = scan.nextInt();

	      System.out.print("Enter the unit price: ");
	      unitPrice = scan.nextDouble();

	      subtotal = quantity * unitPrice;
	      tax = subtotal * TAX_RATE;
	      totalCost = subtotal + tax;

	      // Print output with appropriate formatting
	     
	      System.out.println("Total: " + fmt1.format(totalCost));
	      System.out.println("Total: $" + fmt.format(totalCost));
	      output.printf("Total: $%.2f",totalCost);
	      
	      
	      
	      
	      
	      
	   }
}

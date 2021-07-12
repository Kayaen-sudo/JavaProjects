package mortgage;

import java.util.Scanner;
public class mortgage1 {

		public static void main(String[] args) {
			
			
			    Scanner input = new Scanner(System.in);
			    
			    System.out.print("Enter the amount: ");
			    double amount = input.nextDouble();
			    System.out.print("Enter the annual interest percent: ");
			    double rate = input.nextDouble();
			    System.out.print("Enter amortization in years: ");
			    int period = input.nextInt();
			  
			    period = period * 12;
			    rate = rate / 100.0 / 12;
			    double numerator = rate * amount;
			    double denominator = Math.pow(1 + rate, period);
			    denominator = 1.0 - 1.0 / denominator;
			    double payment = numerator / denominator;
			    
			    System.out.print("The monthly payment is: $");
			    System.out.println(payment);
			  }

	
}

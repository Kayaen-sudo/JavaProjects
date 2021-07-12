//Kayaen Jardine 217466749
/*
Problem

  Customer API 
  public Customer (String name, double balance)
  public String getName()
  public double getBalance()
  public String toString()
  public void applyPercentageIncrease(double percetage) 
  
In the first part of the program the user will enter customer information and will create an array of Customer objects. 
In the second part this array used for various operations. The input and the output of this program is shown below.
*/



import java.util.*;
import java.text.*;

public class assignment3{
	public static void main (String[]args){

	Scanner input = new Scanner(System.in);
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	Customer customer[] = new Customer[5]; //Creates customer array
	
	
	
	System.out.println("For 5 customers enter the name and in the next line the balance.");                                                                                                                                                                                                                                                                                                                        
	
	// Loop which prompts user input to store into array object
	for(int i = 0;i < 5;i++){
		
		
	System.out.println("Enter name of customer:");// Prompts the user to enter a customer name
	String name = input.next();// Accepts user input
	
	System.out.println("Enter customer's balance:");//Prompts the user to enter a customer name
	double balance = input.nextDouble();//Accepts user input
	customer[i]=new Customer(name,balance);//Array of customer objects.

	}
	
	//Search for all customers who have more than $100
	
	System.out.println(" A Search for all customers who have more than $100:");
	
	//Loop to get the balances over $100
	for(int i = 0;i < customer.length;i++){
		if(customer[i].getBalance() > 100){
			
			System.out.println(customer[i].getName());// Outputs customer name stored in array using api 
		}		
	}

	int total = 0;
	//Loop Using average value algorithm
	for(int i = 0;i < customer.length;i++){
		total += customer[i].getBalance();
		
		double avg = (double)total/customer.length;
	}
		System.out.println("The average is " +(double)total/customer.length);
		
	//Using The Maximum in the array
	//customer with the highest balance
	
	Customer largest = customer[0];
	for(int i = 0; i < customer.length;i++){
		if(customer[i].getBalance() > customer[0].getBalance()){
			 largest = customer[i];
		}
	}
	System.out.println("The customer with the highest balance:"+customer[i].getName());
	
		//Show all accounts after a 5% balance increase
	
	for(int i = 0; i < customer.length;i++){
		customer[i].applyPercentageIncrease(5);
		System.out.println(" After a 5% increase	:"+customer[i].getName()+ "	with a balance of	" + fmt.format(customer[i].getBalance()));
	}

	
	}
}

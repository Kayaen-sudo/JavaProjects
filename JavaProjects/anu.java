//Kayaen Jardine 217466749
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

public class anu{
	public static void main (String[]args){

	Scanner scan = new Scanner(System.in);
	  Employee [] e = new Employee [10];
  Employee hold;
  int count=0;

  System.out.println("Enter name (or stop when finished");
  String name = scan.next();
  while (!name.equals("stop")&&count<10) {
   System.out.println("Enter job title");
   String job = scan.next();   
   System.out.println("Enter seniority as an int");
   int years = scan.nextInt();
   e[count++] = new Employee(name,job,years); 
   System.out.println("Enter name (or stop when finished");
   name = scan.next(); 
  }

// what is the salary for Mary ?
  for (int i=0; i<count; i++){
   if (e[i].getName().equals("Mary")) 
     System.out.println ("Mary gets $" + e[i].pay());
  }
 
// display all employees with salaries in ascending order

  for (int pass = 1; pass < count; pass++ ) { 
     for ( int i = 0; i < count-1; i++ ) {
       if ( e[i].pay() > e[i+1].pay() ) { 
          hold = e[i];         
          e[i] = e[i+1];  
          e[i+1] = hold;  
       }     
     }
  }
  System.out.println ("Employees with salaries is ascending order");

  for (int i=0; i<count; i++){
     System.out.println (e[i]);
  }
 }
}
//Kayaen Jardine 217466749

import java.util.*;
import java.text.*;

public class objectarray1{
	public static void main (String[]args){

	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	Employee e[] = new Employee[3];
	Employee hold;
	e[0]=new Employee("Mary","Analyst",6);
	e[1]=new Employee("Tom","Programmer",3);
	e[2]=new Employee("Stewart","Manager",10);




	for(int i = 0;i< e.length-1;i++){
		if(e[i].getName().contains("M")){
			System.out.println(e[i]+ " gets" +e[i].pay());
	
		}
	}
	
	System.out.println("Employees with salaries is ascending order:\t");
	hold = e[0];
    for (int pass= 1; pass<e.length; pass++) 
      for (int i=0; i<e.length-1; i++) 
          if(e[i].pay() > e[i+1].pay()) {
             hold=e[i];
             e[i]=e[i+1];
             e[i+1]=hold;
          }
	for(int i = 0;i<e.length;i++){
		System.out.println(e[i].getName()+ " working as "+e[i].getJob()+ " with salary "+ fmt.format(e[i].pay()));
		System.out.println(e[i].toString());
	}
}				
   }
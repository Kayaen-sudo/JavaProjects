//Kayaen Jardine 217466749

import java.util.*;
import java.text.*;

public class arrayobjects3{
	public static void main (String[]args){

	Scanner scan = new Scanner(System.in);
	
	Employee e[] = new Employee[3];
	int count=0;
	
	
	System.out.println("Enter name(or stop when finished");
	String name = scan.next();
	
	while(!name.equals("stop")&&count<3){
	System.out.println("Enter job title");
	String job =scan.next();
	System.out.println("Enter seniority");
	int years = scan.nextInt();
	e[count++] = new Employee(name,job,years);
	
	System.out.println("Enter name(or stop when finished");
	name = scan.next();
	}
	
	for(int i = 0;i < e.length; i++){
		
		if(e[i].getName().equals("Kayaen")){
		
		System.out.println("kayaen gets " +e[i].pay());
		}
		
	}
	
	Employee hold;
		for(int i = 0; i < e.length;i++){
			for(int j = 0; j < e.length-1;j++){
				if(e[j].pay() > e[j+1].pay());
				
				 hold = e[j];
				 e[j] = e[j+1];
				 e[j+1] = hold;
			
			}
	
		}
	System.out.println("Employees with salaries in ascending order");
	
	for(int i = 0;i < e.length;i++){
		System.out.println(e[i]);
	}


	}
}

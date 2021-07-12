package practice;

import java.util.Scanner;
import java.text.DecimalFormat;



public class week3tutorial {
	
	
Scanner scan = new Scanner(System.in){

double a,b,c;

System.out.print("Enter a value for a");
a = scan.nextDouble();
System.out.print("Enter a value for b");
b = scan.nextDouble();
System.out.print("Enter a value for c");
c = scan.nextDouble();

RationalNumber rn1,rn2,rn3,sum,top;

rn1 = new RationalNumber(a*b,c);
rn2 = new RationalNumber(a,b*c);
rn3 = new RationalNumber(a-b,b+c);
top = rn1.subtract(rn2);
sum = top.divide(rn3);

System.out.println(sum);


}

}
	
	
	
	
	
	
	


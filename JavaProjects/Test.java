package practice;
import java.util.Scanner;
public class Test {

	

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter value for A: "); //34
	double a = input.nextDouble();
	System.out.print("Enter value for B: "); //5
	double b = input.nextDouble();
	System.out.print("Enter value for C: "); //7
	double c = input.nextDouble();

	RationalNumber rn1, rn2, rn3, upper, sum;
	rn1 = new RationalNumber(a*b, c);
	rn2 = new RationalNumber(a, b*c);
	rn3 = new RationalNumber(a-b, b+c);
	upper = rn1.subtract(rn2);
	sum = new RationalNumber(upper.value(), rn3.value());


	System.out.println(sum.toString());

	}
}
	


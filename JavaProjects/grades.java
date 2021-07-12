import java.util.Scanner;
public class grades{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Please enter your grade ");
int grade = input.nextInt();

if (grade >= 90){
System.out.println("Your grade is an A+");
} else if (grade >= 80){
System.out.println("Your grade is an A");
} else if (grade >= 75){
System.out.println("Your grade is a B+");
} else if (grade >= 70){
System.out.println("Your grade is a B");
} else if (grade >= 65){
System.out.println("Your grade is a C+");
} else if (grade >= 60){
System.out.println("Your grade is an C");
} else if (grade >= 55){
System.out.println("Your grade is an D+");
} else if (grade >= 50){
System.out.println("Your grade is an D");
} else if (grade >= 40){
System.out.println("Your grade is an E");
} else {
System.out.println("Your grade is an F");
}

}
}

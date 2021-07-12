//Kayaen Jardine 217466749
 //imports the java class
import java.util.*;
import java.text.*;


public class readint {

	public static void main(String[]args){
	
		    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of years of programming experience: ");
    int experience = input.nextInt();
    System.out.print("Enter the degree (1 = PhD, 2 = MSc, 3 = BSc): ");
    int degree = input.nextInt();
    
    if(experience > 10){
      if(degree == 1){
        System.out.println("The salary will be $80,000.00");
      } else if(degree == 2){
        System.out.println("The salary will be $75,000.00");
      } else if(degree == 3){
        System.out.println("The salary will be $65,000.00");
      }
    } else if(experience >= 5){
      if(degree == 1){
        System.out.println("The salary will be $60,000.00");
      } else if(degree == 2){
        System.out.println("The salary will be $55,000.00");
      } else if(degree == 3){
        System.out.println("The salary will be $50,000.00");
      }
    } else if(experience < 5){
      if(degree == 1){
        System.out.println("The salary will be $50,000.00");
      } else if(degree == 2){
        System.out.println("The salary will be $45,000.00");
      } else if(degree == 3){
        System.out.println("The salary will be $40,000.00");
      }
    }
  }
}

//Kayaen Jardine 217466749
 //imports the java class
import java.util.Scanner;
import java.util.Random;
public class guessinggame {

	public static void main(String[]args){

Scanner scan = new Scanner(System.in);
	  Random rand = new Random();
	  
		int num,guess,tries = 0;
		
	   num = rand.nextInt(6) + 1;
	  
	    num = rand.nextInt(6) + 1;
	  System.out.println(" Guess your number!!!!");
	  
	  do{
		  
		  System.out.println("Enter a guess between 1 and 6");
		  guess = scan.nextInt();
		  
		  tries++;
		  
		  
		  if(guess > num){
				System.out.println("Too high");
		  }else if(guess < num) {
				System.out.println("Too low");
			}
			else{
				System.out.println("correct in" + tries + " tries");
				
			}
	  
		  
		}while(guess != num);
			
	  
	  
        }
       
	}

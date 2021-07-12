//Kayaen Jardine 217466749
 //imports the java class
import java.util.*;
import java.text.*;


public class readint {

	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.println(" Please input your guess (1 for heads, 0 for tails");
		int guess = scan.nextInt();
		
		if(guess ==1)
			System.out.println("You chose heads ");
		else if(guess == 0)
			System.out.println("You chose tails ");
		
		int coin = rand.nextInt(2);
		
		if(coin ==1){
			if(guess == 1)
				System.out.println("You win");
			else 
				System.out.println("You lose");
			
		}else{
			if(coin == 0)
				if(guess == 0)
				System.out.println("You win");
			else 
				System.out.println("You lose");
			
		}
		
		
        }
       
	}

import java.util.Random;
public class whiletest {

	public static void main(String[]args){

	//Declaring variables
	final int Win = 75; 
	int p1 = 0,p2 = 0,dice1,dice2;


	Random rand  = new Random();


		while(p1 < Win && p2 < Win){
			
			dice1 = rand.nextInt(6) + 1; //Rolls the first dice
			dice2 = rand.nextInt(6) + 1; //Rolls the second dice
			p1 += dice1 + dice2;		 // Adds the random numbers obtained from both die
			
			
			
			System.out.println("First Dice number is "+dice1 + " and the Second dice number: " + dice2);//Shows dice numbers on screen
			System.out.println("Player 1 current score is: " +p1);//Displays player one's score
			
		}
	}
}
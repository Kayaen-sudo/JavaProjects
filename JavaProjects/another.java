//Kayaen Jardine 217466749
import 	java.util.Random;  //imports the java class


public class dicegame1 {

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
									
					 if(dice1 == dice2){
							dice1 = rand.nextInt(6) + 1; //Rolls the first dice again
							dice2 = rand.nextInt(6) + 1; //Rolls the second dice again
							p1 += dice1 + dice2;		//Cummulates player one vice scores and adds them
							System.out.println("Player 1 rolls again");
						  


						   }else if (dice1 != dice2){
									dice1 = rand.nextInt(6) + 1; //Rolls the first dice
									dice2 = rand.nextInt(6) + 1; //Rolls the second dice
									p2 += dice1 + dice2;		 // Adds the random numbers obtained from both die
									System.out.println("First Dice number is "+dice1 + " and the Second dice number: " + dice2);//Shows dice numbers on screen
									System.out.println("Player 2 current score is: " +p2);//Displays player two's score

									if(dice1 == dice2){
									dice1 = rand.nextInt(6) + 1; //Rolls the first dice again
									dice2 = rand.nextInt(6) + 1; //Rolls the second dice again
									p2 += dice1 + dice2;		//Cummulates player two vice scores and adds them
									System.out.println("Player 2 rolls again");
									{
										 if(p2 >= Win){
											System.out.println("Player 2 Wins!!!");//Displays if player two wins
										}
							}
							
							
							
			}
			
	
	 }
  }
   {
							 if(p1 >= Win){
								System.out.println("Player 1 Wins!!!");// Displays if player one wins
							}
 }
}
}

}
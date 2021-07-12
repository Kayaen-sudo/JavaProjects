package practice;

public class cardgame {

	
	   public static void main (String[] args){
		      Deck deck = new Deck();
		      Card firstCard, secondCard;        
		      deck.shuffle();
		      firstCard = deck.draw();
		      System.out.println("\nThe first card is a " + firstCard.getRankAsString() + ".");         
		      secondCard = deck.draw();
		      System.out.println("The second card is a " + secondCard.getRankAsString() + ".");                                                       
		   }
		}



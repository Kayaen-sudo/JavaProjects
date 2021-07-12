//Kayaen Jardine 217466749

//In a certain sports league, a group of teams plays through a Schedule of Games. 
//At the end of this Schedule, they want to determine the winner. 
//The Schedule object contains an array of Game objects.  Your driver should not re-create this array of Game objects! 
// (arrays will be discussed only at the end of this course). 

import java.util.*;
import java.text.*;

public class assignment2{
	public static void main (String[]args){

	Scanner scan = new Scanner(System.in);
	Schedule sch = new Schedule();
	
	
	
				int vW=0,vL=0,vT=0,vTot =0;
				int cW=0,cL=0,cT=0,cTot =0;
				int eW=0,eL=0,eT=0,eTot =0;
				int tW=0,tL=0,tT=0,tTot =0;
				int oW=0,oL=0,oT=0,oTot =0;
				int mW=0,mL=0,mT=0,mTot =0;	
	
	for(int i = 0;i < sch.GAMES ;i++){
		
			
			 
			if (sch.getGame(i).getHomeScore() > sch.getGame(i).getAwayScore()) {// Checks if Home score is greater than away score
			
				if (sch.getGame(i).getHomeTeam().contains("V")) {
					vW++;
				} else if (sch.getGame(i).getHomeTeam().contains("C")) {
					cW++;
				} else if (sch.getGame(i).getHomeTeam().contains("E")) {
					eW++;
				} else if (sch.getGame(i).getHomeTeam().contains("T")) {
					tW++;
				} else if (sch.getGame(i).getHomeTeam().contains("O")) {
					oW++;
				} else if (sch.getGame(i).getHomeTeam().contains("M")) {
					mW++;
				} 
				

				if (sch.getGame(i).getAwayTeam().contains("V")) {
					vL++;
				} else if (sch.getGame(i).getAwayTeam().contains("C")) {
					cL++;
				} else if (sch.getGame(i).getAwayTeam().contains("E")) {
					eL++;
				} else if (sch.getGame(i).getAwayTeam().contains("T")) {
					tL++;
				} else if (sch.getGame(i).getAwayTeam().contains("O")) {
					oL++;
				} else if (sch.getGame(i).getAwayTeam().contains("M")) {
					mL++;
				} 
				

			} else if (sch.getGame(i).getHomeScore() < sch.getGame(i).getAwayScore()) {// Check if home score is less than away score
				
				if (sch.getGame(i).getAwayTeam().contains("V")) {
					vW++;
				} else if (sch.getGame(i).getAwayTeam().contains("C")) {
					cW++;
				} else if (sch.getGame(i).getAwayTeam().contains("E")) {
					eW++;
				} else if (sch.getGame(i).getAwayTeam().contains("T")) {
					tW++;
				} else if (sch.getGame(i).getAwayTeam().contains("O")) {
					oW++;
				} else if (sch.getGame(i).getAwayTeam().contains("M")) {
					mW++;
				} 
				

				if (sch.getGame(i).getHomeTeam().contains("V")) {
					vL++;
				} else if (sch.getGame(i).getHomeTeam().contains("C")) {
					cL++;
				} else if (sch.getGame(i).getHomeTeam().contains("E")) {
					eL++;
				} else if (sch.getGame(i).getHomeTeam().contains("T")) {
					tL++;
				} else if (sch.getGame(i).getHomeTeam().contains("O")) {
					oL++;
				} else if (sch.getGame(i).getHomeTeam().contains("M")) {
					mL++;
				} 
				

			} else {// Checks if both home and away have the same score
		
				if (sch.getGame(i).getAwayTeam().contains("V")) {
					vT++;
				} else if (sch.getGame(i).getAwayTeam().contains("C")) {
					cT++;
				} else if (sch.getGame(i).getAwayTeam().contains("E")) {
					eT++;
				} else if (sch.getGame(i).getAwayTeam().contains("T")) {
					tT++;
				} else if (sch.getGame(i).getAwayTeam().contains("O")) {
					oT++;
				} else if (sch.getGame(i).getAwayTeam().contains("M")) {
					mT++;
				} 
				

				if (sch.getGame(i).getHomeTeam().contains("V")) {
					vT++;
				} else if (sch.getGame(i).getHomeTeam().contains("C")) {
					cT++;
				} else if (sch.getGame(i).getHomeTeam().contains("E")) {
					eT++;
				} else if (sch.getGame(i).getHomeTeam().contains("T")) {
					tT++;
				} else if (sch.getGame(i).getHomeTeam().contains("O")) {
					oT++;
				} else if (sch.getGame(i).getHomeTeam().contains("M")) {
					mT++;
				} 
				
					 
					}
	}	
					//Loop which claclulates if winner then increase score by 2 or if tie increases score by 1
					for(int i = 0;i < sch.GAMES ;i++){
						vTot=((vW*2)+(vT*1));
						cTot=((cW*2)+(cT*1));
						eTot=((eW*2)+(eT*1));
						tTot=((tW*2)+(tT*1));
						oTot=((oW*2)+(oT*1));
						mTot=((mW*2)+(mT*1));	
					
					}		// Outputs all the scores for each city
						System.out.println("Vancover - " +vW+ " Wins, " +vL+ " Losses, " +vT+ " Ties = " +vTot+ " Total Points");
						System.out.println("Calgary - " +cW+ " Wins, " +cL+ " Losses, " +cT+ " Ties = " +cTot+" Total Points");
						System.out.println("Edmonton - " +eW+ " Wins, " +eL+ " Losses, " +eT+ " Ties = " +eTot+ " Total Points");
						System.out.println("Toronto - " +tW+ " Wins, " +tL+ " Losses, " +tT+ " Ties = " +tTot+ " Total Points");
						System.out.println("Ottowa - " +oW+ " Wins, " +oL+ " Losses, " +oT+ " Ties = " +oTot+ " Total Points");
						System.out.println("Montreal - " +mW+ " Wins, "+ mL+ " Losses, "+mT+ " Ties = " +mTot+ " Total Points");
						
  }
}



					
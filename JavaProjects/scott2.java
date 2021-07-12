public class scott2 {

	public static void main(String[] args) {

		int vW = 0, vL = 0, vT = 0;
		int cW = 0, cL = 0, cT = 0;
		int eW = 0, eL = 0, eT = 0;
		int tW = 0, tL = 0, tT = 0;
		int oW = 0, oL = 0, oT = 0;
		int mW = 0, mL = 0, mT = 0;

		Schedule sched = new Schedule();

		for (int i = 0; i < sched.GAMES; i++) {

			sched.getGame(i).getHomeScore();
			sched.getGame(i).getAwayScore();

			if (sched.getGame(i).getHomeScore() > sched.getGame(i).getAwayScore()) {
				//System.out.println(sched.getGame(i).getHomeTeam());
				if (sched.getGame(i).getHomeTeam().contains("V")) {
					vW++;
				} else if (sched.getGame(i).getHomeTeam().contains("C")) {
					cW++;
				} else if (sched.getGame(i).getHomeTeam().contains("E")) {
					eW++;
				} else if (sched.getGame(i).getHomeTeam().contains("T")) {
					tW++;
				} else if (sched.getGame(i).getHomeTeam().contains("O")) {
					oW++;
				} else if (sched.getGame(i).getHomeTeam().contains("M")) {
					mW++;
				} 
				

				if (sched.getGame(i).getAwayTeam().contains("V")) {
					vL++;
				} else if (sched.getGame(i).getAwayTeam().contains("C")) {
					cL++;
				} else if (sched.getGame(i).getAwayTeam().contains("E")) {
					eL++;
				} else if (sched.getGame(i).getAwayTeam().contains("T")) {
					tL++;
				} else if (sched.getGame(i).getAwayTeam().contains("O")) {
					oL++;
				} else if (sched.getGame(i).getAwayTeam().contains("M")) {
					mL++;
				} 
				

			} else if (sched.getGame(i).getHomeScore() < sched.getGame(i).getAwayScore()) {
				//System.out.println(sched.getGame(i).getAwayTeam());
				if (sched.getGame(i).getAwayTeam().contains("V")) {
					vW++;
				} else if (sched.getGame(i).getAwayTeam().contains("C")) {
					cW++;
				} else if (sched.getGame(i).getAwayTeam().contains("E")) {
					eW++;
				} else if (sched.getGame(i).getAwayTeam().contains("T")) {
					tW++;
				} else if (sched.getGame(i).getAwayTeam().contains("O")) {
					oW++;
				} else if (sched.getGame(i).getAwayTeam().contains("M")) {
					mW++;
				} 
				

				if (sched.getGame(i).getHomeTeam().contains("V")) {
					vL++;
				} else if (sched.getGame(i).getHomeTeam().contains("C")) {
					cL++;
				} else if (sched.getGame(i).getHomeTeam().contains("E")) {
					eL++;
				} else if (sched.getGame(i).getHomeTeam().contains("T")) {
					tL++;
				} else if (sched.getGame(i).getHomeTeam().contains("O")) {
					oL++;
				} else if (sched.getGame(i).getHomeTeam().contains("M")) {
					mL++;
				} 
				

			} else {
				//System.out.println(sched.getGame(i).getHomeTeam() + " " + sched.getGame(i).getAwayTeam());
				if (sched.getGame(i).getAwayTeam().contains("V")) {
					vT++;
				} else if (sched.getGame(i).getAwayTeam().contains("C")) {
					cT++;
				} else if (sched.getGame(i).getAwayTeam().contains("E")) {
					eT++;
				} else if (sched.getGame(i).getAwayTeam().contains("T")) {
					tT++;
				} else if (sched.getGame(i).getAwayTeam().contains("O")) {
					oT++;
				} else if (sched.getGame(i).getAwayTeam().contains("M")) {
					mT++;
				} 
				

				if (sched.getGame(i).getHomeTeam().contains("V")) {
					vT++;
				} else if (sched.getGame(i).getHomeTeam().contains("C")) {
					cT++;
				} else if (sched.getGame(i).getHomeTeam().contains("E")) {
					eT++;
				} else if (sched.getGame(i).getHomeTeam().contains("T")) {
					tT++;
				} else if (sched.getGame(i).getHomeTeam().contains("O")) {
					oT++;
				} else if (sched.getGame(i).getHomeTeam().contains("M")) {
					mT++;
				} 
				

			}

		}
		

		System.out.print("Vancover - " + vW + " wins, " + vL + " losses, " + vT + " ties = " + ((vW*2)+(vT*1)) + " total points\n");
		System.out.print("Calgary - " + cW + " wins, " + cL + " losses, " + cT + " ties = " + ((cW*2)+(cT*1)) + " total points\n");
		System.out.print("Edmonton - " + eW + " wins, " + eL + " losses, " + eT + " ties = " + ((eW*2)+(eT*1)) + " total points\n");
		System.out.print("Toronto - " + tW + " wins, " + tL + " losses, " + tT + " ties = " + ((tW*2)+(tT*1)) + " total points\n");
		System.out.print("Ottowa - " + oW + " wins, " + oL + " losses, " + oT + " ties = " + ((oW*2)+(oT*1)) + " total points\n");
		System.out.print("Montreal - " + mW + " wins, " + mL + " losses, " + mT + " ties = " + ((mW*2)+(mT*1)) + " total points\n");


	}

}

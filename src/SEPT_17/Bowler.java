package SEPT_17;

public class Bowler {
	
	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	
	public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
		
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled =balls_bowled;
		this.runs_conceded = runs_conceded;
		
	}
	
	public Boolean negValue() {
		if( (name.length()<0 || wickets<0 || matches<0 || balls_bowled<0 || runs_conceded<0) && (matches==0 && (runs_conceded>0 || balls_bowled>0)) ) {
			System.err.print("Error");
			return false;
		}
		return true;
	}
	
	public void computeBowlingAverage() {
		
		if(negValue()) {
			System.out.println("\n\nAverage of the bowler : "+((float)runs_conceded/(float)wickets));
		}
		
	
	}
	
	public void computeStrikeRate() {
		
		if(negValue()) {
			System.out.println("\n\nName :"+name+"\nStrike_rate: "+((float)runs_conceded/(float)balls_bowled));
		}

		
	}
	
	public void showStatistics() {
		
		if(negValue()) {
			System.out.println("\n\nName: "+name+"\nwickets: "+wickets+"\nMatches: "+matches+"\nBalls Bowled: "+balls_bowled+"\nRuns: "+ runs_conceded);

		}
		
	}
	
	
}

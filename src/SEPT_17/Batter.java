package SEPT_17;

public class Batter {
	
	private String name; private int runs; private int matches;
	
	public void batterDetails(String name,  int runs, int matches) {
		this.name=name;
		this.runs=runs;
		this.matches=matches;
		
	}
	
	public Boolean negValue() {
		if( (name.length()<0 || runs<0 || matches<0 ) && (matches==0 && runs>0)) {
			System.err.print("Error");
			return false;
		}
		return true;
	}
	
	public void computeBattingAverage() {
		
		if(negValue()) {
			System.out.println("Batting_Avg: "+((float)runs/(float)matches));
		}
		
	}
	
	public void getStatistics() {
		if(negValue()) {
			System.out.println("\nName:"+name+"\nRuns: "+runs+"\nMatches: "+matches);
		}
	}
}

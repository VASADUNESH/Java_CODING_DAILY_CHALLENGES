/*
 * Program 01 :
------------
Create a BLC(Business Logic Class) called Bowler. Add below details to the class. 

1. Instance variables:
 name: private-String,
 wickets: private-int,
 matches: private-int,
 balls_bowled: private-int,
 runs_conceded: private-int. 

2. Method - bowlerDetails() : public void

Create a method name called bowlerDetails() that accepts name, wickets, matches, balls_bowled and runs_conceded.

Method name: bowlerDetails 

Return type: void


3. Create below public methods,
 Method name: computeBowlingAverage
 Return type: void

 This method should print the bowling average of the bowler by dividing runs_conceded with wickets.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 bowling_avg=46.3
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: computeStrikeRate
 Return type: void

This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 Strike_rate=0.61733335
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: showStatistics
 Return type: void

 This method should print the details of the batter.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name=Sachin
 wickets=10
 matches=5

 balls_bowled=750
 runs_conceded=463

 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 An ELC(Executable Logic Class) Test that contains main method. Use this class to test your code.

 */
package SEPT_17;

public class P1 {

	public static void main(String[] args) {
		
		Bowler b1 = new Bowler();
		b1.bowlerDetails("Sachin", 10, 5, 750, 463);
		b1.computeBowlingAverage();
		b1.computeStrikeRate();
		b1.showStatistics();
	}

}

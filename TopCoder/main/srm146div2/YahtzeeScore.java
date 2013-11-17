/*
Problem Statement 
This task is about the scoring in the first phase of the die-game Yahtzee, where five dice are used. 
The score is determined by the values on the upward die faces after a roll. The player gets to choose a value, 
and all dice that show the chosen value are considered active. The score is simply the sum of values on active dice.
Say, for instance, that a player ends up with the die faces showing 2, 2, 3, 5 and 4. Choosing the value two makes 
the dice showing 2 active and yields a score of 2 + 2 = 4, while choosing 5 makes the one die showing 5 active, yielding a score of 5.
Your method will take as input a int[] toss, where each element represents the upward face of a die, and return 
the maximum possible score with these values.

Definition
    
Class:
YahtzeeScore
Method:
maxPoints
Parameters:
int[]
Returns:
int
Method signature:
int maxPoints(int[] toss)
(be sure your method is public)
    

Constraints

toss will contain exactly 5 elements.

Each element of toss will be between 1 and 6, inclusive.

Examples
0)

    
{ 2, 2, 3, 5, 4 }
Returns: 5
The example from the text.
1)

    
{ 6, 4, 1, 1, 3 }
Returns: 6
Selecting 1 as active yields 1 + 1 = 2, selecting 3 yields 3, selecting 4 yields 4 and selecting 6 yields 6, which is the maximum number of points.
2)

    
{ 5, 3, 5, 3, 3 }
Returns: 10
*/

package srm146div2;

public class YahtzeeScore {
	
	public int maxPoints(int[] toss) {
		
		int[] points = {0,0,0,0,0,0};
		int maxPoints = 0;
		
		for (int dice:toss) {
			points[dice - 1] = points[dice - 1] + dice;
			if (points[dice - 1] > maxPoints) maxPoints = points[dice - 1];
		}
		return maxPoints;
	}
}

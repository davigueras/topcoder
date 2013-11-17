/*
Problem Statement
    
There are numMales males and numFemales females arranged in a circle. Starting from a given point, you count clockwise and remove the K'th person from 
the circle (where K=1 is the person at the current point, K=2 is the next person in the clockwise direction, etc...). After removing that person, the 
next person in the clockwise direction becomes the new starting point. After repeating this procedure numFemales times, there are no females left in the circle.
Given numMales, numFemales and K, your task is to return what the initial arrangement of people in the circle must have been, starting from the starting point and in clockwise order.
For example, if there are 5 males and 3 females and you remove every second person, your return String will be "MFMFMFMM".
Definition
    
Class:
PeopleCircle
Method:
order
Parameters:
int, int, int
Returns:
String
Method signature:

(be sure your method is public)
    

Constraints
-
numMales is between 0 and 25 inclusive
-
numFemales is between 0 and 25 inclusive
-
K is between 1 and 1000 inclusive
Examples
0)

    
5
3
2
Returns: "MFMFMFMM"
Return "MFMFMFMM". On the first round you remove the second person - "M_MFMFMM". Your new circle looks like "MFMFMMM" from your new starting point. Then you remove the second person again etc.
1)

    
7
3
1
Returns: "FFFMMMMMMM"
Starting from the starting point you remove the first person, then you continue and remove the next first person etc. Clearly, all the females are located at the beginning. Hence return "FFFMMMMMMM"
2)

    
25
25
1000
Returns: "MMMMMFFFFFFMFMFMMMFFMFFFFFFFFFMMMMMMMFFMFMMMFMFMMF"

3)

    
5
5
3
Returns: "MFFMMFFMFM"
Here we mark the removed people with '_', and the starting position with lower-case:
Number of      | People Remaining
Rounds         | (in initial order)
---------------+-----------------
 0             | mFFMMFFMFM
 1             | MF_mMFFMFM
 2             | MF_MM_fMFM
 3             | MF_MM_FM_m
 4             | M__mM_FM_M
 5             | M__MM__m_M
4)

    
1
0
245
Returns: "M"
*/

package srm147div2;

public class PeopleCircle {
	char[] circle;
	
	public String order(int numMales, int numFemales, int interval) {
		int size = (numMales + numFemales); 
		int pivot = 0;
		String finalCircle = "";

		circle = new char[size];
				
		for (int i = 0; i < size; i++) {
			// We set an M
			if (numMales > 0) {
				circle[i] = 'M';
				numMales--;
				continue;
			}
			// We set an F
			if (numFemales > 0) {
				System.arraycopy(circle, pivot, circle, pivot + 1, circle.length - (pivot + 1));
				circle[pivot] = 'F';
				numFemales--;
				pivot = (pivot + interval) % (size - numFemales);
				//if (pivot > (size - 1 - numFemales)) pivot = pivot - (size - numFemales);				
				continue;
			}			
		}
		
		for (int j = pivot - 1; j > 0 - 1; j--) {
			finalCircle = finalCircle + circle[j];
		}
		for (int j = size - 1; j >= pivot; j--) {
			finalCircle = finalCircle + circle[j];
		}
		
		return finalCircle;
	}
}

/*
Problem Statement
    
Note to plugin users: there is an image in this problem statement. Please view the statement in the applet to see the image
Tire rotation is a simple but effective part of vehicle preventive maintenance. Without it, the tires of a car may wear out 
thousands of miles early. The idea is to have each tire spend part of its life on each wheel of the car. To accomplish this, 
the tire on each wheel is moved to another wheel according to a pattern. First, we assume the wheel positions are numbered left 
to right, front to rear. Then we establish a rotation pattern:
 
From the diagram, we see that for each phase of the rotation cycle, a tire is moved from one wheel position to another, according to the following chart:
starting      ending
 wheel        wheel
   1 ---------> 3
   2 ---------> 4
   3 ---------> 2
   4 ---------> 1
Therefore, if our four tires are represented by A, B, C, and D, there are four valid phases of the rotation cycle:
Phase:   1        2        3        4
Tires:  A B ---> D C ---> B A ---> C D
        C D      A B      D C      B A
         ^                          |
         |__________________________|
Write a method will take a String initial and a String current, which will both represent the tires on a car. Each character will be a 
capital letter ('A'-'Z') and will represent a serial number that identifies a tire. initial will be the starting locations of the tires, 
and current will be the current locations. The position of a character represents the wheel that the tire is on. The characters represent 
the wheels in the order: 1, 2, 3, 4 (from the diagram above). Using the rotation pattern above, your method should return a 1, 2, 3, or 4 
if the tires are in the 1st, 2nd, 3rd, or 4th phase of the rotation cycle. If the tires have been rotated improperly (that is, they are 
not in any phase), your method should return -1.
Definition
    
Class:
TireRotation
Method:
getCycle
Parameters:
String, String
Returns:
int
Method signature:
int getCycle(String initial, String current)
(be sure your method is public)
    

Constraints
-
initial will only contain capital letters ('A' - 'Z', inclusive), and will be exactly 4 characters long.
-
initial will not have any repeated characters.
-
current will be exactly 4 characters long, and will contain the same characters that are in initial.
-
current will not have any repeated characters.
Examples
0)

    
"ABCD"
"ABCD"
Returns: 1
These tires have not been rotated yet.
1)

    
"ABCD"
"DCAB"
Returns: 2
The initial locations of the tires are:

A B
C D
After one rotation, the locations of the tires are:
D C
A B
2)

    
"ABCD"
"CDBA"
Returns: 4
Continuing the rotation, we get the following for phase 3:
B A
D C
And finally, on phase 4:

C D
B A
3)

    
"ABCD"
"ABDC"
Returns: -1
Here, the rear two tires were moved incorrectly, and the front two were not moved at all.
4)

    
"ZAXN"
"XNAZ"
Returns: 4

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or 
reproduction of this information without the prior written consent of TopCoder, Inc. is strictly 
prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*
*/

package srm158div2;

public class TireRotation {

		public int getCycle(String initial, String current) {
			
			int result = -1;
			String[] phase = new String[4];
			
			phase[0] = initial;
			if (current.equals(phase[0])) result = 1;
			
			for (int i = 1; i < 4; i++) {
				phase[i] = getNextPhase(phase[i-1]);
				if (current.equals(phase[i])) result = i + 1;
			}
			
			return result;
		}
		
		private String getNextPhase(String prev) {
			String post = "";
			
			post = String.valueOf(prev.charAt(3));
			post = post + String.valueOf(prev.charAt(2));
			post = post + String.valueOf(prev.charAt(0));
			post = post + String.valueOf(prev.charAt(1));
			
			return post;
		}
}

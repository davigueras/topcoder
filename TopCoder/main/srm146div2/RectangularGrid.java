
/*
Problem Statement
    
Given the width and height of a rectangular grid, return the total number of rectangles (NOT counting squares) that can be found on this grid.
For example, width = 3, height = 3 (see diagram below):
 __ __ __
|__|__|__|
|__|__|__|
|__|__|__|
In this grid, there are 4 2x3 rectangles, 6 1x3 rectangles and 12 1x2 rectangles. Thus there is a total of 4 + 6 + 12 = 22 rectangles. Note we don't count 1x1, 2x2 and 3x3 rectangles because they are squares.
Definition
    
Class:
RectangularGrid
Method:
countRectangles
Parameters:
int, int
Returns:
long
Method signature:
long countRectangles(int width, int height)
(be sure your method is public)
    

Notes
-
rectangles with equals sides (squares) should not be counted.
Constraints
-
width and height will be between 1 and 1000 inclusive.
Examples
0)

    
3
3
Returns: 22
See above
1)

    
5
2
Returns: 31
 __ __ __ __ __
|__|__|__|__|__|
|__|__|__|__|__|
In this grid, there is one 2x5 rectangle, 2 2x4 rectangles, 2 1x5 rectangles, 3 2x3 rectangles, 4 1x4 rectangles, 6 1x3 rectangles and 13 1x2 rectangles. Thus there is a total of 1 + 2 + 2 + 3 + 4 + 6 + 13 = 31 rectangles.
2)

    
10
10
Returns: 2640

3)

    
1
1
Returns: 0

4)

    
592
964
Returns: 81508708664

*/

package srm146div2;

public class RectangularGrid {
	public long countRectangles(int width, int height) {
		long totalRectangles = 0;
		
		for (int n=1; n <= width; n++) {
			long rectanglesPerRun = 0;
			for (int m=1; m <= height; m++) {
				if (n != m)	rectanglesPerRun = rectanglesPerRun + (height - (m - 1));
			}
			totalRectangles = totalRectangles + (rectanglesPerRun * (width - (n - 1)));
		}
		return totalRectangles;
	}
}

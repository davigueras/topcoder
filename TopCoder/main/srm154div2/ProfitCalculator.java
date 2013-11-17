/*
Problem Statement
    
Margin is defined as the percentage of the selling price of an item or group of items which is profit. For example, if an item costs $80 
and is sold for $100, then there is $20 profit, or 20% margin.  You will be given a String[], items, which is all of the items sold in a 
single transaction. Each String in items will be formatted as follows: "nnn.nn nnn.nn" (quotes for clarity), where each n is a digit 
between '0' and '9' inclusive. Each String will be exactly 13 characters in length. The first number listed is the price the customer 
paid for the item. The second number is what the cost to the store of the item was.  You will create a class ProfitCalculator with a 
method percent which will calculate the percentage of margin on the transaction and return it as an int, rounded down to the greatest 
integer less than the actual value.  For example, let's say you were given the following String[]:
   { "012.99 008.73",
     "099.99 050.00",
     "123.45 101.07" }
The total cost is $159.80. The total price is $236.43. That means $76.63 was made on this sale. This would be a 32.41128% margin. Since we are rounding down, you would return 32.
Definition
    
Class:
ProfitCalculator
Method:
percent
Parameters:
String[]
Returns:
int
Method signature:
int percent(String[] items)
(be sure your method is public)
    

Notes
-
The cost for some items may be greater than the price they was sold for. However, the sum of the prices of all the items in
 the transaction will be greater than the sum of the costs of all items.
Constraints
-
items will contain between 1 and 50 elements, inclusive.
-
Every String in items will be exactly 13 characters in length.
-
Every String in items will be formatted as "nnn.nn nnn.nn" where each n is a digit between '0' and '9' inclusive, thus t
he range for each price will be between "000.00" and "999.99" inclusive (all quotes for clarity).
-
The total price of all items will be greater than the total cost of all items.
-
The total price of all items will be greater than 0.
-
The percent of margin, prior to rounding, will not be within 1e-5 of an integer.
Examples
0)

    
{"012.99 008.73","099.99 050.00","123.45 101.07"}
Returns: 32
This is the example from above.
1)

    
{"000.00 049.99","999.99 936.22","033.99 025.64","249.99 211.87"}
Returns: 4
The total price is $1283.97. The total cost is $1223.72. The margin prior to rounding is 4.6924772%.
2)

    
{"822.77 704.86","829.42 355.45","887.18 949.38"}
Returns: 20
The margin prior to rounding is 20.8587169%.
3)

    
{"612.72 941.34","576.46 182.66","787.41 524.70","637.96 333.23","345.01 219.69",
 "567.22 104.77","673.02 885.77"}
Returns: 23
The margin prior to rounding is 23.9925711%.
4)

    
{"811.22 275.32","433.89 006.48","141.28 967.41","344.47 786.23","897.47 860.61",
 "007.42 559.29","255.72 460.00","419.35 931.19","419.25 490.52","199.78 114.44",
 "505.63 276.58","720.96 735.00","719.90 824.46","816.58 195.94","498.68 453.05",
 "399.48 921.39","930.88 017.63","422.20 075.39","380.22 917.27","630.83 995.87",
 "821.07 126.87","715.73 985.62","246.23 134.64","168.28 550.33","707.28 046.72",
 "117.76 281.87","595.43 410.45","345.28 532.42","554.24 264.34","195.73 814.87",
 "131.98 041.28","595.13 939.47","576.04 107.70","716.00 404.75","524.24 029.96",
 "673.49 070.97","288.09 849.43","616.34 236.34","401.96 316.33","371.18 014.27",
 "809.63 508.33","375.68 290.84","334.66 477.89","689.54 526.35","084.77 316.51",
 "304.76 015.91","460.63 636.56","357.84 436.20","752.24 047.64","922.10 573.12"}
Returns: 10
The margin prior to rounding is 10.4737522%.
 * */

package srm154div2;

public class ProfitCalculator {
	public int percent(String[] items) {
		
		double prices = 0;
		double costs = 0;
		int profit = 0;
		
		// We loop the array to sum all the prices and costs in two single variables
		
		for (String operation:items) {
			prices = prices + Double.valueOf(operation.substring(0, 6));
			costs = costs + Double.valueOf(operation.substring(7, 13));	
		}
		
		// We determine the total profit rate and round to a truncated integer
		
		profit = (int) (100 - (costs * 100 / prices));
		
		return profit;
	}
}

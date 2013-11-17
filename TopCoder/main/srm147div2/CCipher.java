/*

Problem Statement
    
Julius Caesar used a system of cryptography, now known as Caesar Cipher, which shifted each letter 2 places further through the 
alphabet (e.g. 'A' shifts to 'C', 'R' shifts to 'T', etc.). At the end of the alphabet we wrap around, that is 'Y' shifts to 'A'.
We can, of course, try shifting by any number. Given an encoded text and a number of places to shift, decode it.
For example, "TOPCODER" shifted by 2 places will be encoded as "VQREQFGT". In other words, if given (quotes for clarity) "VQREQFGT" 
and 2 as input, you will return "TOPCODER". See example 0 below.

Definition
    
Class:
CCipher
Method:
decode
Parameters:
String, int
Returns:
String
Method signature:
String decode(String cipherText, int shift)
(be sure your method is public)

Constraints
-
cipherText has between 0 to 50 characters inclusive
-
each character of cipherText is an uppercase letter 'A'-'Z'
-
shift is between 0 and 25 inclusive
Examples
0)

    
"VQREQFGT"
2
Returns: "TOPCODER"

1)

    
"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
10
Returns: "QRSTUVWXYZABCDEFGHIJKLMNOP"

2)

    
"TOPCODER"
0
Returns: "TOPCODER"

3)

    
"ZWBGLZ"
25
Returns: "AXCHMA"

4)

    
"DBNPCBQ"
1
Returns: "CAMOBAP"

5)

    
"LIPPSASVPH"
4
Returns: "HELLOWORLD"

*/


package srm147div2;

public class CCipher {
	
	public String decode(String cipherText, int shift) {
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] messageChars = cipherText.toCharArray();
		int index = 0;
		
		cipherText = "";
		
		for (int i = 0; i < messageChars.length; i++) {
			index = alphabet.indexOf(messageChars[i]) - shift;
			if (index < 0) index = index + 26;
			cipherText = cipherText +  alphabet.charAt(index);
		}
		
		return cipherText;
	}
}

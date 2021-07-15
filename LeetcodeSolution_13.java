/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
which is XX + V + II.

Given a roman numeral, convert it to an integer.
 *  
 *  
 *  Time Complexity: O(logn)
 *  Space Complexity:O(1)
 *  */

import java.util.HashMap;
import java.util.Scanner;

public class LeetcodeSolution_13 {
	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result = result - map.get(s.charAt(i));
			} else {
				result = result + map.get(s.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
	
			
			    String myStr = "Hello planet earth, you are a great planet.";
			    System.out.println(myStr.indexOf("pr"));
			

		Scanner scn = new Scanner(System.in);
		String romanNumber = scn.nextLine();
		System.out.print(romanToInt(romanNumber));

	}
}
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

	Given an integer, convert it to a roman numeral.
	 *  
	 *  
	 *  Time Complexity: O(n)
	 *  Space Complexity:O(1)
	 *  */

import java.util.HashMap;
import java.util.Scanner;

public class LeetcodeSolution_12 {

	public static String intToRoman(int num) {
		String roman[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int integer[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		int counter = integer.length - 1;
		String result = "";
		while (num != 0 && counter >= 0) {
			String romanMapping = roman[counter];
			int integerMapping = integer[counter];
			int repeater = num / integerMapping;
			result = result + romanMapping.repeat(repeater);
			num = num % integerMapping;
			counter--;
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int intNumber = scn.nextInt();
		System.out.print(intToRoman(intNumber));

	}

}
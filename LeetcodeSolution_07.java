
/*Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer
 *  range [-231, 231 - 1], then return 0.
 * 
 *  
 *  
 *  Time Complexity: O(logn)
 *  Space Complexity:O(1)*/

import java.util.Scanner;

public class LeetcodeSolution_07 {
	public static int reverseInteger(int x) {
		int remainder = 0;
		int reverseNumber = 0;
		while (x != 0) {
			remainder = x % 10;
			x = x / 10;

			if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && remainder > 7)) {
				return 0;
			}
			if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && remainder < -8)) {
				return 0;
			}
			reverseNumber = reverseNumber * 10 + remainder;
		}
		return reverseNumber;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		System.out.print(reverseInteger(number));

	}
}

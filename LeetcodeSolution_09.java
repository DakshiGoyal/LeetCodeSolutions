/*Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. 
 * For example, 121 is palindrome while 123 is not.
 * 
 *  
 *  
 *  Time Complexity: O(logn)
 *  Space Complexity:O(1)
 *  */

import java.util.Scanner;

public class LeetcodeSolution_09 {

	public static boolean isPalindrome(int x) {
		int sum = 0;
		int temp = x;
		if (x < 0) {
			return false;
		} else {
			while (x != 0) {
				int remainder;
				remainder = x % 10;
				x = x / 10;
				sum = sum * 10 + remainder;

			}
			if (sum == temp) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		System.out.print(isPalindrome(number));

	}
}



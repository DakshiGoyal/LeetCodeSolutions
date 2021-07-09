
/*Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.*/
import java.util.Scanner;

public class LeetcodeSolution_66 {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				break;
			} else {
				digits[i] = 0;
			}
		}
		if (digits[0] == 0) {
			int[] arr = new int[digits.length + 1];
			arr[0] = 1;
			return arr;
		}
		return digits;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = scn.nextInt();
		}
		plusOne(arr);
		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i]);

	}
}

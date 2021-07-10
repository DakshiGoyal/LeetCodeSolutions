import java.util.Scanner;

public class LeetcodeSolution_26 {

	public static int removeDuplicates(int[] nums) {

		int j = 0;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}

		return j + 1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(removeDuplicates(arr));

	}
}

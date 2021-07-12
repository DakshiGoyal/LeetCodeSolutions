
public class LeetcodeSolution_88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int k = 0;

		int[] nums1Copy = new int[m];
		for (int l = 0; l < m; l++) {
			nums1Copy[l] = nums1[l];
		}

		while (i < m && j < n) {
			if (nums1Copy[i] < nums2[j]) {
				nums1[k] = nums1Copy[i];
				i++;
				k++;
			} else {
				nums1[k] = nums2[j];
				j++;
				k++;
			}

		}
		while (i < m) {
			nums1[k] = nums1Copy[i];
			i++;
			k++;
		}
		while (j < n) {
			nums1[k] = nums2[j];
			j++;
			k++;
		}
	}
}
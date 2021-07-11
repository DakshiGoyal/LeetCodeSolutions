/*Implement strStr().

Return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.*/
public class LeetcodeSolution_28 {

	public int strStr(String haystack, String needle) {
		if (needle == "") {
			return 0;

		}
		return haystack.indexOf(needle);
	}

}

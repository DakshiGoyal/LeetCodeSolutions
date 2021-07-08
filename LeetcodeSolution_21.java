/*Merge two sorted linked lists and return it as a sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 */
public class LeetcodeSolution_21 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 != null ? l1 : l2;
		}

		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				dummy.next = l1;
				l1 = l1.next;

			} else {
				dummy.next = l2;
				l2 = l2.next;

			}
			dummy = dummy.next;
		}
		if (l1 != null) {
			dummy.next = l1;

		} else if (l2 != null) {
			dummy.next = l2;

		}

		return temp.next;
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3));
		ListNode result = mergeTwoLists(l1, l2);
		printResult(result);

	}

	public static void printResult(ListNode temp) {
		ListNode result = temp;
		while (result != null) {
			System.out.print(result.val);
			result = result.next;
		}
	}
}

public class leet_160 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode curA = headA;
		ListNode curB = headB;
		int lenA = 0, lenB = 0;

		while (curA != null) {
			curA = curA.next;
			lenA++;
		}
		while (curB != null) {
			curB = curB.next;
			lenB++;
		}

		curA = headA;
		curB = headB;
		int gap = 0;
		if (lenA >= lenB) {
			gap = lenA - lenB;

			while (curA != null && gap > 0) {
				curA = curA.next;
				gap--;
			}
			while (curA != null) {
				if (curA == curB) {
					return curA;
				}
				curA = curA.next;
				curB = curB.next;
			}

		} else {
			gap = lenB - lenA;

			while (curB != null && gap > 0) {
				curB = curB.next;
				gap--;
			}
			while (curB != null) {
				if (curB == curA) {
					return curB;
				}
				curA = curA.next;
				curB = curB.next;
			}

		}

		return null;
	}

}


public class leet_141 {

	static class ListNode {
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

	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head.next;

		while (slow != fast) {

			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}

		return true;
	}

}

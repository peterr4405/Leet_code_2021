
public class leet_206 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode reverseList(ListNode head) {
		ListNode previous = null;

		while (head != null) {
			ListNode nextNode = head.next;
			head.next = previous;
			previous = head;
			head = nextNode;
		}
		return previous;
	}
}


public class leet_203 {
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

	public static ListNode removeElements(ListNode head, int val) {

		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode res = dummy;

		while (head != null) {
			if (head.val != val) {
				dummy.next = head;
				dummy = dummy.next;
			}
			head = head.next;
		}
		dummy.next = null;
		return res.next;
	}
}


public class leet_147 {
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

	public static ListNode insertionSortList(ListNode head) {

		ListNode dummy = new ListNode();
		ListNode cur = head;
		dummy.next = head;
		ListNode temp = null;
		ListNode prev = null;

		while (cur != null && cur.next != null) {
			if (cur.val <= cur.next.val) {
				cur = cur.next;
			} else {
				temp = cur.next;
				cur.next = cur.next.next;
				prev = dummy;
				while (prev.next.val <= temp.val) {
					prev = prev.next;
				}
				temp.next = prev.next;
				prev.next = temp;

			}
		}

		return dummy.next;
	}
}

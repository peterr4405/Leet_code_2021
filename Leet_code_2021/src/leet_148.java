
public class leet_148 {
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

	public static ListNode sortList(ListNode head) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode cur = head;
		ListNode pre = null;
		ListNode temp = null;

		while (cur != null && cur.next != null) {
			if (cur.val <= cur.next.val) {
				cur = cur.next;
			} else {
				temp = cur.next;
				cur.next = cur.next.next;
				pre = dummy;
				while (pre.next.val <= temp.val) {
					pre = pre.next;
				}
				temp.next = pre.next;
				pre.next = temp;

			}
		}
		return dummy.next;
	}
}

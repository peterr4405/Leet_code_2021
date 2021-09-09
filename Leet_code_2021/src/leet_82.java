
public class leet_82 {

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
		ListNode node = new ListNode(1,new ListNode(2,new ListNode(2
				,new ListNode(3,new ListNode(3,new ListNode(4
				,new ListNode(5)))))));
		deleteDuplicates(node);
	}
	//1,2,2,3,3,4,5
	public static ListNode deleteDuplicates(ListNode head) {


		if(head == null || head.next == null) {
			return head;
		}
		
		if(head .val == head.next.val) {
			//System.out.print(head.val);
			ListNode cur = head.next;
			while (cur!=null && cur.val == head.next.val) {
				cur = cur.next;
				//System.out.print(cur.val);
			}
			head = deleteDuplicates(cur);
		}else {
			head.next = deleteDuplicates(head.next);
		}
		
		
		
		return head;
	}
}

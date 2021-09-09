

public class leet_83 {

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

    public static ListNode deleteDuplicates(ListNode head) {
        
    	if(head == null || head.next == null) {
    		return head;
    	}
    	ListNode res =head;
    	
    	
    	while(head !=null && head.next != null) {
    	if(head.val == head.next.val) {
    		head.next = head.next.next;
    	}else {
    		head = head.next;
    	}
    	
    	}
    	return res;
    }
}

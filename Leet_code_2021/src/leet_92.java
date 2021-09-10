
public class leet_92 {

	  public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 2, right = 4;
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
		
		reverseBetween(head, left, right);
		
	}

    public static ListNode reverseBetween(ListNode head, int left, int right) {
    
        if(head ==null) {
        	return head;
        }
        ListNode dummy = new ListNode();	
        dummy.next = head;
        ListNode pre = dummy;
        
        for(int i=1;i<left;i++) {
        	pre = pre.next;
        	System.out.print(pre.val);
        }
        
        ListNode cur = pre.next;
        
        for(int i = left;i<right;i++) {
        	ListNode next = cur.next;
        	cur.next = next.next;
        	next.next = pre.next;
        	pre.next = next;
        }
        return dummy.next;
    }
    
}

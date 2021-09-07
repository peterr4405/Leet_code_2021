
public class leet_24 {

	  public static class ListNode {
	 	      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode swapPairs(ListNode head) {
    
    	ListNode dummy = new ListNode();
    	
    	dummy.next = head;
    	ListNode curr = dummy;
    	
    	while(curr.next !=null && curr.next.next !=null) {
    		
    		swap(curr);
    		curr = curr.next.next;
    	}
    	return dummy.next;
    }
    
    public static void swap(ListNode pre) {
    	
    	ListNode dummy2 = pre.next;
    	pre.next = dummy2.next;
    	dummy2.next = dummy2.next.next;
    	pre.next.next = dummy2;
    }
	

}


public class leet_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
		int n = 3;
		removeNthFromEnd(head,n);
		
	}

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
    	ListNode ans = new ListNode();
    	
    	ans.next = head;
 
    	ListNode fir = ans;
    	ListNode sec = ans;
    	
    	for(int i=0;i<n;i++) {
    		fir = fir.next;
    	}
    	
    	while(fir.next !=null) {
    		fir = fir.next;
    		sec = sec.next;
    	}
    	sec.next= sec.next.next;
    	

    	
    	
    	return ans.next;
    }
    
     public static class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode() {}
    	      ListNode(int val) { this.val = val; }
    	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    	  }
	
}

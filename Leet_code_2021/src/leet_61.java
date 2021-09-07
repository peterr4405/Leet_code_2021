
public class leet_61 {

	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode rotateRight(ListNode head, int k) {
        
    	ListNode tmp= new ListNode();
    	tmp = head;
    	int count = 1;
    	
    	while(tmp.next!=null) {
    		tmp = tmp.next;
    		count++;
    	}
    	tmp.next = head;
    	
    	for(int i =1;i<count - k % count;i++) {
    		head = head.next;
    	}
    	ListNode res = head.next;
    	head.next = null;
    	return res;
    }

}

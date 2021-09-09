
public class leet_86 {

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

	
    public ListNode partition(ListNode head, int x) {
        
    	if(head == null) return head;
    	ListNode dummy = new ListNode();
    	ListNode left = dummy;
    	dummy.next = head;
    	ListNode cur = head;
    	ListNode pre = dummy;
    	
    	while(cur !=null) {
    		if(pre == left) {
    			if(cur.val < x) {
    				left = left.next;
    			}
    			pre = cur;
    			cur = cur.next;
    		}else {
    			if(cur.val >= x) {
    				pre = cur;
    				cur = cur.next;
    			}else {
    				pre.next = cur.next;
    				cur.next = left.next;
    				left.next = cur;
    				left = left.next;
    				cur = pre.next;
    			}
    			
    			
    		}
    		
    		
    	}
    	return dummy.next;
    }
    
    public ListNode partition2(ListNode head, int x) {
        
    	ListNode before_head = new ListNode();
    	ListNode before = before_head;
    	ListNode after_head = new ListNode();
    	ListNode after = after_head;
    	
    	while(head !=null) {
    		
    		if(head.val < x) {
    			before.next = head;
    			before = before.next;
    		}else {
    			after.next = head;
    			after = after.next;
			}
    		head = head.next;
    		
    	}
    	after.next = null;
    	before.next = after_head.next;
    	
    	return before_head.next;
    }
}

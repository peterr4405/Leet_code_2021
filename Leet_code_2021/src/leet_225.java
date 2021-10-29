import java.util.LinkedList;
import java.util.Queue;

public class leet_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 Queue<Integer> queue ;
     
	    public leet_225() {
	        
	        queue = new LinkedList<>();
	        
	    }
	    
	    public void push(int x) {
	       Queue<Integer> tmp = new LinkedList<>();
	        tmp.offer(x);
	       while(!queue.isEmpty()){
	           tmp.offer(queue.poll());
	       }
	        while(!tmp.isEmpty()){
	            queue.offer(tmp.poll());
	        }
	    }
	    
	    public int pop() {
	        return queue.poll();
	    }
	    
	    public int top() {
	        return queue.peek();
	    }
	    
	    public boolean empty() {
	        return queue.isEmpty();
	    }
}

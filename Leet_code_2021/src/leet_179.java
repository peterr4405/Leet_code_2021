import java.util.PriorityQueue;
import java.util.Queue;

public class leet_179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static String largestNumber(int[] nums) {
	        Queue<String> pq = new PriorityQueue<String>((s1, s2) ->
	        (s2+s1).compareTo(s1+s2));
	        
	        for(int num : nums) {
	            pq.add(String.valueOf(num));
	        }
	        
	        if(pq.peek().charAt(0) == '0') {
	            return "0";
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        while(!pq.isEmpty()) {
	            sb.append(pq.poll());
	        }
	        
	        return sb.toString();
	        
	    }
}

import java.util.HashMap;
import java.util.Stack;

public class leet_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1 = {4,1,2};
		int[] n2 = {1,3,4,2};
		
		int[]res = nextGreaterElement(n1, n2);
		
		for(int i : res) {
			System.out.println(i);
		}
		
	}
	  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        
          HashMap<Integer,Integer> map = new HashMap();
          Stack<Integer> stack = new Stack();
      
      for(int num : nums2){
          
          while(!stack.isEmpty() && stack.peek()<num){
              map.put(stack.pop(),num);
          }
          stack.push(num);
      }
      
      for(int i=0;i<nums1.length;i++){
          nums1[i] = map.getOrDefault(nums1[i],-1);
      }
      
      return nums1;
  }
}

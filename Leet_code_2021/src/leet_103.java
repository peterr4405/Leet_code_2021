import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class leet_103 {

	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
    	if(root == null) {
    		return res;
    	}
    	
    	Deque<TreeNode> deque = new ArrayDeque<>();
    	deque.offer(root);
    	int count = 1;
    	while(!deque.isEmpty()) {
    		int size = deque.size();
    		List<Integer> lev = new ArrayList<>();
    		for(int i=0;i<size;i++) {
    			TreeNode tmp = deque.poll();
    			if(tmp.left !=null ) {
    				deque.offer(tmp.left);
    			}
    			if(tmp.right !=null) {
    				deque.offer(tmp.right);
    			}

    			lev.add(tmp.val);
    			}
			if(count %2 ==0) {
				Collections.reverse(lev);
			}
			count ++;
    		res.add(lev);
    	}
    	return res;
    }
}

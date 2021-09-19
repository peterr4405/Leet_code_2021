import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet_107 {

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

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> cur = new ArrayList<>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	if(root == null)return res;
    	
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		for(int i=0;i<size;i++) {
    			TreeNode tmpNode = queue.poll();
    			cur.add(tmpNode.val);
    			if(tmpNode.left!=null) {
    				queue.add(tmpNode.left);
    			}
    			if(tmpNode.right!=null) {
    				queue.add(tmpNode.right);
    			}
    		}
    		res.add(new ArrayList<>(cur));
    		cur.clear();
    	}
    	Collections.reverse(res);
    	
    	return res;
    }
}

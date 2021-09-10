import java.util.ArrayList;
import java.util.List;

public class leet_94 {

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

    public static List<Integer> inorderTraversal(TreeNode root) {
     
    	List<Integer> res = new ArrayList<>();
    	backstracking(root,res);
    	return res;
    }
    
    public static void backstracking(TreeNode root,List<Integer> res) {
    	if(root == null) {
    		return;
    	}
    	
    	backstracking(root.left,res);
    	res.add(root.val);
    	backstracking(root.right, res);
    }
}

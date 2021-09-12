import java.util.Stack;

public class leet_98 {

	public static class TreeNode {
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

		TreeNode root= new TreeNode(2, new TreeNode(1),new TreeNode(3));
		System.out.print(isValidBST(root));
	}
	
	 public static boolean isValidBST(TreeNode root) {
	        Stack<TreeNode> stack = new Stack();
	        double left_val = - Double.MAX_VALUE;
	        while(!stack.isEmpty() ||root != null  ){
	            while(root !=null){
	            stack.push(root);
	            root = root.left;    
	            }        
	        root = stack.pop();
	        if(root.val <= left_val){
	            return false;
	        }
	        left_val = root.val;
	        root = root.right;
	    }
	        
	        return true;
	    }

}

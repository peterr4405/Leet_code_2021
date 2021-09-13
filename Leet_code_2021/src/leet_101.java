
public class leet_101 {

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

	}

    public static boolean isSymmetric(TreeNode root) {
        
    	TreeNode l1 = root.left;
    	TreeNode l2 = root.right;
    	
    	return check(l1, l2);
    }
    
    public static boolean check(TreeNode l1, TreeNode l2) {
    	
    	if(l1 ==null && l2 ==null) {
    		return true;
    	}
    	if(l1 ==null || l2 == null) {
    		return false;
    	}
    	
    	if( l1.val == l2.val) {
    		return check(l1.left, l2.right) && check(l1.right, l2.left);
    	}
    	
    		
    	return false;	
    }
}

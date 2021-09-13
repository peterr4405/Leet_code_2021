
public class leet_100 {

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
		
		TreeNode p = new TreeNode(1,new TreeNode(3),new TreeNode(2));
		TreeNode q = new TreeNode(1,new TreeNode(3),new TreeNode(2));
		
		isSameTree(p,q);
	}

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        

        if(p !=null && q !=null){
            if(p.val == q.val){
               return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }else{
                return false;
            }
            
        }else if (p ==null && q == null){
            return true;
        }else{
            return false;
        }

    }
}

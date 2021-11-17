package TreeNode;

public class leet_222 {
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
	static int count =0;
    public static int countNodes(TreeNode root) {
        
        if(root == null){
            return count;
        }
        
        count++;
        if(root.left !=null){
            countNodes(root.left);
        }
        if(root.right != null){
            countNodes(root.right);
        }
        return count;
    }
}

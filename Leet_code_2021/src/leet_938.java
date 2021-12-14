package TreeNode;

public class leet_938 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	    int res =0;
	    public int rangeSumBST(TreeNode root, int low, int high) {
	        
	        if(root == null) return res;
	        
	        if(root.val >= low && root.val <= high){
	         res+=root.val;   
	        }
	        if(root.left !=null){
	          int left =  rangeSumBST(root.left,low,high);
	        }
	        if(root.right !=null){
	          int right =  rangeSumBST(root.right , low , high);
	        }
	        return res;
	    }
}

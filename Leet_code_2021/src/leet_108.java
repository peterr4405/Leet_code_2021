
public class leet_108 {

	public static class TreeNode {
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

	public static TreeNode sortedArrayToBST(int[] nums) {
				if(nums == null)return null;
				
			return dfs(nums, 0, nums.length-1);
	}
	public static TreeNode dfs(int[]nums,int start,int end) {
		if(start>end) {
			return null;
		}
		int mid = start + (end-start)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = dfs(nums, start, mid-1);
		root.right = dfs(nums, mid+1, end);
		return root;
	}
	
}

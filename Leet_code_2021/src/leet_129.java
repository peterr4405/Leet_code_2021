
public class leet_129 {

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

	static int  res = 0;

	public static int sumNumbers(TreeNode root) {
		String str = "";
		solve(root, str);
		return res;
	}

	public static void solve(TreeNode root, String str) {
		if (root == null) {
			return;
		}

		str = str.concat(String.valueOf(root.val));
		if (root.left == null && root.right == null) {
			res = res + Integer.valueOf(str);
			return;
		}
		solve(root.left, str);
		solve(root.right, str);
	}
}

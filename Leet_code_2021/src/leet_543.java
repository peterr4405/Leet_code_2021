package TreeNode;

public class leet_543 {
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

	public static int diameterOfBinaryTree(TreeNode root) {
		int[] len = new int[1];
		helper(root, len);

		return len[0];
	}

	public static int helper(TreeNode root, int[] len) {
		if (root == null)
			return 0;

		int L = helper(root.left, len);
		int R = helper(root.right, len);
		len[0] = Math.max(len[0], L + R);

		return 1 + Math.max(L, R);
	}
}

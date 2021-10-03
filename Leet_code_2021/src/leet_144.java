import java.util.ArrayList;
import java.util.List;

public class leet_144 {
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

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;

		return preorder(root, res);
	}

	public static List<Integer> preorder(TreeNode root, List<Integer> res) {
		if (root == null)
			return null;
		res.add(root.val);
		preorder(root.left, res);
		preorder(root.right, res);
		return res;
	}
}

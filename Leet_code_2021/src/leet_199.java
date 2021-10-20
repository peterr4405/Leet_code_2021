import java.util.ArrayList;
import java.util.List;

public class leet_199 {
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

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList();
		if (root == null)
			return res;
		helper(root, 0, res);
		return res;
	}

	public static void helper(TreeNode root, int h, List<Integer> res) {
		if (root == null)
			return;
		if (res.size() == h) {
			res.add(root.val);
		}

		helper(root.right, h + 1, res);
		helper(root.left, h + 1, res);

	}
}

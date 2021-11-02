package TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leet_257 {
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

	public static List<String> binaryTreePaths(TreeNode root) {

		List<String> res = new ArrayList();

		if (root == null)
			return res;
		findPath(res, "", root);

		return res;
	}

	public static void findPath(List<String> res, String s, TreeNode root) {

		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			s += root.val;
			res.add(s);
			return;
		}

		findPath(res, s + root.val + "->", root.left);
		findPath(res, s + root.val + "->", root.right);
	}

}

import java.util.Stack;

public class leet_112 {

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

	public static boolean hasPathSum(TreeNode root, int targetSum) {
			if(root == null) {
				return false;
			}

			Stack<TreeNode> stack = new Stack();
			Stack<Integer> sum_stack = new Stack();
			stack.add(root);
			sum_stack.add(targetSum-root.val);
			
			while(!stack.isEmpty()) {
				TreeNode cur_stack = stack.pop();
				int tmp_value = sum_stack.pop();
				
				if(cur_stack.left == null && cur_stack.right == null && tmp_value ==0) {
					return true;
				}
				
				if(cur_stack.left !=null) {
					stack.add(cur_stack.left);
					sum_stack.add(tmp_value-cur_stack.left.val);
				}
				if(cur_stack.right !=null) {
					stack.add(cur_stack.right);
					sum_stack.add(tmp_value-cur_stack.right.val);
				}
				
			}
			
			return false;
	}


}

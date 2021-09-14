import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class leet_102 {

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
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode polled = queue.poll();
                if(polled.left != null)
                    queue.offer(polled.left);
                if(polled.right != null)
                    queue.offer(polled.right);
                level.add(polled.val);
            }
            result.add(level);
        }
        return result;
    }

   
}

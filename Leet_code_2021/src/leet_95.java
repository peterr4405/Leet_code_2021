import java.util.ArrayList;
import java.util.List;

public class leet_95 {

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

    public static List<TreeNode> generateTrees(int n) {
        
    	List<TreeNode> res = new ArrayList<>();
    	if(n == 0) {
    		return res;
    	}
    	
    	return BackStracking(1,n);
    	
    }
    public static List<TreeNode> BackStracking(int start,int end) {
    	List<TreeNode> res = new ArrayList<>();
    	
    	if(start > end) {
    		res.add(null);
    		return res;
    	}
    	
    	for(int i = start ; i<=end;i++) {
    		List<TreeNode> left = BackStracking(start, i-1);
    		List<TreeNode> right = BackStracking(i+1, end);
    		
    		for(TreeNode l : left) {
    			for(TreeNode r : right) {
    				TreeNode cur = new TreeNode(i);
    				cur.left = l;
    				cur.right = r;
    				res.add(cur);
    			}
    		}
    	}
    	return res;
    }
    
    
}

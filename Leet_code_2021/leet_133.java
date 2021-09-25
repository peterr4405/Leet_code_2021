
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class leet_133 {
	static class  Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static Node cloneGraph(Node node) {
        
    	if(node == null) return null;
    	Map<Node, Node> map = new HashMap<>();
    	Node newNode = new Node(node.val,new ArrayList());
    	map.put(node, newNode);
    	
    	Queue<Node> queue = new LinkedList<>();
    	queue.add(node);
    	
    	while(!queue.isEmpty()) {
    		Node cur = queue.poll();
    		for(Node n : cur.neighbors) {
    			if(!map.containsKey(n)) {
    				map.put(n, new Node(n.val,new ArrayList()));
    				queue.add(n);
    			}
    			map.get(cur).neighbors.add(map.get(n));
    		}
    	}
    	return newNode;
    }
}

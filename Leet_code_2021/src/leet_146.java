import java.util.HashMap;
import java.util.Map;

public class leet_146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node{
        int key;
        int val;
        Node next;
        Node prev;
        public Node(int k,int v){
            key = k;
            val = v;
        }
        
    }
    Node head;
    Node tail;
    Map<Integer,Node> map;
    int size;
    int capacity;

    public leet_146(int capacity) {
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        map = new HashMap();
        size = 0;
        this.capacity = capacity;
        
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
           return -1;
        }else{
            Node node = map.get(key);
            remove(key);
            addHead(key,node.val);
            return node.val;
        }
        
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(key);
            addHead(key,value);
        }else{
            addHead(key,value);
        }
        
    }
    
    private void remove(int key){
        Node cur = map.get(key);
        Node next = cur.next;
        Node prev = cur.prev;
        prev.next= next;
        next.prev = prev;
        size--;
        map.remove(key);
    }
    
    private void addHead(int key,int val){
        Node node = new Node(key,val);
        Node next = head.next;
        head.next = node;
        node.next = next;
        next.prev = node;
        node.prev = head;
        map.put(key,node);
        size++;
        if(size > capacity){
            Node pretail = tail.prev;
            remove(pretail.key);
        }
    }
}

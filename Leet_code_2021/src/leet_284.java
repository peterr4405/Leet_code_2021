import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class leet_284 implements Iterator<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    
		static int idx ;
	    static List<Integer> list ;
	    
		public  leet_284(Iterator<Integer> iterator) {
		    // initialize any member here.
		    list = new ArrayList();
	        idx = 0;
	        
	        while(iterator.hasNext()){
	            list.add(iterator.next());
	        }
	        
		}
		
	    // Returns the next element in the iteration without advancing the iterator.
		public  Integer peek() {
	        return list.get(idx);
		}
		
		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public  Integer next() {
		    return list.get(idx++);
		}
		
		@Override
		public  boolean hasNext() {
		    return idx < list.size() ? true : false;
		}
}

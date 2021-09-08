import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leet_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =4,k=2;
		combine(n,k);
	}

    public static List<List<Integer>> combine(int n, int k) {
     
    	List<List<Integer>> res = new ArrayList<>();
    	if(k ==0 ) {
    		return res;
    	}
    	int begin = 1;
    	combineCal(res,new LinkedList<Integer>() , begin,n, k);
    	
    	
    	return res;
    }
    public static void combineCal(List<List<Integer>>res,LinkedList<Integer>list,int begin
    		,int end,int k){
    	if( list.size() == k) {
    		res.add(new LinkedList<>(list));
    		return;
    	}
    	
    	for(int i = begin ;i<=end;i++) {

    		list.add(i);
    		combineCal(res,list,i+1,end,k);
    		list.remove(list.size()-1);
    	}
    	

    }
    
}

import java.util.ArrayList;
import java.util.List;

public class leet_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static  List<List<Integer>> generate(int numRows) {
    	List<List<Integer>>res = new ArrayList<>();
        if(numRows == 0) return res;
    	List<Integer> first_row = new ArrayList<>();
    	first_row.add(1);
    	res.add(first_row);
        
    	for(int i = 1; i<numRows;i++) {
    		List<Integer> pre_row = res.get(i-1);
    		List<Integer> row = new ArrayList<>();
    		row.add(1);
    		
    		for(int j = 1;j<i;j++) {
    			row.add(pre_row.get(j-1)+pre_row.get(j));
    		}
    		row.add(1);
    		res.add(row);
    	}
    	return res;
    }
}

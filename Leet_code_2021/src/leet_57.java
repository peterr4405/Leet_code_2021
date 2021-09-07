import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leet_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int [] newin = {2,5};
		insert(intervals,newin);
		
	}
	
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        
    	
    	if (newInterval.length ==0 && intervals.length ==0) {
    		return intervals;
    	}
    	List<int[]> tmp = new ArrayList<>();
    	
    	for(int[] i : intervals) {
    		tmp.add(i);
    	}
    	if(newInterval.length >1) {
    	tmp.add(newInterval);
    	}
    	int[][] cal = tmp.toArray(new int[tmp.size()-1][]);
    	
    	for(int i =0;i<cal.length-1;i++) {
    		
    		for(int j =i+1;j<cal.length;j++) {
    			if(cal[i][0] > cal[j][0]) {
    				int[] swap = cal[i];
    				cal[i] = cal[j];
    				cal[j] = swap;
    			}
    		}
    		
    	}
    	
    	List<int[]> res = new ArrayList<>();
    	int [] curr = cal[0];
    	res.add(curr);
    	
    	for(int[] interval : cal) {
    		int cur_begin = curr[0];
    		int cur_end = curr[1];
    		int next_begin = interval[0];
    		int next_end = interval[1];
    		if(cur_end >= next_begin) {
    			curr[1] = Math.max(cur_end, next_end);
    		}else {
    			curr = interval;
    			res.add(curr);
    		}
    	} 
    	
    	
    	return res.toArray(new int[res.size()-1][]);
    }

}

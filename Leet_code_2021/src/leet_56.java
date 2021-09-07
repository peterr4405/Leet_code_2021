import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leet_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		merge(intervals);
		
		
	}

    public static int[][] merge(int[][] intervals) {
        
    	if(intervals.length <=1) {
    		return intervals;
    	}
    	
    	Arrays.sort(intervals,new Comparator<int[]>() {
    		
    		public int compare(int[]a1,int[]a2) {
    		return a1[0]-a2[0];
    		}
		});
    	List<int[]> res = new ArrayList<>();
    	int[] curr = intervals[0];
    	res.add(curr);
    	
    	for(int[] interval : intervals) {
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

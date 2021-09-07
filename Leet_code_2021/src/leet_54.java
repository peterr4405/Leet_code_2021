import java.util.ArrayList;
import java.util.List;

public class leet_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> resIntegers=  spiralOrder(matrix);
		
		for(Integer i : resIntegers ) {
			System.out.printf(i+"\t");
		}
		
	}

    public static List<Integer> spiralOrder(int[][] matrix) {
        
    	List<Integer> res = new ArrayList<>();
    	
    	int rowbegin = 0;
    	int rowend = matrix.length-1;
    	int colbegin = 0;
    	int colend = matrix[0].length-1;
    	
    	while(rowbegin <= rowend && colbegin <= colend) {
    		
    		for(int j = colbegin;j<=colend;j++ ) {
    			res.add(matrix[rowbegin][j]);
    		}
    		rowbegin++;
    		
    		for(int i = rowbegin;i<=rowend;i++) {
    			res.add(matrix[i][colend]);
    		}
    		colend--;
    		
    		if(rowbegin <=rowend) {
    			for(int j = colend ; j>=colbegin;j-- ) {
    				res.add(matrix[rowend][j]);
    			}
    		}
    		rowend--;
    		if(colbegin <= colend) {
    			for(int i = rowend;i>=rowbegin;i--) {
    				res.add(matrix[i][colbegin]);
    			}
    		}
    		colbegin++;
    	}
    	return res;
    }
}

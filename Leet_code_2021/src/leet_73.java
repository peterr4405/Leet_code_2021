import java.util.HashMap;
import java.util.Map;

public class leet_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
		
		setZeroes(matrix);
		
	}

    public static void setZeroes(int[][] matrix) {
        
    	Map<Integer,Integer> row_map = new HashMap<>();
    	Map<Integer,Integer> col_map = new HashMap<>();
    	
    	for(int i =0;i<matrix.length;i++) {
    		for(int j=0;j<matrix[i].length;j++) {
    			if(matrix[i][j] == 0) {
    				row_map.put(i, 1);
    				col_map.put(j, 1);
    				continue;
    			}
    			if(matrix[i][0] == 0 ) {
    				row_map.put(i, 1);
    			}
    			if(matrix[0][j] ==0) {
    				col_map.put(j, 1);
    			}

    		}
    	}
    	
    	for(int i =0;i<matrix.length;i++) {
    		for(int j=0;j<matrix[i].length;j++) {
    			if(row_map.get(i) == null && col_map.get(j) == null) {
    				continue;
    			}
    			matrix[i][j] =0;
    		}
    	}
    	
    }
}

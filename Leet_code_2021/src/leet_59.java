
public class leet_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//螺旋陣列
	}

    public static int[][] generateMatrix(int n) {
        
    	int[][] res= new int[n][n];
    	int count = 1;
    	int rowbegin = 0;
    	int rowend = res.length-1;
    	int colbegin = 0;
    	int colend = res[0].length-1;
    	
    	while(rowbegin <=rowend && colbegin <= colend) {
    		for(int j = colbegin;j<=colend;j++) {
    			res[rowbegin][j] = count++;
    		}
    		rowbegin++;
    		for(int i=rowbegin;i<=rowend;i++) {
    			res[i][colend] = count++;
    		}
    		colend--;
    		if(rowbegin <=rowend) {
    			for(int j = colend ; j>=colbegin;j-- ) {
    				res[rowend][j] = count++;
    			}
    		}
    		rowend--;
    		if(colbegin <= colend) {
    			for(int i = rowend;i>=rowbegin;i--) {
    				res[i][colbegin] = count++;
    			}
    		}
    		colbegin++;
    		
    	}
    	
    	
    	return res;
    }
}


public class leet_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3, n = 7;
		System.out.println(uniquePaths(m,n));
	}

    public static int uniquePaths(int m, int n) {
    	int[][] tmp = new int[m][n];
    	
    	for(int i=0;i<m;i++) {
    		tmp[i][0] = 1;
    	}
    	for(int j=0;j<n;j++) {
    		tmp[0][j] = 1;
    	}
    
    	for(int i=1;i<m;i++) {
    		for(int j=1;j<n;j++) {
    			tmp[i][j] = tmp[i-1][j]+tmp[i][j-1];
    		}
    	}
    	
    	return tmp[m-1][n-1];
    }
    
    
}

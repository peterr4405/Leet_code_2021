
public class leet_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
    	int row = obstacleGrid.length;
    	int col = obstacleGrid[0].length;
    	int [][] tmp = new int[row][col];
    	
    	
    	for(int i = 0;i<row;i++) {
    		if(obstacleGrid[i][0] ==1) {
    			break;
    		}
    		tmp[i][0] = 1;
    	}
    	for(int j = 0;j<col;j++) {
    		if(obstacleGrid[0][j] ==1) {
    			break;
    		}
    		tmp[0][j] = 1;
    	}
    	
    	for(int i=1;i<row;i++) {
    		for(int j=1;j<col;j++) {
    			if(obstacleGrid[i][j] == 1) {
    				continue;
    			}
    			tmp[i][j] = tmp[i-1][j]+tmp[i][j-1];
    		}
    	}
    	return tmp[row-1][col-1];
    }
}

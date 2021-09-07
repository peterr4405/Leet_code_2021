
public class leet_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
		
	}

	
    public static int minPathSum(int[][] grid) {
        
    	int row = grid.length;
    	int col = grid[0].length;
    	int[][] tmp = new int [row][col];
    	tmp[0][0] = grid[0][0];
    	for(int i=1;i<row;i++) {
    		tmp[i][0] = grid[i][0]+tmp[i-1][0];
    	}
    	for(int j=1;j<col;j++) {
    		tmp[0][j] = grid[0][j]+tmp[0][j-1];
    	}
    	
    	for(int i=1;i<row;i++){
    		for(int j=1;j<col;j++) {
    			tmp[i][j] = Math.min(tmp[i-1][j], tmp[i][j-1])+grid[i][j];
    		}
    	}
    	return tmp[row-1][col-1];
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class leet_200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
	};
		System.out.print(numIslands(grid));
		
		
	}
	   public static int numIslands(char[][] grid) {
	        
	        int count = 0;
	        Queue<int[]> queue = new LinkedList();
	        
	        for(int i=0;i<grid.length;i++){
	            for(int j =0;j<grid[0].length;j++){
	                if(grid[i][j] == '1'){
	                    count++;
	                    grid[i][j] = '*';
	                    queue.offer(new int[]{i,j});
	                    bfs(grid,queue);
	                }
	            }
	        }
	     return count;   
	    }
	        public static void bfs(char[][]grid,Queue<int[]> queue){
	            int[][]dirs = {{0,1},{0,-1},{1,0},{-1,0}};
	            while(!queue.isEmpty()){
	                int[] cur = queue.poll();
	                for(int[] dir : dirs){
	                    int x = cur[0]+dir[0];
	                    int y = cur[1]+dir[1];
	                    
	                    if(x<0 || x>= grid.length || y<0 || y>=grid[0].length || grid[x][y]!='1' )                     {
	                        continue;
	                    }
	                    grid[x][y] = '*';
	                    queue.offer(new int[]{x,y});
	                }
	                
	            }
	            
	            
	        }
}


public class leet_130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
		{'X','X','X','X'}
		,{'X','O','O','X'}
		,{'X','X','O','X'}
		,{'X','O','X','X'}};
		
		solve(board);
		
	}

    public static void solve(char[][] board) {
        
        if(board == null || board.length == 0)return ;
        int row = board.length-1;
        int col = board[0].length-1;
        
        for(int i =0;i<=row ;i++){
            if(board[i][col] == 'O'){
                dfs(i,col,board);
            } 
                if(board[i][0] == 'O'){
                    dfs(i,0,board);
                }
        }
        for(int j =0;j<=col ;j++){
            if(board[row][j] == 'O'){
                dfs(row,j,board);
            } 
                if(board[0][j] == 'O'){
                    dfs(0,j,board);
                }
        }
        
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'A'){
                    board[i][j] ='O';
                }else{
                    board[i][j]= 'X';
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
        
        
        
    }
    public static void dfs(int i,int j ,char[][]board){
        if(i<0 || i>board.length-1 || j<0 || j> board[0].length-1){
            return ;  
        }
        if (board[i][j] !='O'){
          return;  
        }   
        board[i][j] = 'A';
        dfs(i+1,j,board);
        dfs(i-1,j,board);
        dfs(i,j+1,board);
        dfs(i,j-1,board);
    }
    
}

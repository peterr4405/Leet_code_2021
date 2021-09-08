
public class leet_79 {

	public static void main(String[] args) {
		
		
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		
		System.out.println(exist(board, word));
	}
	
	
	   public static boolean exist(char[][] board, String word) {
	    
		   for(int i =0;i<board.length;i++) {
			   for(int j =0;j<board[i].length;j++) {
				   if(check(board, i, j, word, 0)) {
					return true;   
				   }
			   }
		   }
		   
		   return false;
	    }
	   
	   public static boolean check(char[][] board,int i,int j ,String word, int index ) {
		   
		   if(index == word.length()) {
			   return true;
		   }
		   if(i<0|| i>=board.length || j<0 || j >=board[0].length || word.charAt(index)!= board[i][j]) {
			   return false;
		   }
		   
		   char tmp = board[i][j];
		   board[i][j] = '*';
		   boolean found = check(board, i, j+1, word, index+1)
				   ||check(board, i+1, j, word, index+1)
				   ||check(board, i-1, j, word, index+1)
				   ||check(board, i, j-1, word, index+1);
		   board[i][j] = tmp;
		   return found;
	   }
}

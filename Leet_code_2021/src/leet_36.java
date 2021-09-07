import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class leet_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = 
				{{'5','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(board));
		//System.out.println(4/3);
	}

    public static boolean isValidSudoku(char[][] board) {
        
    	for(int i =0;i<board.length;i++) {
    		Map<Character, Integer> map = new HashMap<>();
    		
    		for(int j=0;j<board[i].length;j++) {
    			char c = board[i][j];
    			if(map.get(c) ==null && c!='.') {
    				map.put(c, 1);
    			}else if(map.get(c) !=null){
    				return false;
    			}
    		}
    		map = new HashMap<>();
    		for(int j=0;j<board[i].length;j++) {
    			char c = board[j][i];
    			if(map.get(c) ==null && c!='.') {
    				map.put(c, 1);
    			}else if (map.get(c) !=null) {
    				return false;
    			}
    		}
    		map = new HashMap<>();

    		for(int x = 0; x<3;x++) {
    			for(int y=0;y<3;y++) {
    				char c = board[x+3 *(i/3) ][y+3 * (i%3)];
    				if(map.get(c) == null && c!='.') {
    					map.put(c, 1);
    				}else if (map.get(c) !=null) {
        				return false;
        			}
    			}
    		}

    		
    	}
    	
    	
    	
    	return true;
    }
}

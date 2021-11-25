
public class leet_304 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 int[][] box;
	    
	    public leet_304(int[][] matrix) {
	        if(matrix.length == 0 || matrix[0].length ==0){
	            return;
	        }
	        box = new int[matrix.length+1][matrix[0].length+1];
	        
	        for(int i =0;i<matrix.length;i++){
	            for(int j = 0; j<matrix[0].length;j++){
	                box[i+1][j+1] = box[i+1][j]+box[i][j+1]+matrix[i][j]-box[i][j]; 
	            }
	        }
	        
	    }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	        return box[row2+1][col2+1] - box[row2+1][col1] - box[row1][col2+1] + box[row1][col1];
	    }	
}


public class leet_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}
    public static void rotate(int[][] matrix) {
        
    	int top = 0;
    	int down = matrix.length-1;
    	
    	while(top < down) {
    		
    		int[] tmp = matrix[top]; 
    		matrix[top] = matrix[down];
    		matrix[down] = tmp;
    		top++;
    		down--;
    	}
    	
    	for(int i=0;i<matrix.length;i++) {
    		for(int j = i+1;j<matrix[i].length;j++) {
    			int tmp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = tmp;
    		}
    	}
    	
    }
}

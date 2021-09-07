
public class leet_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 13;
		System.out.println(searchMatrix(matrix, target));
	}

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length ==0 || matrix == null) {
        	return false;
        }
        int m = matrix.length,n = matrix[0].length;
        
    	int low = 0, high = n * m -1;
    	
    	while(low <= high) {
    		int mid = low +(high-low)/2;
    		if(matrix[mid/n][mid%n] == target) {
    			return true;
    		} 
    		if(matrix[mid/n][mid%n] >target) {
    			high = mid-1;
    		}else {
    			low = mid +1;
			}
    	}
    	return false;
    }
}

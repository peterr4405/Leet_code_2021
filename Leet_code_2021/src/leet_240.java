
public class leet_240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0)
			return false;
		int m = matrix.length;
		int n = matrix[0].length;

		int curRow = 0;
		int curCol = n - 1;
		while (curRow < m && curCol >= 0) {
			if (matrix[curRow][curCol] == target) {
				return true;
			} else if (matrix[curRow][curCol] > target) {
				curCol--;
			} else {
				curRow++;
			}
		}
		return false;
	}
}

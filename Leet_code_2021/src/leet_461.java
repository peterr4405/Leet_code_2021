
public class leet_461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hammingDistance(int x, int y) {

		int dis = 0;

		while (x > 0 || y > 0) {

			int xbit = x % 2;
			int ybit = y % 2;
			if (xbit != ybit) {
				dis++;
			}
			x = x / 2;
			y = y / 2;

		}
		return dis;
	}
}

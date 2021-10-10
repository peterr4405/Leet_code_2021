
public class leet_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
    while(left!=right){
        left = left>>1;
        right = right>>1;
        cnt++;
    }
    return left<<cnt;
    }
}

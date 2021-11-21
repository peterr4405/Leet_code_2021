import java.util.Arrays;

public class leet_274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]citations = {3,0,6,1,5};
			hIndex(citations);
	}
    public static int hIndex(int[] citations) {

        Arrays.sort(citations);
        int index = 0;
        int res =0;
        for(int i =citations.length-1; i>=0 ;i--){
         index ++;
            if(citations[i] >= index){
                res = Math.max(res,index);
            }
        }
        return res;
    }
}

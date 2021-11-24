import java.util.ArrayList;
import java.util.List;

public class leet_986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int[]> res= new ArrayList();
        
       int i =0;
       int j =0;
        
       while(i < firstList.length && j < secondList.length ) {
           
           int start = Math.max(firstList[i][0],secondList[j][0]);
           int end = Math.min(firstList[i][1],secondList[j][1]);
           
           if(start <= end){
               res.add(new int[]{start,end});
           }
           
           if(firstList[i][1]< secondList[j][1]){
               i++;
           }else{
               j++;
           }
           
       }
        
        return res.toArray(new int[res.size()][]);
    }
}

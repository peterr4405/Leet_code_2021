
public class leet_223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
		
	}
	 public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
	        
	        int areaA = (ax2-ax1) * (ay2-ay1);
	        int areaB = (bx2-bx1) * (by2-by1);
	        
	        int repeatArea = 0;
	        
	        int maxLeft = Math.max(ax1,bx1);
	        int minRight = Math.min(ax2,bx2);
	        int minTop = Math.min(ay2,by2);
	        int maxBottom = Math.max(ay1,by1);
	        
	        if(maxLeft < minRight && minTop > maxBottom){
	            repeatArea = Math.abs(minRight-maxLeft) *Math.abs(minTop-maxBottom);
	        }
	        return areaA + areaB - repeatArea;
	    }
}

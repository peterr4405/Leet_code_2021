
public class leet_171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int titleToNumber(String columnTitle) {
        int res = 0; 
        for(int i=0;i<columnTitle.length();i++){
            
            res = res * 26 + (columnTitle.charAt(i)-64);
            
        }
        return res;
    }
}

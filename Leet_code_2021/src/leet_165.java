
public class leet_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int compareVersion(String version1, String version2) {
        
        int res1 = 0;
        int res2 = 0;
        int len1 = 0;
        int len2 = 0;
        while(len1 < version1.length() || len2 < version2.length()){
            
            while(len1<version1.length() && version1.charAt(len1) !='.' ){
                res1 = res1 *10 + (version1.charAt(len1)-'0');
                len1++;
            }
            while( len2<version2.length() && version2.charAt(len2) !='.'){
                res2 = res2 *10 + (version2.charAt(len2)-'0');
                len2++;
            }
            if(res1 < res2){
                return -1;
            }else if (res1 > res2){
                return 1;
            }
            res1 = res2 = 0;
            len1++;
            len2++;
        }
        
        return 0;
    }
}

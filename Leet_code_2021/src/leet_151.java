
public class leet_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static String reverseWords(String s) {
        if(s.length() == 0 || s == null) return "";
        StringBuilder sb = new StringBuilder();
        s = s.replaceAll("\\s{2,}", " ").trim();	//超過1個的空格全部轉成1個空格
        String[] tmp = s.split(" ");
        for(int i = tmp.length-1 ;i>=0;i--){
            sb.append(tmp[i] + " ");
        }
        return sb.toString().trim();
    }
}

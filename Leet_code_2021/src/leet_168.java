
public class leet_168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1322;
		String s = convertToTitle(i);
		System.out.println(s);
	}
    public static String convertToTitle(int columnNumber) {
        
        StringBuilder res = new StringBuilder();
        while( columnNumber > 0  ){
               int temp = columnNumber%26;
                if( temp == 0 ){ 
                temp = 26 ;
                columnNumber -= 26 ;
                }
              res.append((char)( temp + 64 ));
                columnNumber = columnNumber/26;
                
        }
                
            return res.reverse().toString();
    }
}

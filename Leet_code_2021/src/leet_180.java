
public class leet_180 {

	public static void main(String[] args) {
		/*
		SELECT DISTINCT a.Num ConsecutiveNums FROM (
		SELECT t.Num ,
		       @cnt:=IF(@pre=t.Num, @cnt+1, 1) cnt,
		       @pre:=t.Num pre
		  FROM Logs t, (SELECT @pre:=null, @cnt:=0) b) a
		  WHERE a.cnt >= 3
		*/
	}

}

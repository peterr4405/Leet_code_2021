
public class leet_178 {
	/*
	 Input: 
	Scores table:
	+----+-------+
	| Id | Score |
	+----+-------+
	| 1  | 3.50  |
	| 2  | 3.65  |
	| 3  | 4.00  |
	| 4  | 3.85  |
	| 5  | 4.00  |
	| 6  | 3.65  |
	+----+-------+
	Output: 
	+-------+------+
	| Score | Rank |
	+-------+------+
	| 4.00  | 1    |
	| 4.00  | 1    |
	| 3.85  | 2    |
	| 3.65  | 3    |
	| 3.65  | 3    |
	| 3.50  | 4    |
	+-------+------+ 
	 */

	public static void main(String[] args) {
		/*
		SELECT score as Score, DENSE_RANK() OVER(order by score DESC) as "Rank"
		from Scores
		*/
	}

}

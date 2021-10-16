
public class leet_177 {

/*	
	+-------------+------+
	| Column Name | Type |
	+-------------+------+
	| Id          | int  |
	| Salary      | int  |
	+-------------+------+
	
	Input: 
	Employee table:
	+----+--------+
	| Id | Salary |
	+----+--------+
	| 1  | 100    |
	| 2  | 200    |
	| 3  | 300    |
	+----+--------+
	n = 2
	Output: 
	+------------------------+
	| getNthHighestSalary(2) |
	+------------------------+
	| 200                    |
	+------------------------+
*/
	public static void main(String[] args) {
		/*
		CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
	BEGIN
	    set N = N-1;
	  RETURN (
	      # Write your MySQL query statement below.
	   Select IFNULL ((select distinct salary from employee order by salary desc limit 1 offset N), NULL);
	  );
	END
		*/
	}

}

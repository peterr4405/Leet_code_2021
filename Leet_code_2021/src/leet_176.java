
public class leet_176 {
	/*
	Table: Employee

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
	Output: 
	+---------------------+
	| SecondHighestSalary |
	+---------------------+
	| 200                 |
	+---------------------+
	*/
	
	public static void main(String[] args) {
		/*
		select max(Salary) as SecondHighestSalary 
		from Employee where Salary not in (select max(Salary) from Employee);


		select IFNULL(
    	(select distinct salary from employee order by salary desc limit 1 offset 1)
    	,null) as secondhighestsalary;
		*/
	}

}

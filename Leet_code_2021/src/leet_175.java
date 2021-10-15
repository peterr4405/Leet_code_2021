
public class leet_175 {
/*
	Table: Person

	+-------------+---------+
	| Column Name | Type    |
	+-------------+---------+
	| PersonId    | int     |
	| FirstName   | varchar |
	| LastName    | varchar |
	+-------------+---------+
	
	
	Table: Address

	+-------------+---------+
	| Column Name | Type    |
	+-------------+---------+
	| AddressId   | int     |
	| PersonId    | int     |
	| City        | varchar |
	| State       | varchar |
	+-------------+---------+

	Input: 
	Person table:
	+----------+----------+-----------+
	| PersonId | LastName | FirstName |
	+----------+----------+-----------+
	| 1        | Wang     | Allen     |
	| 2        | Alice    | Bob       |
	+----------+----------+-----------+
	Address table:
	+-----------+----------+---------------+------------+
	| AddressId | PersonId | City          | State      |
	+-----------+----------+---------------+------------+
	| 1         | 2        | New York City | New York   |
	| 2         | 3        | Leetcode      | California |
	+-----------+----------+---------------+------------+
	Output: 
	+-----------+----------+---------------+----------+
	| FirstName | LastName | City          | State    |
	+-----------+----------+---------------+----------+
	| Allen     | Wang     | Null          | Null     |
	| Bob       | Alice    | New York City | New York |
	+-----------+----------+---------------+----------+
*/	
	public static void main(String[] args) {
		
	/*	
		select firstName,LastName,City,State
		from person p
		left join address a
		on p.personid = a.personid;
	*/	
	}

}

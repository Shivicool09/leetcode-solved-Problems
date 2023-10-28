# Write your MySQL query statement below
select max(Salary) as secondHighestSalary 
from Employee 
where Salary not in (
  select max(salary) from Employee);

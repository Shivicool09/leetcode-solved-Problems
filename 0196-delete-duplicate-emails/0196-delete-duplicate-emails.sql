# Write your MySQL query statement below
DELETE FROM Person WHERE
id IN(SELECT id FROM(
SELECT id, row_number() OVER(PARTITION BY email order by id)
AS row_num FROM Person) p
WHERE row_num>1
)

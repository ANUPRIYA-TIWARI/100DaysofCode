# Write your MySQL query statement below
SELECT visits.customer_id, COUNT(visits.visit_id)AS count_NO_TRANS
FROM Visits
LEFT JOIN Transactions
ON Visits.Visit_ID =Transactions.Visit_ID
WHERE transactions.transaction_id IS NULL
GROUP BY visits.customer_id
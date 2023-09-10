# Write your MySQL query statement below
SELECT tweet_id FROM Tweets where CHAR_LENGTH(CONTENT)>15;
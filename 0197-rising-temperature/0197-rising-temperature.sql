SELECT C.id
FROM Weather AS P
INNER JOIN Weather AS C ON DATE_ADD(P.recordDate, INTERVAL 1 DAY) = C.recordDate
    AND C.Temperature > P.Temperature
/*Query 1*/
SELECT COUNT(*) FROM flights;

/*Query 2*/
SELECT Origin, AVG(DepDelay), AVG(ArrDelay)
FROM usairlineflights.flights 
GROUP BY Origin;

/*Query 3*/
SELECT Origin, colYear, colMonth, AVG(ArrDelay)
FROM usairlineflights.flights 
GROUP BY Origin, colMonth;

/*Query 4*/
SELECT usairports.City, colYear, colMonth, AVG(ArrDelay)
FROM usairlineflights.flights
INNER JOIN usairports ON flights.Origin=usairports.IATA
GROUP BY Origin, colMonth;

/*Query 5*/
SELECT carriers.Description, SUM(Cancelled)
FROM usairlineflights.flights
INNER JOIN carriers ON flights.UniqueCarrier=carriers.CarrierCode
GROUP BY UniqueCarrier
ORDER BY SUM(Cancelled) DESC;

/*Query 6*/
SELECT TailNum, SUM(Distance) AS total_distance
FROM usairlineflights.flights
WHERE Cancelled = 0
GROUP BY TailNum
ORDER BY total_distance DESC;

/*Query 7*/
SELECT carriers.Description, AVG(ArrDelay) AS AverageDelay
FROM usairlineflights.flights
INNER JOIN carriers ON flights.UniqueCarrier=carriers.CarrierCode
GROUP BY UniqueCarrier
HAVING (AverageDelay) > 10

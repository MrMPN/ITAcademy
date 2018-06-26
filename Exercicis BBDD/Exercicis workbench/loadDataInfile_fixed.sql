use USAirlineFlights;
/*TRUNCATE TABLE flights;

/*SHOW VARIABLES LIKE 'secure_file_priv';*/

LOAD DATA LOCAL INFILE 'C:/Program Files/MySQL/MySQL Server 5.7/Uploads/USFlights/data/carriers.csv'
INTO TABLE carriers 
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Program Files/MySQL/MySQL Server 5.7/Uploads/USFlights/data/airports.csv'
INTO TABLE usairports 
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Program Files/MySQL/MySQL Server 5.7/Uploads/USFlights/data/2000.csv'
INTO TABLE flights 
FIELDS TERMINATED BY ','
IGNORE 1 ROWS
(colYear, colMonth, DayOfMonths, DayOfWeek, @DepTime, CRSDepTime, @ArrTime, CRSArrTime, UniqueCarrier, FlightNum, TailNum, @ActualElapsedTime, CRSElapsedTime, @AirTime, @ArrDelay, @DepDelay, Origin, Dest, Distance, TaxiIn, TaxiOut, Cancelled, CancellationCode, Diverted)
SET
  DepTime = CASE WHEN @DepTime NOT IN ('NA', 'NaN', '--') THEN @DepTime END,
  ArrTime = CASE WHEN @ArrTime NOT IN ('NA', 'NaN', '--') THEN @ArrTime END,
  ActualElapsedTime = CASE WHEN @ActualElapsedTime NOT IN ('NA', 'NaN', '--') THEN @ActualElapsedTime END,
  ArrDelay = CASE WHEN @ArrDelay NOT IN ('NA', 'NaN', '--') THEN @ArrDelay END,
  DepDelay = CASE WHEN @DepDelay NOT IN ('NA', 'NaN', '--') THEN @DepDelay END;
  
  
LOAD DATA LOCAL INFILE 'C:/Program Files/MySQL/MySQL Server 5.7/Uploads/USFlights/data/2000x2000.csv'
INTO TABLE flights 
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(colYear, colMonth, DayOfMonths, DayOfWeek, @DepTime, CRSDepTime, @ArrTime, CRSArrTime, UniqueCarrier, FlightNum, TailNum, @ActualElapsedTime, CRSElapsedTime, @AirTime, @ArrDelay, @DepDelay, Origin, Dest, Distance, TaxiIn, TaxiOut, Cancelled, CancellationCode, Diverted)
SET
  DepTime = CASE WHEN @DepTime NOT IN ('NA', 'NaN', '--') THEN @DepTime END,
  ArrTime = CASE WHEN @ArrTime NOT IN ('NA', 'NaN', '--') THEN @ArrTime END,
  ActualElapsedTime = CASE WHEN @ActualElapsedTime NOT IN ('NA', 'NaN', '--') THEN @ActualElapsedTime END,
  ArrDelay = CASE WHEN @ArrDelay NOT IN ('NA', 'NaN', '--') THEN @ArrDelay END,
  DepDelay = CASE WHEN @DepDelay NOT IN ('NA', 'NaN', '--') THEN @DepDelay END;
  
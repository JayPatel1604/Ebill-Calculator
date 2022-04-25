Create database EBBill;
use EBBill;
-- Below table script is for Mysql 5 
CREATE TABLE ElectricityBill(   
    consumer_number varchar(255),
    name varchar(255),
    address varchar(255),
    units_consumed  int(11),
    bill_amount float(12,2)
);

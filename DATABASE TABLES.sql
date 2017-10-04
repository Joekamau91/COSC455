CREATE TABLE PAYMENTAPI(
id INT NOT NULL AUTO_INCREMENT,
FormPayment VARCHAR(50),
PaymentAccount VARCHAR(50),
PRIMARY KEY(id) );
DESCRIBE PAYMENTAPI;
CREATE TABLE SOCIALMEDIAAPI(
id INT NOT NULL AUTO_INCREMENT,
user VARCHAR(50),
facility VARCHAR(50),
event VARCHAR(50),
picture VARCHAR(50),
socialmediasite VARCHAR(50),
site VARCHAR(50),
PRIMARY KEY(id) );
DESCRIBE SOCIALMEDIAAPI;
CREATE TABLE REPORT(
id INT NOT NULL AUTO_INCREMENT,
filename VARCHAR(50),
filetype VARCHAR(50),
user VARCHAR(50),
creationtime DATE,
PRIMARY KEY(id) );
CREATE TABLE USER(
id INT NOT NULL AUTO_INCREMENT,
usertype VARCHAR(50),
name VARCHAR(50),
email VARCHAR(50),
phone INT,
username VARCHAR(50),
password VARCHAR(50),
location VARCHAR(50),
myschool VARCHAR(50),
myevent VARCHAR(50),
mydonation DECIMAL(8,2),
mytickets VARCHAR(50),
PRIMARY KEY(id) );
CREATE TABLE EVENTS(
id INT auto_increment,
name VARCHAR(50),
userid INT,
startdate DATE,
enddate DATE,
timeframe TIME,
location VARCHAR(50),
facility VARCHAR(50),
user VARCHAR(50),
minusers INT,
maxusers INT,
acceptedusers INT,
PRIMARY KEY(id) );
CREATE TABLE CALENDAR(
id INT AUTO_INCREMENT,
dates DATE,
PRIMARY KEY(id) );
CREATE TABLE SCHOOL(
id INT AUTO_INCREMENT,
name VARCHAR(50),
location VARCHAR(50),
zip INT,
address VARCHAR(50),
state CHAR(50),
PRIMARY KEY(id) );
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Montgomery Blair High School','Silver Spring','20901','51 Universty Blvd East','MD');
SELECT * FROM SCHOOL;
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'North Point High School','Waldorf','20603','2500 Davis Rd','MD');
SELECT * FROM SCHOOL;
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Bowie High School','Bowie','20715','15200 Annapolis RD','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Walter Johnson High School','Bethesda','20814','6400 Rock Spring Dr','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Old Mill High School','Millersville','21108','600 Patriot Ln','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Evening High School','Baltimore','21220','9610 Pulaski Park Dr','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Baltimore County Detention Center','Frostburg','21252','8000 YORK RD','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Allegany County Evening High School','Cumberland','21252','8000 YORK RD','MD');
INSERT INTO SCHOOL(id,name,location,zip,address,state)VALUES(null,'Bridge Center High Shool','Arbutus','21227','1740 Twin Springs RD','MD');
SELECT * FROM SCHOOL;
CREATE TABLE EVENT(
id INT AUTO_INCREMENT,
eventname VARCHAR(50),
location VARCHAR(50),
capacity INT,
PRIMARY KEY(id) );

INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Base Ball','Bowie High School','100');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Swimming','Allegany High School','30');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Soccer','North Point High School','200');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'American Football','Evening High School','400');
SELECT * FROM EVENT;
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Bowling','Bowie High School','120');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Soccer','Allegany High School','60');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'BaseBall','North Point High School','200');
INSERT INTO EVENT(id,eventname,location,capacity)VALUES(null,'Swimming','Evening High School','300');
CREATE TABLE SCHOOLS(
id INT AUTO_INCREMENT,
name VARCHAR(50),
location VARCHAR(50),
zip INT,
address VARCHAR(50),
state CHAR(50),
PRIMARY KEY(id) );
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Montgomery Blair High School','Silver Spring','20901','51 Universty Blvd East','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'North Point High School','Waldorf','20603','2500 Davis Rd','MD');

INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Bowie High School','Bowie','20715','15200 Annapolis RD','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Walter Johnson High School','Bethesda','20814','6400 Rock Spring Dr','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Old Mill High School','Millersville','21108','600 Patriot Ln','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Evening High School','Baltimore','21220','9610 Pulaski Park Dr','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Baltimore County Detention Center','Frostburg','21252','8000 YORK RD','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Allegany County Evening High School','Cumberland','21252','8000 YORK RD','MD');
INSERT INTO SCHOOLS(id,name,location,zip,address,state)VALUES(null,'Bridge Center High Shool','Arbutus','21227','1740 Twin Springs RD','MD');
CREATE TABLE USERS(
id INT NOT NULL AUTO_INCREMENT,
Fname VARCHAR(50),
Lname VARCHAR(50),

PRIMARY KEY (id) );
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'John','Smith');
INSERT INTO USTOMERS(id,Fname,Lname) VALUES (null,'Ann','Simons');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'James','Johnsons');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Hudson','Jameson');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Yusuf','Patricks');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Patrick','Habib');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Jane','Morris');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Irene','Michaels');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Simon','Samson');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Joseph','Daniels');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Johnson','Jakes');
INSERT INTO USERS(id,Fname,Lname) VALUES (null,'Melvis','Monet');




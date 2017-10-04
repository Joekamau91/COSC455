CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT,
Fname VARCHAR(50),
Lname VARCHAR(50),
Password VARCHAR(50),
Address VARCHAR(50),
 Email VARCHAR(50) ,
PRIMARY KEY (id) );

INSERT INTO users VALUES(null,'JOHN','SUSAN','64R898','TOWSON','MMFHDIEag@gmail.com');
INSERT INTO users VALUES(null,'James','SAMUELS','J9JRD78','BALTIMORE','uybdhshs@gmail.com');
INSERT INTO users VALUES(null,'Eunice','MICHAELS','54099R78','FREDRICK','yusufg@gmail.com');
INSERT INTO users VALUES(null,'JOHNSON','MERCY','0000','HARTFORD','johnson@gmail.com');
INSERT INTO users VALUES(null,'HANNA','NELSON','22222IN','HARFORD','hannag@gmail.com');
INSERT INTO users VALUES(null,'YUSUF','JOSEPHS','9077DBC78','CATONSVILLE','yusuf@gmail.com');
INSERT INTO users VALUES(null,'PAT','GURY','RBBFI9','ESSEX','patg@gmail.com');
INSERT INTO users VALUES(null,'ANN','DANIELS','HDUUD908','BALTIMORE','daniels@gmail.com');
INSERT INTO users VALUES(null,'LEAH','PRECIOUS','3NXO09R78','BALTIMORE','leah@gmail.com');
INSERT INTO users VALUES(null,'JANE','ADRIEL','ON9548','RUTHERFORD','jane@gmail.com');
INSERT INTO users VALUES(null,'TROY','JOHS','29FBRU7','TOWSON','troy@gmail.com');
INSERT INTO users VALUES(null,'HANS','LENS','097DVB4','ESSEX','hans@gmail.com');
INSERT INTO users VALUES(null,'HUDSON','JOY','0E7HSC ','BALTIMORE','hudson@gmail.com');
SELECT * FROM users;
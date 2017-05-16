CREATE TABLE city (
id int(11) AUTO_INCREMENT NOT NULL, 
name VARCHAR(45) NOT NULL, 
country VARCHAR(45) NOT NULL,
PRIMARY KEY (id));

INSERT INTO city (name,country) VALUES ('Paris', 'Francia');
INSERT INTO city (name,country) VALUES ('Londres', 'Inglaterra');
INSERT INTO city (name,country) VALUES ('Madrid', 'España');
INSERT INTO city (name,country) VALUES ('Buenos Aires', 'Argentina');
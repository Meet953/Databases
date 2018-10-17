#1
SELECT DATEDIFF(CURDATE(), "1997-11-24");

#2
UPDATE doctors SET lastName='Mount' WHERE firstname = 'Lily' AND lastname = 'Burke';

#3
SELECT drug_name, cost FROM drugs WHERE cost = (SELECT MAX(cost) from drugs);
 
 #4
 SELECT drug_name FROM drugs WHERE cost = (SELECT MIN(cost) from drugs);
 
 #5
 SELECT * FROM patients where address2 IS NULL;
 
 #6
 UPDATE patients SET address2 = 'Croi Oige' WHERE firstName = 'Emma' AND lastName = 'Fallon';
 
 #7
 SELECT AVG(cost) FROM drugs;
 
 #8
 SELECT COUNT(*) AS 'Count', speciality FROM doctors GROUP BY speciality;
 
 #9
 SELECT DISTINCT UPPER(speciality) FROM doctors;
 
 #10
 SELECT COUNT(*) AS 'Prescriptions' FROM prescriptions;
 
 #11
 SELECT firstName, LastName FROM doctors 
 INNER JOIN prescriptions 
 ON doctors.doc_id = prescriptions.doc_id
 WHERE prescriptions.pat_id = 6;
 
 #12
 SELECT firstName, lastName FROM patients WHERE pat_id 
 NOT IN (SELECT pat_id FROM prescriptions);
 
 #13
 INSERT INTO drugs (drug_name, cost) VALUES ('Ketamine', '4.80');
 SELECT * FROM drugs;
 
 #14
 SELECT DISTINCT drug_name FROM drugs 
 INNER JOIN prescriptions
 ON drugs.drug_id = prescriptions.drug_id;

#15
ALTER TABLE drugs 
ADD COLUMN manufacturer VARCHAR(45) AFTER cost;

#16
UPDATE drugs SET manufacturer = 'GlaxoSmithKline' WHERE 
drug_name = 'Panadol' OR drug_name = 'Calpol';
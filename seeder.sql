CREATE DATABASE IF NOT EXISTS floatme_db;

USE floatme_db;

INSERT INTO people (name, age, date_joined, date_updated) VALUES
('Jim', 30, '2015-05-25', '2019-12-14'),
('Mike', 45, '2008-03-22', '2020-08-20'),
('Pam', 30, '2012-07-15', '2021-03-11');

INSERT INTO jobs (job_title, salary) VALUES
('Sales Person', 50000),
('Manager', 65000),
('Administrator', 51000);
CREATE TABLE ILAKKIYA_EMPLOYEES 
( 
ID INT PRIMARY KEY, 
FIRST_NAME VARCHAR(40), 
LAST_NAME VARCHAR(40), 
SALARY DECIMAL(8,2), 
DEPARTMENT_ID INT, 
YEAR_OF_JOINING DATETIME, 
YEAR_OF_RELIEVING DATETIME 
) 
CREATE TABLE ILAKKIYA_DEPARTMENTS 
( 
DEPARTMENT_ID INT PRIMARY KEY, 
MANAGER_ID INT, 
DEPARTMENT_NAME VARCHAR(50) 
)
insert into ILAKKIYA_EMPLOYEES  values(001,'Raghul','Subburaj',52000.00,101,'09-01-1999','12-12-2001');
insert into ILAKKIYA_EMPLOYEES  values(002,'Gayathri','Sundar',60000.00,102,'09-10-1999','12-22-2009');
insert into ILAKKIYA_EMPLOYEES  values(003,'deepika','Jeyaram',25000.00,103,'10-01-1995','12-29-2020');
insert into ILAKKIYA_EMPLOYEES  values(004,'Jeni','Rani',58000.00,101,'03-01-1996','12-31-2011');
insert into ILAKKIYA_EMPLOYEES  values(005,'Vasu','Sasi',38000.00,103,'09-11-1992','12-30-2002');
insert into ILAKKIYA_EMPLOYEES values(006,'Ram','Lakshman',45000.00,102,'07-01-1990','12-25-2001');
insert into ILAKKIYA_EMPLOYEES values(007,'kalees','Waran',32000.00,101,'09-01-1999','12-18-2000');
insert into ILAKKIYA_EMPLOYEES values(008,'selva','Raghul',65000.00,104,'09-01-1999','12-21-2017');
insert into ILAKKIYA_EMPLOYEES  values(009,'anish','Kumar',72000.00,102,'09-01-1999','10-12-2016');
insert into ILAKKIYA_EMPLOYEES  values(010,'arun','Kumar',59000.00,104,'04-01-1990','12-02-2011');
insert into ILAKKIYA_EMPLOYEES  values(011,'ilakkiyaa','Arivudainambi',80000.00,103,'05-05-1996','12-12-2022');

insert into ILAKKIYA_DEPARTMENTS values (101,011,'Developer');
insert into ILAKKIYA_DEPARTMENTS values (102,009,'Testing');
insert into ILAKKIYA_DEPARTMENTS values (103,001,'Admin');
insert into ILAKKIYA_DEPARTMENTS values (104,005,'Sales');
select * from ILAKKIYA_DEPARTMENTS ;
select * from  ILAKKIYA_EMPLOYEES ;
--1.Write a query to display all the name which starts with S
select FIRST_NAME from ILAKKIYA_EMPLOYEES where FIRST_NAME like's%';
--2.Write a query to display all the name starts with S and ends with character n.
select FIRST_NAME from ILAKKIYA_EMPLOYEES where FIRST_NAME like's%n';
--3.Write a query to display all the employees who are all working for department 102 and their name must starts with ‘S’.
select * from ILAKKIYA_EMPLOYEES where FIRST_NAME like's%' and  DEPARTMENT_ID in (102);
--4.Display all the department id which contain 2 as 2nd character.
select DEPARTMENT_ID from ILAKKIYA_EMPLOYEES where DEPARTMENT_ID like'_2%';
--5.Write a query to display all the employees who are all working in department 102,101,103
select * from ILAKKIYA_EMPLOYEES where DEPARTMENT_ID in (102,101,103);
--6.Write a query to display who are all getting salary between 4000 and 5000.
select * from ILAKKIYA_EMPLOYEES where SALARY between 40000 and 50000;
--Display First_name, salary, department_id and manager_id of the employee who don't have manager
select FIRST_NAME,SALARY,ILAKKIYA_EMPLOYEES.DEPARTMENT_ID,MANAGER_ID from ILAKKIYA_EMPLOYEES inner join ILAKKIYA_DEPARTMENTS on ILAKKIYA_EMPLOYEES.DEPARTMENT_ID=ILAKKIYA_DEPARTMENTS.DEPARTMENT_ID where MANAGER_ID is null; 
--Display all the records in employees table and sort the first name in ascending order.
select * from ILAKKIYA_EMPLOYEES order by FIRST_NAME;
--9.Display first name, department id and salary from employees table and sort the records ( sort department id in ascending order and salary in descending order) 
select FIRST_NAME,SALARY,DEPARTMENT_ID from ILAKKIYA_EMPLOYEES order by DEPARTMENT_ID,SALARY desc;
--10.Display first three characters from first name.
select LEFT(FIRST_NAME,3) from ILAKKIYA_EMPLOYEES ;
--11.Display last two character from last name.
select RIGHT(LAST_NAME,2) from ILAKKIYA_EMPLOYEES ;
--12.Display all the first name and position of a in that name (first occurrence of a). 
select FIRST_NAME,Charindex('a',FIRST_NAME) as POSITION  from ILAKKIYA_EMPLOYEES;
--13. Write a query to select maximum salary from employees table.
select Max(SALARY) As Maximum_Salary from ILAKKIYA_EMPLOYEES;
--14.Write a query to select second maximum salary from employees table.
select e1.SALARY from ILAKKIYA_EMPLOYEES e1 where(select count(distinct e2.SALARY) from ILAKKIYA_EMPLOYEES e2 where e1.SALARY<e2.SALARY)=2-1;
--15.Display average salary in the department 102
select avg(SALARY) As Average_Salary from ILAKKIYA_EMPLOYEES where DEPARTMENT_ID=102;
--16.Display number of employees joined in each year into department 102.
select Count(*) as Count,year(YEAR_OF_JOINING)as year from ILAKKIYA_EMPLOYEES where DEPARTMENT_ID in(102) group by year(YEAR_OF_JOINING);
--18..Display the month in which more than 5 employees joined in any department
select datename (month,YEAR_OF_JOINING)as month from ILAKKIYA_EMPLOYEES group by datename (month,YEAR_OF_JOINING)having count (ID)>5;
--17.Display average salary for employees who did a job in the past.
select avg(SALARY) avg from ILAKKIYA_EMPLOYEES where YEAR_OF_RELIEVING < GETDATE();
--19.Display employee last name, starting date for all jobs from 1995 to 2000.
select LAST_NAME, YEAR_OF_JOINING from ILAKKIYA_EMPLOYEES where YEAR_OF_JOINING between '01-01-1995' and '12-31-2000';
--20.Display years in which more than 10 employees joined.
select datename (year,YEAR_OF_JOINING)as year from ILAKKIYA_EMPLOYEES group by datename (year,YEAR_OF_JOINING)having count (ID)>3;
--22.Display the number of days between working for all employees.
select ID,DATEDIFF(day,YEAR_OF_JOINING,YEAR_OF_RELIEVING) as days from ILAKKIYA_EMPLOYEES; 
--23.Display employees who joined in the current year. 
select ID from ILAKKIYA_EMPLOYEES where year(YEAR_OF_JOINING)=year(GETDATE());
--24.Display first name in upper case and last name in lower case.
select UPPER (FIRST_NAME) FIRST_NAME,LOWER(LAST_NAME) LAST_NAME from ILAKKIYA_EMPLOYEES;
--25.Display the length of first name for employees where last name contain character ‘A’ after 3rd position. 
select len(FIRST_NAME) LENGTH,FIRST_NAME from ILAKKIYA_EMPLOYEES where FIRST_NAME like '___%a%';
--26.Display first name and experience of the employees.
select FIRST_NAME, YEAR(YEAR_OF_RELIEVING)-year(YEAR_OF_JOINING) experience from ILAKKIYA_EMPLOYEES;
--27.Display employees who joined in the month of May. 
select  FIRST_NAME from ILAKKIYA_EMPLOYEES where datename(month,YEAR_OF_JOINING)='May';
--28.write a SQL query to find those employees who earn more than the average salary. Return employee ID, first name, last name.
select FIRST_NAME,LAST_NAME,ID from ILAKKIYA_EMPLOYEES where SALARY>(select avg(SALARY) from ILAKKIYA_EMPLOYEES);
--31.Create View table for ID,FIRST_NAME,LAST_NAME, DEPARTMENT_ID,DEPARTMENT_NAME.
CREATE VIEW ILAKKIYAA_EMPLOYEES_RECORDS As select ID,FIRST_NAME,LAST_NAME, 
e.DEPARTMENT_ID,DEPARTMENT_NAME from ILAKKIYA_EMPLOYEES e inner join ILAKKIYA_DEPARTMENTS d on e.DEPARTMENT_ID=d.DEPARTMENT_ID;
select*from ILAKKIYAA_EMPLOYEES_RECORDS;
update ILAKKIYA_EMPLOYEES set YEAR_OF_RELIEVING = null where ID=003;
update ILAKKIYA_EMPLOYEES set LAST_NAME= null where ID=011;
--30.Repalce ‘null’ value to ‘AAA’ 
update ILAKKIYA_EMPLOYEES set LAST_NAME ='AAA' where  ID=011;
--32.Create SYNONYMS for EMPLOYEE table.
CREATE synonym ILAKKIYAA_EMPLOYEES_SYNONYM for ILAKKIYA_EMPLOYEES;
select * from ILAKKIYAA_EMPLOYEES_SYNONYM;
--33.Create a procedure for who are joined between 2 dates.
create procedure BETWEEN_DATES_EX
as
select ID from ILAKKIYAA_EMPLOYEES where YEAR_OF_JOINING between '09-01-1990' and '10-10-1997'
go
exec BETWEEN_DATES_EX ;
--34.Create a procedure for insert a rows in Department table.
create procedure INSERT_ROW_EXAMPLE
as
insert into ILAKKIYA_DEPARTMENTS values(105,007,'Finance');
go
exec INSERT_ROW_EXAMPLE;
--35.write a query for convert ‘2006-12-30 00:38:54.840’ to 20061230003854 
select replace(convert(varchar,'2006-12-30',101),'-','')+ replace(convert(varchar,'00:38:54',108),':','');
--primary key
CREATE TABLE ILAKKIYA_DEPARTMENTS 
( 
DEPARTMENT_ID INT PRIMARY KEY, 
MANAGER_ID INT, 
DEPARTMENT_NAME VARCHAR(50) 
)
--foreign key
CREATE TABLE ILAKKIYAA_EMPLOYEES 
( 
ID INT PRIMARY KEY, 
FIRST_NAME VARCHAR(40), 
LAST_NAME VARCHAR(40), 
SALARY DECIMAL(8,2), 
DEPARTMENT_ID INT foreign key REFERENCES ILAKKIYA_DEPARTMENTS , 
YEAR_OF_JOINING DATETIME, 
YEAR_OF_RELIEVING DATETIME 
) 
--
select DEPARTMENT_NAME FROM ILAKKIYAA_EMPLOYEES INNER JOIN ILAKKIYA_DEPARTMENTS ON 
ILAKKIYAA_EMPLOYEES.DEPARTMENT_ID=ILAKKIYA_DEPARTMENTS.DEPARTMENT_ID GROUP BY DEPARTMENT_NAME HAVING AVG(SALARY)>10000;
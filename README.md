

# JDBC
Java Database Connectivity

#### Installation process

1. Install MySql database
https://dev.mysql.com/downloads/installer/

2. Configure database connector -mysql connector jar
https://dev.mysql.com/downloads/connector/j/     ----> Download platform 
independent

3. Mysql workspace
https://www.mysql.com/products/workbench/






![App Screenshot](https://github.com/vish-muskan19/JDBC/blob/main/JDBC_tutorial/SS.png?raw=true)

#### Simple setups to create database in mysql database

+ Open mysql command line

+ Enter pass which you set

+ Now command lines command for create database

i. create database testdatabse;  ---> Name of database

ii. show databases; ----------------> Command of get all database list

iii. use product;  --------------------> Select database from list


iv. create table productlist(sid int(10) primary key auto_increment, pname varchar(100) not null, stype varchar(10));

v. show tables;

vi. Desc productlist;  ---------------> To get list parameter details

vii. select * from product; ---------> To get all list of table

### Authentication problem:
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';


## Important query

### To insert into database
String q = "Insert into productlist(pname,ptype) value(?,?)";

### To read from database
String q="select * from productlist";

### To update into database
String q1="update productlist set pname =? where pid=?";

### To delete from database
String q1="delete from productlist where pid=?";

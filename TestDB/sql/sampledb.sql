drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
NO int,name varchar(50),age int, Mail varchar(50));

insert into sample_table values(1, "Yamada",21,
"xxx@yahoo.co.jp");
insert into sample_table values(2, "Sato",39,
"xxx@google.com");
insert into sample_table values(3, "Harada",44,
"xxx@yahoo.co.jp");
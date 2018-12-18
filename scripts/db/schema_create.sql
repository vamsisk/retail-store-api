create database studentdb;

create table student(
    id int,
    user_name varchar(128),
    passport_number varchar(20)
);

insert into studentdb.student values (1, 'John', 'ASK98393');
insert into studentdb.student values (2, 'Rahul', 'DEN12343');

COMMIT;

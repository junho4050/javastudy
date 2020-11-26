create table account(
id varchar2(3) primary key,
balance number

)

insert into account (id,balance) values ('kim',0)
insert into account (id,balance) values ('lee',10000)
commit

select * from account


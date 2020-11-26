create table depart0(
name varchar2(9)

)

alter table depart0 add constraint pk_depart0_name primary key(name)

insert into depart0 values ('����ȣ')
insert into depart0 values ('���Ϲ�')
insert into depart0 values ('�ӿ���')

commit


create table employee0(
age number(3),
address varchar2(9),
name varchar2(9)

)

alter table employee0 add constraint pk_employee0_address primary key(address)

alter table employee0 add constraint fk_employee0_name foreign key(name)
references depart0(name)

insert into employee0 (age,address,name) values (24,'������','����ȣ')
insert into employee0 (age,address,name) values (25,'����','�ӿ���')
insert into employee0 (age,address,name) values (26,'���','���Ϲ�')

insert into employee0 (age,address,name) values (24,'������','ȫ�浿')

commit

select age ����, address �ּ�, name �̸� from employee0

create table class0(
class varchar2(8)
)

alter table class0 add constraint pk_class0_class primary key(class)

insert into class0 values ('1�г�')
insert into class0 values ('2�г�')
insert into class0 values ('3�г�')

commit

create table student0(
class varchar2(8),
num varchar2(6),
name varchar2(9)
)
alter table student0 add constraint pk_student0_name primary key(name)

alter table student0 add constraint fk_student0_class foreign key(class)
references class0(class)

insert into student0 (class,num,name) values ('2�г�','5��','����ȣ')
insert into student0 (class,num,name) values ('1�г�','8��','���Ϲ�')
insert into student0 (class,num,name) values ('3�г�','2��','�ӿ���')

insert into student0 (class,num,name) values ('4�г�','2��','ȫ�浿')

commit

select class �г�,num ��,name �̸� from student0
 









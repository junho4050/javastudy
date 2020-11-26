create table depart0(
name varchar2(9)

)

alter table depart0 add constraint pk_depart0_name primary key(name)

insert into depart0 values ('장준호')
insert into depart0 values ('김하민')
insert into depart0 values ('임영우')

commit


create table employee0(
age number(3),
address varchar2(9),
name varchar2(9)

)

alter table employee0 add constraint pk_employee0_address primary key(address)

alter table employee0 add constraint fk_employee0_name foreign key(name)
references depart0(name)

insert into employee0 (age,address,name) values (24,'의정부','장준호')
insert into employee0 (age,address,name) values (25,'양주','임영우')
insert into employee0 (age,address,name) values (26,'노원','김하민')

insert into employee0 (age,address,name) values (24,'의정부','홍길동')

commit

select age 나이, address 주소, name 이름 from employee0

create table class0(
class varchar2(8)
)

alter table class0 add constraint pk_class0_class primary key(class)

insert into class0 values ('1학년')
insert into class0 values ('2학년')
insert into class0 values ('3학년')

commit

create table student0(
class varchar2(8),
num varchar2(6),
name varchar2(9)
)
alter table student0 add constraint pk_student0_name primary key(name)

alter table student0 add constraint fk_student0_class foreign key(class)
references class0(class)

insert into student0 (class,num,name) values ('2학년','5반','장준호')
insert into student0 (class,num,name) values ('1학년','8반','김하민')
insert into student0 (class,num,name) values ('3학년','2반','임영우')

insert into student0 (class,num,name) values ('4학년','2반','홍길동')

commit

select class 학년,num 반,name 이름 from student0
 









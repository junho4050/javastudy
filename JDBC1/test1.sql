CREATE TABLE test(
name VARCHAR2(3),
age NUMBER(3)
)

insert into test (name, age) values ('kim',20)
insert into test values ('lee',40)
insert into test values ('park',50)
insert into test values ('cho',23)
insert into test values ('kim',33)

commit

commit

test ���̺���
��� ���ڵ���
��� �÷�����
��ȸ�Ͻÿ�.
select * from test

test ���̺���
��� ���ڵ���
name �÷�����
��ȸ�Ͻÿ�.
select name from test

test ���̺���
��� ���ڵ���
name �÷�����
��ȸ�Ͻÿ�.
select age from test

alias
�÷��� ���� �ֱ�

select name as �̸�, age as ���� from test

select name �̸�, age ���� from test

select name as �̸� , age ���� from test

test ���̺� ��ϵ� �� ���� ��� ����Ͻÿ�
select distinct name from test

select * from test order by age asc 

select * from test order by age desc

select * from test1 order by age desc

commit

select * from test order by age desc

delete from test where age = 24

select * from test

select * from test order by age desc

select * from test order by name desc, AGE desc 

select * from test where name = 'kim'

select * from test where name != 'kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')

commit

name�� null�� ���ڵ� ������ ��ȸ�Ͻÿ�
��, �÷��� name�� ����

select * from test

select name �̸�,age ���� from test where name is null

select * from test where name is not null order by age asc ,name desc

test ���̺���
age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�

select * from test where age = 55

select * from test where age != 55

select * from test where age is null

select * from test where age is not null

select * from test where age >= 33

select * from test where age = 20 or age = 23 or age =40

select * from test where age in(20,23,40,43,61,77)

select * from test where age not in (20,23,40,43,61,77)

select * from test where name = 'kim' and age =33

select * from test where age > 25 and age <47

select * from test where age >= 25 and age <= 47

select * from test where age between 25 and 47

select * from test where name like 'k__'

select * from test where name like '_e___'

select * from test where name like '_e_'

select * from test where name like '%o'

select * from test where name like '%��%'

select * from test where name like '%l%'

















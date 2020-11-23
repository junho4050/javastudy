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

test 테이블의
모든 레코드의
모든 컬럼값을
조회하시오.
select * from test

test 테이블의
모든 레코드의
name 컬럼값을
조회하시오.
select name from test

test 테이블의
모든 레코드의
name 컬럼값을
조회하시오.
select age from test

alias
컬럼에 별명 넣기

select name as 이름, age as 나이 from test

select name 이름, age 나이 from test

select name as 이름 , age 나이 from test

test 테이블에 등록된 성 씨를 모두 출력하시오
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

name이 null인 레코드 정보를 조회하시오
단, 컬럼은 name만 있음

select * from test

select name 이름,age 나이 from test where name is null

select * from test where name is not null order by age asc ,name desc

test 테이블에서
age가 55인 레코드를 조회하시오

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

select * from test where name like '%초%'

select * from test where name like '%l%'

















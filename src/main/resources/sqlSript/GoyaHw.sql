Create USER EUGENE IDENTIFIED BY EUGENE;
GRANT CONNECT , RESOURCE TO EUGENE;


create table DEPARTMENT (
      DEPT_ID number(10,0) not null,
      DEPT_NAME varchar2(255 char) not null,
      DEPT_NO varchar2(20 char) not null unique,
      LOCATION varchar2(255 char),
      primary key (DEPT_ID)
  );
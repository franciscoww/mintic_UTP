DROP table DEPT ;
DROP table EMP ;
DROP table SALARIO ;

CREATE TABLE SALARIO (
	ID INTEGER,
	Pago REAL NOT NULL,
	EMP_ID INTEGER,
	CONSTRAINT salario_pk PRIMARY KEY (ID),
	CONSTRAINT emp_fk FOREIGN KEY (emp_id) REFERENCES EMP(ID)
);

create table DEPT (
	ID integer,
	NAME varchar(25),
	constraint dept_pk primary key (ID)
	);

create table EMP (
	ID integer,
	LAST_NAME varchar(25),
	FIRST_NAME varchar(25),
	DEPT_ID integer(7),
	constraint emp_pk primary key (ID),
	constraint dept_fk foreign key (DEPT_ID) references DEPT(ID)
	);

INSERT  into DEPT (NAME) values ('Sistemas');
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Sanchez', 'Francisco', 1);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 1);
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Cabrera', 'Franklin', 1);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 2);
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Lozano', 'Charly', 1);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 3);

INSERT into DEPT (NAME) values ('Comercial');
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Techo', 'Simon', 2);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 4);
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Barbosa', 'Capitan', 2);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 5);
INSERT into EMP (LAST_NAME, FIRST_NAME, DEPT_ID) values ('Light', 'Jack', 2);
INSERT into SALARIO (pago, EMP_ID) values ('1000', 6);

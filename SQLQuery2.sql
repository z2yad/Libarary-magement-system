USE master;

DROP DATABASE Libraryy;

CREATE DATABASE Libraryy;

USE Libraryy;

GO
CREATE TABLE Employee
(
    Employee_id INT IDENTITY(1,1) PRIMARY KEY,
    FName VARCHAR(50) NOT NULL,
    LName VARCHAR(50) NOT NULL,
    SSN VARCHAR(20),
    BDate DATE,
    Address VARCHAR(100),
    Gender CHAR(1),
    PNumber VARCHAR(20)
);
GO

CREATE TABLE Member
(
    Member_id INT IDENTITY(1,1) PRIMARY KEY,
    FName VARCHAR(50) NOT NULL,
    LName VARCHAR(50) NOT NULL,
    SSN VARCHAR(20) unique not null,
    BDate DATE,
    Address VARCHAR(100),
    Gender CHAR(1),
    PNumber VARCHAR(20)
);

CREATE TABLE Publisher
(
    Publisher_id INT IDENTITY(1,1) PRIMARY KEY,
    Publisher_Name VARCHAR(150) NOT NULL,
    Address VARCHAR(100),
    PNumber VARCHAR(20)
);

CREATE TABLE Book
(
    Book_id INT IDENTITY(1,1) PRIMARY KEY,
    Title VARCHAR(200) NOT NULL,
    ISBN VARCHAR(20) UNIQUE,
    Publish_Year date,
     Publisher_id  int

    foreign key (Publisher_id)
    references Publisher(Publisher_id)
);

CREATE TABLE Book_Copies
(
    Copy_ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
    Status VARCHAR(20),
    Book_id INT
    CONSTRAINT FK_Employees_ 
    foreign key (Book_id) references Book(Book_id)
);

CREATE TABLE Loans
(
    Loans_id INT IDENTITY(1,1) PRIMARY KEY,
    Start_Date DATE NOT NULL,
    End_Date DATE NOT NULL,
    Actual_Return_Date DATE NOT NULL,
    Employee_id INT,
    constraint fk_employee_
    foreign key (Employee_id) references Employee(Employee_id),
    Member_id INT,
    foreign key (Member_id) references Member(Member_id)
  
);
CREATE TABLE includes(
    Copy_ID INT,
    Loans_id INT,
    CONSTRAINT pk_includes PRIMARY KEY (Copy_ID, Loans_id),
    CONSTRAINT fk_includes_copy FOREIGN KEY (Copy_ID) REFERENCES Book_Copies(Copy_ID),
    CONSTRAINT fk_includes_loan FOREIGN KEY (Loans_id) REFERENCES Loans(Loans_id)
);

insert into publisher (publisher_name, address, pnumber)
values 
('dar el-shorouk', 'cairo, egypt', '01011112222'),
('o reilly media', 'california, usa', '01033334444'),
('dar el-maaref', 'alexandria, egypt', '01055556666');

insert into member (fname, lname, ssn, bdate, address, gender, pnumber)
values 
('omar', 'adel', '30101012345671', '1999-04-12', 'cairo', 'm', '01122334455'),
('sara', 'hassan', '30205051234562', '2002-09-20', 'giza', 'f', '01233445566'),
('ali', 'mahmoud', '30008081234563', '2000-01-15', 'monfi', 'm', '01544556677');
insert into Employee 
values
('zeyad','salim','306020896','2-7-2006','monfi','m','01032933151'),
('karim','salim','306020594','6-23-2003','cairo','m','01612656468'),
('mohamed','salim','306020493','5-14-2001','cairo','m','01032933151'),
('mohamed','salim','306020491','5-14-2001','cairo','m','01032933151'),
('mohamed','salim','306020497','5-14-2001','giza','m','01032933151'),
('mohamed','salim','306020490','5-14-2001','alex','m','01032933151'),
('mohamed','salim','306040496','5-14-2001','cairo','m','01032933151');
insert into book (title, isbn, publish_year, publisher_id)
values 
('clean code', '978-0132350884', '2008-08-01', 2),
('the pragmatic programmer', '978-0201616224', '1999-10-30', 2),
('introduction to algorithms', '978-0262033848', '2009-07-31', 1),
('ard zikola', '978-9770932001', '2010-01-01', 1);
insert into book_copies (status, book_id)
values 
('available', 1),
('borrowed', 1),
('available', 2),
('borrowed', 2),
('available', 3),
('available', 4);

insert into loans (start_date, end_date, actual_return_date, employee_id, member_id)
values 
('2026-10-01', '2026-10-15', '2026-10-14', 1, 1),
('2026-10-10', '2026-10-24', null, 2, 2),
('2026-10-18', '2026-11-01', null, 1, 3);
insert into includes (copy_id, loans_id)
values 
(2, 1),
(4, 2),
(1, 3)
select *from Employee;
select * from Book;
select * from Book_Copies;
select * from Publisher;
select * from Loans;
select * from Member;

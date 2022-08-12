insert into department values (101, 'finance');
insert into department values (102, 'hr');
insert into department values (103, 'admin');
insert into department values (104, 'it');

insert into employee values (1, 'Max', 101);
insert into employee values (2, 'Tim', 101);
insert into employee values (3, 'James', 101);
insert into employee values (4, 'Frank', 101);
insert into employee values (5, 'John', 102);
insert into employee values (6, 'Mark', 102);


insert into salary values (1,1200);
insert into salary values (2,12000);
insert into salary values (6, 5000);
insert into salary values (5, 4000);
insert into salary values (3, 3000);
insert into salary values (4, 2000);

insert into salaryComponent (employee_id, factor, name, salary_employee_id) values (1, 0.10,'Conveyance allowance',1);
insert into salaryComponent(employee_id, factor, name, salary_employee_id) values (1,0.10, 'Entertainment allowance',3);
insert into salaryComponent(employee_id, factor, name, salary_employee_id) values (1, 0.18,'Bonus',2);
insert into salaryComponent(employee_id, factor, name) values (1, 0.10,'Medical Allowance');
insert into salaryComponent(employee_id, factor, name) values (2, 0.10,'Conveyance allowance');
insert into salaryComponent(employee_id, factor, name) values (2,0.10, 'Entertainment allowance');
insert into salaryComponent(employee_id, factor, name) values (2, 0.18,'Bonus');
insert into salaryComponent(employee_id, factor, name) values (2, 0.1,'Medical Allowance');
insert into salaryComponent(employee_id, factor, name) values (2, 0.15,'Relief fund');
insert into salaryComponent(employee_id, factor, name) values (3, 0.10,'Conveyance allowance');
insert into salaryComponent(employee_id, factor, name) values (3,0.10, 'Entertainment allowance');
insert into salaryComponent(employee_id, factor, name) values (4, 0.18,'Bonus');
insert into salaryComponent(employee_id, factor, name) values (4, 0.10,'Medical Allowance');
insert into salaryComponent(employee_id, factor, name) values (4, 0.15,'Relief fund');
insert into salaryComponent(employee_id, factor, name) values (5, 0.10,'Conveyance allowance');
insert into salaryComponent(employee_id, factor, name) values (5,0.10, 'Entertainment allowance');
insert into salaryComponent(employee_id, factor, name) values (5, 0.18,'Bonus');
insert into salaryComponent(employee_id, factor, name) values (5, 0.10,'Medical Allowance');
insert into salaryComponent(employee_id, factor, name) values (5, 0.15,'Relief fund');
insert into salaryComponent(employee_id, factor, name) values (6, 0.10,'Conveyance allowance');
insert into salaryComponent(employee_id, factor, name) values (6,0.10, 'Entertainment allowance');
insert into salaryComponent(employee_id, factor, name) values (6, 0.18,'Bonus');
insert into salaryComponent(employee_id, factor, name) values (6, 0.1,'Medical Allowance');
insert into salaryComponent(employee_id, factor, name) values (6, 0.15,'Relief fund');
--liquibase formatted sql

--changeset gdiaz:02-09-data-countries

insert  into `COUNTRIES`(`ID`,`NAME`) values (1,'United States of America');
insert  into `COUNTRIES`(`ID`,`NAME`) values (2,'Canada');
insert  into `COUNTRIES`(`ID`,`NAME`) values (3,'China');
insert  into `COUNTRIES`(`ID`,`NAME`) values (4,'India');
insert  into `COUNTRIES`(`ID`,`NAME`) values (5,'Japan');
insert  into `COUNTRIES`(`ID`,`NAME`) values (6,'United Kingdom');

--rollback DELETE FROM COUNTRIES;
--liquibase formatted sql

--changeset gdiaz:02-05-dog-sizes

insert into `DOG_SIZES` (`ID`, `NAME`) values('1','miniature / toy');
insert into `DOG_SIZES` (`ID`, `NAME`) values('2','small');
insert into `DOG_SIZES` (`ID`, `NAME`) values('5','medium');
insert into `DOG_SIZES` (`ID`, `NAME`) values('7','large');
insert into `DOG_SIZES` (`ID`, `NAME`) values('8','extra large');

--rollback DELETE FROM DOG_SIZES;

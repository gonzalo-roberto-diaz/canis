--liquibase formatted sql

--changeset gdiaz:02-06-data-dog-breeds-aux

insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (1,'Hounds','dog_group_hounds','dog_group_hounds.jpg',1,1);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (2,'Companion Dogs','dog_group_companion_dogs','dog_group_companions.jpg',1,2);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (3,'Working Dogs','dog_group_working_dogs','dog_group_working.jpg',1,3);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (4,'Terriers','dog_group_terriers','dog_group_terriers.jpg',1,4);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (5,'Hybrid Dogs','dog_group_hybrid_dogs','dog_group_hybrid.jpg',1,5);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (6,'Sporting Dogs','dog_group_sporting_dogs','dog_group_sporting.jpg',1,6);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (7,'Mixed Breeds','dog_group_mixed_breeds','dog_group_mutts.jpg',1,7);
insert  into `DOG_PURPOSES`(`ID`,`NAME`,`DESCRIPTION`,`PICTURE_URL`,`ENABLED`,`ORDER`) values (8,'Herding Dogs','dog_group_herding_dogs','dog_group_herding.jpg',1,8);


insert  into `DOG_SHEDDING_AMOUNTS`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (1,'very light',2,1);
insert  into `DOG_SHEDDING_AMOUNTS`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (2,'light',3,1);
insert  into `DOG_SHEDDING_AMOUNTS`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (3,'average',4,1);
insert  into `DOG_SHEDDING_AMOUNTS`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (4,'abundant',6,1);
insert  into `DOG_SHEDDING_AMOUNTS`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (5,'blows a coat',9,1);


insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (1,'constantly',80,1);
insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (2,'almost never',2,1);
insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (3,'occasionally',4,1);
insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (4,'twice a year',10,1);
insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (5,'frequently or year-round',20,1);
insert  into `DOG_SHEDDING_FREQUENCIES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (6,'once a year',7,1);


insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (1,'medium',50,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (2,'extra large',70,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (3,'toy',20,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (4,'miniature',10,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (5,'small to medium',40,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (6,'small',30,1);
insert  into `DOG_SIZES`(`ID`,`NAME`,`ORDER`,`ENABLED`) values (7,'large',60,1);

--rollback DELETE FROM DOG_PURPOSES;
--rollback DELETE FROM DOG_SHEDDING_AMOUNTS;
--rollback DELETE FROM DOG_SHEDDING_FREQUENCIES;
--rollback DELETE FROM DOG_SIZES;


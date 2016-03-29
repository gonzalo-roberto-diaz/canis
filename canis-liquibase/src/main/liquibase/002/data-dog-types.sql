--liquibase formatted sql

--changeset gdiaz:data-dog-types

insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (1,'ad9a1abc1810491281131c41221edb36','Sheepdogs and Cattledogs',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (2,'e9dc3bc82db64d0d9618e935a7b37df3','Pinscher and Schnauzer',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (3,'339b6665b05347688792846b9f71230b','Molossers',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (4,'bd7b0c9673de483696dcf6d44daf15c4','Terriers',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (5,'07ce81cc24c94dc0a33ea23c7a9c057e','Dachshunds',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (6,'881e5e38737e4f92adf51adcb3a744f6','Spitz and primitive types',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (7,'8165042acdba4b0ba2e5fced5c32446a','Scent hounds and related breeds',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (8,'968af64e1e7049719122ea428e16193d','Pointing Dogs',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (9,'d546448755e0493c8f0bc6e85466ab60','Retrievers, Flushing and Water Dogs',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (10,'fcb8a322687e407b9d2082e0335f71d0','Companion and Toy Dogs',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (11,'597e474cc72d47029722d4cef2186df0','Sighthounds',1,NULL);
insert  into `DOG_TYPES`(`ID`,`GUID`,`NAME`,`LEVEL`,`PARENT`) values (12,'e024d0fd9b1e4528ba125f7a8996f105','Swiss Mountain and Cattle Dogs',1,NULL);

--rollback DELETE DOG_TYPES;
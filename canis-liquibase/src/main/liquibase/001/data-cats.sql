--liquibase formatted sql

--changeset gdiaz:cats

insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (1,'014507ba8f136566089557f4d98754b3','medium',50,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (2,'37006ab7e89a78592b442460abbc93d7','extra large',70,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (3,'8d664771a2507b07bc6b32aa9aadec36','toy',20,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (4,'b0461433039f33146cfda8229997e5f5','miniature',10,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (5,'e9b6b699b2070e293639994746aba3b7','small to medium',40,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (6,'ec7026b52e43ca9ba04569cf52e3b347','small',30,1);
insert  into `CAT_SIZES`(`ID`,`GUID`,`CAT_SIZE_NAME`,`ORDEN`,`HABILITADA`) values (7,'fe79061e8370cdb17d71ae5b3f56ae9a','large',60,1);

insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (1,'ab46bf1d4322ec898561744cdfaeb58b','Abyssinian\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (2,'c2c767ed36aeed87e64be5e1172f50c6','Aegean\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (3,'dcaf2151a11e6dc3c34ab47ccb8578b6','American Bobtail\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (4,'f363f74f3e621255252ebef36d185719','American Curl\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (5,'53b44ab98a8f347db7b4df4f470064a1','American Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (6,'b0fe3147cbc94acac04db609420d5345','American Wirehair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (7,'780c20a153427aa6d0c5463e14ef4243','Arabian Mau\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (8,'0178807b72855ce29b40c63691a3b181','Asian\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (9,'5abf10af6c1d4b6c7cd589867f70c8e5','Asian Semi-longhair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (10,'17943202703dd119a3af439a906fd572','Australian Mist\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (11,'38d4918d9a8472921d8d6c8765fcb4a4','Balinese\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (12,'f3a2eb78c4cfd2759ffe7a674e2b2b1c','Bambino\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (13,'fd8307677dde4251ad2920728ea92440','Bengal\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (14,'07f2321ecd47f8dbfac6283dd9e62c39','Birman\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (15,'d6826b57a442a30ca11dc38d4ad0df19','Bombay\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (16,'103a7176f597a220d1b261cb504d9c7c','Brazilian Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (17,'d8c2800ade1364531734735a9dad1246','British Longhair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (18,'ff1401d6b199e5369fb2a535a6900b41','British Semi-longhair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (19,'362b036f4b4538678ab42aa285558fe8','British Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (20,'b134de5896752f09ffdf49498f0377f1','Burmese\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (21,'ab812c9aee6359ed2691b12c02f43e49','Burmilla\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (22,'4d6fede5b90058f7970e9b17de3961d1','California Spangled\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (23,'b90c0daa8f896fc61d3f7defcb328f58','Chantilly-Tiffany\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (24,'fd79e2e7d9f5644b960b8d902149b953','Chartreux\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (25,'ddbf8dcdddd42562492ce271491244c5','Chausie\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (26,'f6827cb35df0872a94ae2f1b8c0478ec','Cheetoh\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (27,'3c68ab34a97536dac6900b4278387d53','Colorpoint Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (28,'e1bc0bcee18696454d903bf43b056bc0','Colorpoint Shorthair (Himalayan)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (29,'bebf6da938db87dd362f974057b5ab78','Cornish Rex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (30,'c9ee8ef5bc279bd48c0f7dce88e2c5e6','Cymric (Manx Longhair)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (31,'d608a84bd8aff97eac2f3cec5a250c93','Cyprus\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (32,'33adc55a3d0e7ffc8066ec4a9ad953cb','Devon Rex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (33,'c46cb3487fbf3ea6001459a909470d06','Doll Face Persian (Traditional Persian)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (34,'1cbc8b3b52fd5fdf7c187b6e5c56725f','Don Sphynx (Donskoy)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (35,'980a054556a695d52d896dcbb1c94a1b','Donskoy (Don Sphynx)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (36,'536c66faf35ad276508644412da74d26','Dragon Li\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (37,'47b4068b20b07fa4a722c568a14cf1de','Dwarf cat (Dwelf)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (38,'82791dbe31e5f847a4f03139985feaa3','Dwelf (Dwarf cat)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (39,'c560b3d55ebfb24257f293b752290cf4','Egyptian Mau\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (40,'ecc9fc848ee37c57b5e2f9d503122a2c','European Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (41,'a687a8c080db48e8897e2d304fee3dc0','Exotic ShortHair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (42,'00941c97fe3d5126c2930061026fc0e4','Foldex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (43,'3643da711edc616ef7596214ae61887c','German Rex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (44,'6ca5950ebacb3d80a34e3e7ee7a2704f','Havana Brown\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (45,'34edd45b82656f4b36410a4e7f5cf3eb','Highlander\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (46,'acf66844cfffb0a845c830e479f9ab07','Himalayan (Colorpoint Persian)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (47,'472185ae69befeb2b2837b02b749329b','Japanese Bobtail\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (48,'5f195bc9b458f0dc6e6a0f4405744e82','Javanese\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (49,'1dc19a31c35aa10510811fef19643e98','Khao Manee\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (50,'03f81110b5bedd78ff0eea05150ebd23','Korat\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (51,'f6cbad6fdd2f72cb568295cedabca992','Korean Bobtail\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (52,'35518bf9d3aa95ecf485e9e18acfaa29','Korn Ja\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (53,'e52cad28b09c301b9d09cc3e334f540f','Kuril Islands Bobtail (Kurilian Bobtail)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (54,'9d51e956a067daa488c3563ccb0aec47','Kurilian Bobtail\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (55,'3fe78df4becaa94e1329cf0786a6a48f','Kurilian Bobtail (Kuril Islands Bobtail)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (56,'4e1fefb19acddb13a5a5b062e73f23b2','LaPerm\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (57,'90651f6f58ed1c4086e7744b03d7d9fd','Lykoi\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (58,'4ce8a630323942dbcd9cf210178e2792','Maine Coon\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (59,'70daa6fa29ec44785830cd0edf013459','Manx\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (60,'c8a68c7458c1e31c76814d21d2c4925e','Manx Longhair (Cymric)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (61,'970b8dd6f7cbb954b8679b4eaf71fa05','Mekong Bobtail\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (62,'d369437e999a10f956fe96482d8b2848','Minskin\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (63,'c2e8c00b40c282b1b6b2abffe57a4a5f','Munchkin\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (64,'8bf529c69efefcf3de7cc471be4bae14','Napoleon\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (65,'fb65a5ed3fb9bcfcca781f055ae050e4','Nebelung\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (66,'b05c2ac598dae66ddc1cb276c0de55fa','Norwegian Forest Cat\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (67,'2d9fdf0184eaa4ba00e69a605cc3df90','Ocicat\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (68,'11fe4d2d218d2d4d7ba438455f9369f9','Ojos Azules\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (69,'ef511c93f207341923f5eabf721e9d91','Oregon Rex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (70,'b28b552b9660f6616545ba29313238c7','Oriental Bicolor\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (71,'c57d024a664973dc1648d403f2071155','Oriental Longhair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (72,'2b98f7591964f9f862e2b82ea38da124','Oriental Shorthair\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (73,'a54553c58a1d77858ea54d9b70504a0d','Perfold\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (74,'d8f8f3a321ab732476b2a5d2052b77ea','Persian (Modern Persian Cat)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (75,'c81e1c1a9e90751d484c60c8c56979ae','Peterbald\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (76,'b5185034df9e88d63e74eebbac07d620','Pixie-bob\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (77,'ed51c4ab666d53b7d2fade614a35debc','Raas\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (78,'858873c3e00958a64e48073e44408333','Ragamuffin\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (79,'e4fc389737eecd889c030997cbb3cdd6','Ragdoll\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (80,'9c5522029effe9076b686e2d10842c90','Russian Blue\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (81,'15058e12c3bd9f75028e9fd3785cd181','Russian White, Black and Tabby\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (82,'637a6230e33c8b4ae992038bd34fb6cf','Sam Sawet\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (83,'f7802fd363adbed56ee59a7e63527b04','Savannah\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (84,'f7f5d13de73e086cebf10e54a7c1d7a6','Scottish Fold\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (85,'7e4eb189895009af1b3381f34fa7f15b','Selkirk Rex\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (86,'c11bd93ca936f09d8eacc855d9bfc96b','Serengeti\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (87,'08a833a9eba913fa94ea46698c2ac920','Serrade petit\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (88,'64b5ab2cf8973bbda5d9715690f7d719','Siamese\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (89,'bcfb8a2f9b9bb445f6e75dd7884c886b','Siberian\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (90,'d69d8c59feabf4aead3f32432a0232b5','Singapura\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (91,'154218a9e6933cab4dfd84c240e3fd15','Snowshoe\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (92,'5982f6d2ffc0386f91ed3180339ccccc','Sokoke\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (93,'835b050d7709cd4a112b08c051200ef6','Somali\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (94,'b7af99bba7f60286dae0ff4a41b7d511','Sphynx\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (95,'27369d62870ab351211b134caa6fe1a5','Thai\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (96,'f0be49a7f149318fc6e1353d36f6ad90','Tonkinese\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (97,'b590973dd1016a8d728410f974525933','Toyger\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (98,'c821c92dee3708c97d243cfcca9430b8','Traditional Persian (Doll Face Persian)\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (99,'22f961dda339611f3f38a86c2152dd47','Turkish Angora\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (100,'84f14ca7c5488c0232490e971e06d073','Turkish Van\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (101,'990ee861caddcf763ea40602c6c705dc','Ukrainian Levkoy\r\n');
insert  into `CAT_BREEDS`(`ID`,`GUID`,`CAT_BREED_NAME`) values (102,'03d8be60fd7d70deb4a38272ae2fd8a1','York Chocolate');

--rollback DELETE CAT_BREEDS;
--rollback DELETE CAT_SIZES;
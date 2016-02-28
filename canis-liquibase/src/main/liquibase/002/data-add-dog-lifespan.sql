--liquibase formatted sql

--changeset gdiaz:data-add-dog-lifespan

UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=1;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=2;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=3;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=4;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=11, LIFESPAN_MAX=12 WHERE ID=5; --A E Coonhound
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=6; --A Esquimo
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=7;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=8;
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=9; --A W Spaniel
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=10; --Anat sh dog
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=11; --Austr Shep
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=12; --Austr Terr
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=13; --Basenji
UPDATE DOG_BREEDS SET LIFESPAN_MIN=11, LIFESPAN_MAX=14 WHERE ID=14; --Basset
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=15; --Beagle
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=16; --Bearded
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=17; --Beauceron
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=18; --Bedlington
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=19; --Belgian
UPDATE DOG_BREEDS SET LIFESPAN_MIN=6,  LIFESPAN_MAX=9 WHERE ID=20; --Burmese
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=21; --Bichon
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=22; --Blood
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=14 WHERE ID=23; --Border
UPDATE DOG_BREEDS SET LIFESPAN_MIN=7, LIFESPAN_MAX=10 WHERE ID=24; --Borzoi
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=15 WHERE ID=25; --Boston
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=26; --Boxer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=27; --Briard
UPDATE DOG_BREEDS SET LIFESPAN_MIN=14, LIFESPAN_MAX=15 WHERE ID=28; --Brittany
UPDATE DOG_BREEDS SET LIFESPAN_MIN=11, LIFESPAN_MAX=14 WHERE ID=29; --Bull Terrier
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=30; --Bulldog
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=31; --Bullmastiff
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=32; --C W Corgi
UPDATE DOG_BREEDS SET LIFESPAN_MIN=9, LIFESPAN_MAX=14 WHERE ID=33; --CKC
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=18 WHERE ID=34; --Chihuahua
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=15 WHERE ID=35; --Chin crested
UPDATE DOG_BREEDS SET LIFESPAN_MIN=9, LIFESPAN_MAX=11 WHERE ID=36; --Chin shar-pei
UPDATE DOG_BREEDS SET LIFESPAN_MIN=14, LIFESPAN_MAX=17 WHERE ID=37; --Dachsu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=38; --Dalmatian
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=39; --Dandie
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=13 WHERE ID=40; --Doberman Pin
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=41; --Doge Border
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=42; --English co
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=43; --Doge Border
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=44; --Eng set
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=45; --Eng toy
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=46; --Field span
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=47; --French Bull
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=48; --German pin
UPDATE DOG_BREEDS SET LIFESPAN_MIN=9, LIFESPAN_MAX=13 WHERE ID=49; --Germ shep
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=50; --German short
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=51; --German wire
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=52; --Giant Scha
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=53; --Golden retriever
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=54; --Gordon setter
UPDATE DOG_BREEDS SET LIFESPAN_MIN=6, LIFESPAN_MAX=8 WHERE ID=55; --Great dane
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=56; --Great Pyrenees
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=11 WHERE ID=57; --Greater swiss
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=58; --Jap chin
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=15 WHERE ID=59; --Keeshond
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=60; --Komon
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=61; --Kuva
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=62; --Lab retriever
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=9 WHERE ID=63; --Leonb
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=64; --Lhasa
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=65; --Maltese
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=66; --Min Pinscher
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=67; --Min Schnauzer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=68; --Mucu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=69; --Neap
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=70; --Newfou
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=71; --Old eng
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=15 WHERE ID=72; --Papi
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=16 WHERE ID=73; --Jack Ru
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=74; --Peking
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=75; --Pembro
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=76; --Pointer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=16 WHERE ID=77; --Pomer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=78; --Poodle
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=79; --Portu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=16 WHERE ID=80; --Puli
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=81; --Rhodesian
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=82; --Rottwe
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=10 WHERE ID=83; --Saint ber
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=84; --Saluki
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=13 WHERE ID=85; --Samoyed
UPDATE DOG_BREEDS SET LIFESPAN_MIN=8, LIFESPAN_MAX=11 WHERE ID=86; --Scottish deer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=87; --Scottish terrier
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=88; --Shiba Inu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=16 WHERE ID=89; --Shin tzu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=90; --Siberian husky
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=91; --Silky terrier
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=92; --Skye
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=14 WHERE ID=93; --Staffordhi
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=16 WHERE ID=94; --Standard Schnauzer
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=95; --Tibetan Mastiff
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=96; --Tosa Inu
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=14 WHERE ID=97; --Toy fox terrier
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=98; --Viszla
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=99; --Weimaraner
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=100; --Welsh
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=16 WHERE ID=101; --West Highland
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=102; --Whippet
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=14 WHERE ID=103; --Wire fox terrier
UPDATE DOG_BREEDS SET LIFESPAN_MIN=10, LIFESPAN_MAX=12 WHERE ID=104; --Wirehaired Pointing
UPDATE DOG_BREEDS SET LIFESPAN_MIN=12, LIFESPAN_MAX=15 WHERE ID=105; --Wirehaired Viszla
UPDATE DOG_BREEDS SET LIFESPAN_MIN=13, LIFESPAN_MAX=16 WHERE ID=106; --Yorkshire Terrier

--rollback UPDATE DOG_BREEDS SET LIFESPAN_MIN = NULL, LIFESPAN_MAX = NULL; 

















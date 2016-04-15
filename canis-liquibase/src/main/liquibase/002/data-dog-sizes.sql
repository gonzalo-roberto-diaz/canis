--liquibase formatted sql

--changeset gdiaz:02-05-dog-sizes

INSERT INTO `DOG_SIZES` (`ID`, `NAME`)
VALUES
	(1,'miniature / toy'),
	(2,'small'),
	(5,'medium'),
	(7,'large'),
	(8,'extra large'),
	(9,'giant');

--rollback DELETE FROM DOG_SIZES;

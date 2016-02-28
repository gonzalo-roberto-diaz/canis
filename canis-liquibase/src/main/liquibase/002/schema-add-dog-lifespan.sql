--liquibase formatted sql

--changeset gdiaz:schema-add-dog-lifespan

ALTER TABLE DOG_BREEDS ADD LIFESPAN_MIN SMALLINT;
ALTER TABLE DOG_BREEDS ADD LIFESPAN_MAX SMALLINT;

--rollback ALTER TABLE DOG_BREEDS DROP COLUMN LIFESPAN_MIN;
--rollback ALTER TABLE DOG_BREEDS DROP COLUMN LIFESPAN_MAX;
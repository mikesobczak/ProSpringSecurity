INSERT INTO USERS VALUES('car','scarvarez',true);
INSERT INTO USERS VALUES('admin','admin',true);
INSERT INTO USERS VALUES('mike','password',true);

INSERT INTO AUTHORITIES VALUES('car','ROLE_SCARVAREZ_MEMBER');
INSERT INTO AUTHORITIES VALUES('admin','ROLE_SCARVAREZ_MEMBER');
INSERT INTO AUTHORITIES VALUES('mike','ROLE_SCARVAREZ_MEMBER');

COMMIT;
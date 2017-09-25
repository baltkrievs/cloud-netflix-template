CREATE TABLE USERS (
  id              INTEGER PRIMARY KEY,
  username        VARCHAR(30),
  password        VARCHAR(30),
  passwordConfrim VARCHAR(30),
  email           VARCHAR(50)
);

CREATE TABLE ROLES (
  id   INTEGER PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE USER_ROLE (
  idUser INTEGER,
  idRole INTEGER
);
drop table if exists message
CREATE TABLE message (
  NAME varchar(45) DEFAULT NULL,
  GIT varchar(45) DEFAULT NULL,
  TIMESTAMP bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

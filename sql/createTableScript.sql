  CREATE  TABLE user (
  user_id int NOT NULL AUTO_INCREMENT,
  create_date DATE NULL,
  userName VARCHAR(80) NOT NULL,
  password VARCHAR(80) NOT NULL,
  oauthToken VARCHAR(120) NULL,
  oauthSecret VARCHAR(120) NULL,
  displayName VARCHAR(120) NULL,
  PRIMARY KEY (user_id));
  CREATE  TABLE user (
  user_id int NOT NULL AUTO_INCREMENT,
  create_date DATE NULL,
  userName VARCHAR(80) NOT NULL,
  password VARCHAR(80) NOT NULL,
  oauthToken VARCHAR(120) NULL,
  oauthSecret VARCHAR(120) NULL,
  displayName VARCHAR(120) NULL,
  PRIMARY KEY (user_id));
  
  
  CREATE  TABLE menu (
  menu_id int NOT NULL AUTO_INCREMENT,
  create_date DATE NULL,
  menuName VARCHAR(80) NOT NULL,
  resturant VARCHAR(80) NULL,
  menuType VARCHAR(120) NULL,
  PRIMARY KEY (menu_id));
  
 CREATE  TABLE menu_item (
  menu_item_id int NOT NULL AUTO_INCREMENT,
  create_date DATE NULL,
  menu_id int NOT NULL,
  menuItemName VARCHAR(80) NOT NULL,
  menuItemImageURL VARCHAR(260) NULL,
  menuItemDesc VARCHAR(260) NULL,
  menuItemSpicyLevel VARCHAR(80) NULL,
  menuItemPrice FLOAT NULL,
  menuItemCalories int NULL,
  PRIMARY KEY (menu_item_id),
  FOREIGN KEY (menu_id) REFERENCES menu(menu_id));
  
  
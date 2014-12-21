CREATE DATABASE bhim CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE DATABASE bhim_test CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'bhim_u'@'%' IDENTIFIED by 'bhim_p@$sw0rD';
GRANT ALL PRIVILEGES ON bhim.* TO 'bhim_u'@'%' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON bhim_test.* TO 'bhim_u'@'%' WITH GRANT OPTION;
CREATE USER 'bhim_u'@'localhost' IDENTIFIED by 'bhim_p@$sw0rD';
GRANT ALL PRIVILEGES ON bhim.* TO 'bhim_u'@'localhost' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON bhim_test.* TO 'bhim_u'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
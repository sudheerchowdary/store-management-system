CREATE TABLE stores (
  id int(11) NOT NULL,
  type varchar(100) NOT NULL,
  name varchar(100) NOT NULL,
  address varchar(100) NOT NULL,
  address2 varchar(100),
  city varchar(100) NOT NULL,
  state varchar(100) NOT NULL,
  zip varchar(100) NOT NULL,
  location longtext NOT NULL,
  hours longtext NOT NULL,
  services longtext NOT NULL,
  PRIMARY KEY (id));

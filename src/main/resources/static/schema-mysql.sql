CREATE TABLE user (
  id			INT PRIMARY KEY AUTO_INCREMENT,
  email			VARCHAR(250) NOT NULL,
  password		VARCHAR(250) NOT NULL,
  created_at	date NOT NULL,
  updated_at		date NOT NULL
  );
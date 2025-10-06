USE demo_db;

CREATE TABLE IF NOT EXISTS advertisement (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  heading VARCHAR(100),
  category VARCHAR(100),
  description VARCHAR(255),
  image_url VARCHAR(255)
);

INSERT INTO advertisement(heading, category, description, image_url)
VALUES ('mit', 'mit', 'hello', 'img.jpg');
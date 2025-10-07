USE demo_db;

CREATE TABLE IF NOT EXISTS advertisement (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  heading VARCHAR(100),
  category VARCHAR(100),
  description VARCHAR(255),
  image_url VARCHAR(255)
);

INSERT INTO advertisement(heading, category, description, image_url)
VALUES 
('MIT', 'Anna University', 'Madras Institute of Technology, a constituent college of Anna University, known for its excellence in engineering and innovation.', 'img.jpg'),

('CEG', 'Anna University', 'College of Engineering, Guindy — one of the oldest and most prestigious engineering colleges in India, offering top-tier technical education.', 'ceg.jpg'),

('ACT', 'Anna University', 'Alagappa College of Technology, specializing in cutting-edge programs in technology, biotechnology, and applied sciences.', 'act.jpg'),

('SAP', 'Anna University', 'School of Architecture and Planning, renowned for its creative architecture programs and modern design innovations.', 'sap.jpg');

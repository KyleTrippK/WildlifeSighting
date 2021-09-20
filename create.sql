-- CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE endangered_animals(id SERIAL PRIMARY KEY, name VARCHAR, health VARCHAR, age VARCHAR, ranger VARCHAR, location VARCHAR);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
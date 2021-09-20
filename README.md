# Wildlife Sighting

Wildlife Sighting is an app that allows a ranger to report and save sightings of wildlife in a forest that is set to be cleared. The wildlife sighted can either be endangered or not endangered. For the non-endangered animals, the user inputs the animal name, the location it was sighted and the ranger's name while for the endangered, the ranger inputs the animal name, age, health, location and the ranger's name. That done, the ranger can view the sightings that have been made.

## Author
- [Kibet Kyle](https://github.com/KyleTrippK)

## Setup/Installation Requirements
* Fork this project
* Clone this project
* Open terminal
* Navigate to appropriate directory in the CMD using the cd command.
* type in the command git clone and paste the url of clone to clone the project.
## Setup Requirements for Database
* In PSQL:
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker 
* CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar,health VARCHAR,age VARCHAR, location VARCHAR, ranger VARCHAR);
* CREATE TABLE non_endangered_animals (id serial PRIMARY KEY,name VARCHAR,  location VARCHAR, ranger VARCHAR);
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
## In order to run locally
* Go to DaoClass.class in main/java folder and make necessary changes

## Technologies Used
* Java Spark
* Heroku
* CSS
* HandleBars

## Support and contact details
For any suggestions or errors encountered, reach me at: kyletrippk.com

### License
*This project is licensed under the terms of the [MIT Licence](./Licence).*
Copyright (c) 2020 **Kyle Kibet**

### Image
*[Landing Page](public/images/landing-page.png)
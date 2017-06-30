# school-registration-system

This is a project that implements a registration system for schools.

Schools can add courses offered and students to the database through the welcome page.
Then we can register a student for a particular course.

Through the welcome page, we can see a list of courses that a student is enrolled in.
Additionally, we can see a list of students that are enrolled in a particular course.

The SQL tables are created using the script in: 
WebContent/resources/createTables.sql

The project is implemented using Spring MVC and hibernate.

A student controller recieves all incoming HTTP requests and delegates the functions to a service called StudentRegistrationService.

This service interacts with various DAOs to create/read/update/delete data from the database

The DAOs use hibernate libraries to talk to the mysql database in the backend.

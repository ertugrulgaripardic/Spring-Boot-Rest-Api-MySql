# Spring Boot REST API with MySQL

This project is a simple REST API built using Spring Boot, connected to a MySQL database. The API allows users to perform CRUD operations on a set of resources

## Features

- Spring Boot frameworks
- MySQL database integration tools
- Spring security

Before running this project, ensure you have the following installed
- Java 11 or higher
- Maven
- MySQL
- An IDE (like IntelliJ IDEA or Eclipse)

## Getting Started
1. Clone this repository:
    ```
    git clone https://github.com/ertugrulgaripardic/Spring-Boot-Rest-Api-MySql.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Spring-Boot-Rest-Api-MySql
    ```..
3. Set up MySQL database:
    - Create a new MySQL database.
    - Update the `application.properties` file with your MySQL database credentials.
      
4. Build and run the project:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
5. Access the API at:
    ```
    http://localhost:8080/api/v1/resources
    ```
    
## API Endpoints
- `GET /api/v1/resources` - Fetch all resources
- `GET /api/v1/resources/{id}` - Fetch a single resource by ID
- `POST /api/v1/resources` - Create a new resource
- `PUT /api/v1/resources/{id}` - Update an existing resource
- `DELETE /api/v1/resources/{id}` - Delete a resource by ID

## Technologies Used Here
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- Maven

## License
This project is licensed under the MIT License

## Contributing
Feel free to submit a pull request if you'd like to contribute to this project.

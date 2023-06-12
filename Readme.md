# Solent Tour Management

This project is a Spring Boot application for managing Solent tours. It provides RESTful APIs for creating, updating, and retrieving tour information.

# Setup

1. Clone the repository: `git clone https://github.com/Solent-Team/tour_system_solent_backend.git`
2. Install dependencies: `cd solent-tour-management` then `mvn clean install`


# Database Configuration
The application is configured to use MySQL as the database. Before running the application, make sure you have MySQL installed and create a database named `solent_tour`. Modify the following properties in the `application.properties` file located in the `src/main/resources` directory to match your MySQL configuration:

```agsl
spring.datasource.url=jdbc:mysql://localhost:3306/solent_tour
spring.datasource.username=root
spring.datasource.password=password
```

# Running the Application
To run the application, execute the following command: `mvn spring-boot:run`

The application will start and listen on port 8081.

# Testing the APIs
You can use tools like Postman or cURL to test the RESTful APIs provided by the application. Here are some sample endpoints:

- Post a booking http://localhost:8081/booking
- GET a booking: http://localhost:8081/bookingdetails
- GET a specific booking: http://localhost:8081/bookingdetails/{id}
- PUT a booking: http://localhost:8081/bookingdetailsupdate/{id}
- DELETE a booking: http://localhost:8081/deletebooking/{id}

## hotels 
- Post a hotel http://localhost:8081/hotelpost
- GET a hotel: http://localhost:8081/hotelget
- GET a specific hotel: http://localhost:8081/hotelget/{id}
- PUT a hotel: http://localhost:8081/hotelget/{id}
- DELETE a hotel: http://localhost:8081/hotelget/{id}
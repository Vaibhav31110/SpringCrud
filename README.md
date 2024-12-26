# Student Management API

This project is a Spring Boot application that provides a REST API for managing student records. It includes functionality for creating, retrieving, and updating student information.

## Features

- Create a student record
- Retrieve a student record by ID
- Update a student record

## Technologies Used

- **Java**: Backend programming language
- **Spring Boot**: Framework for creating the REST API
- **Jakarta Persistence API (JPA)**: For entity mapping
- **Postman**: API testing

## Prerequisites

- **Java Development Kit (JDK)**: Version 17 or later
- **Maven**: For dependency management
- **Postman**: For API testing (optional)
- **Spring Boot**: Installed via Maven dependencies

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd student-management-api
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the API at `http://localhost:8050/studentdeatails`.

5. Access the H2 Console at `http://localhost:8050/h2-console`.

## API Endpoints

### Create a Student
- **Method**: `POST`
- **URL**: `/api/studentsave`
- **Request Body**:
  ```json
  {
    "id": 1,
    "sname": "John Doe",
    "dept": "Computer Science"
  }
  ```
- **Response**:
  - **201 Created**: Student created successfully.
  - **409 Conflict**: Student ID already exists.

### Retrieve a Student
- **Method**: `GET`
- **URL**: `/api/studentdetails/{id}`
- **Response**:
  - **200 OK**: Returns the student details.
  - **404 Not Found**: Student not found.

### Update a Student
- **Method**: `PUT`
- **URL**: `/api/studentupdate/{id}`
- **Request Body**:
  ```json
  {
    "sname": "Jane Doe",
    "dept": "Electrical Engineering"
  }
  ```
- **Response**:
  - **200 OK**: Student updated successfully.
  - **404 Not Found**: Student not found.

## Testing the API

Use Postman or a similar tool to test the API endpoints:

1. **POST**: Create a new student record by sending a JSON body.
2. **GET**: Retrieve a student record by replacing `{id}` with the Student ID.
3. **PUT**: Update an existing student record by providing the Student ID and new details in the JSON body.

## Entity Structure

### Student
```java
@Entity
public class Student {

    @Id
    private int id;

    @Column(name = "sname")
    private String sname;

    @Column(name = "dept")
    private String dept;

    // Constructors, getters, setters, and toString method
}
```

## Future Enhancements

- Add database integration using Spring Data JPA.
- Implement DELETE endpoint to remove a student record.
- Add authentication and authorization.
- Provide pagination and sorting for retrieving student records.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For questions or support, please contact:
- **Developer**: Vaibhav D Vaishnav
- **Email**: Vaibhavvaishnav2412@gmail.com

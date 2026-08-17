# Spring Boot Demo

A collection of Spring Boot projects created while learning and practicing Java backend development.

## Projects

| Project | Description | Main Topics |
|---|---|---|
| `SpringDemo1` | Basic Spring Boot application and backend fundamentals | Spring Boot, REST, JPA, PostgreSQL |
| `CrudDemo` | CRUD-based Spring Boot application | REST API, Spring Data JPA, PostgreSQL |
| `CrudPrac` | CRUD practice project with request validation | REST API, JPA, PostgreSQL, Validation |
| `SprinSecurityDemo` | Spring Security practice project | Spring Security, Web, Authentication basics |

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring MVC / REST API**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Spring Validation**
- **Spring Security**
- **Maven**

## Getting Started

### Prerequisites

Make sure the following are installed:

- Java JDK 17 or higher
- Maven
- PostgreSQL
- IntelliJ IDEA or another Java IDE

### Run a Project

1. Clone the repository:

```bash
git clone https://github.com/vipinpra09/springboot-demo.git
```

2. Open the repository in your IDE.

3. Enter one of the project directories, for example:

```bash
cd SpringDemo1
```

4. Build the project:

```bash
mvn clean install
```

5. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

You can also run the main application class directly from IntelliJ IDEA.

## Database Configuration

The CRUD projects use PostgreSQL. Before running them, configure the database connection in the project's `application.properties` or `application.yml` file.

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Do not commit real database passwords or other secrets to the repository.

## Learning Progress

This repository documents my progression in Java backend development, including:

- Spring Boot fundamentals
- REST API development
- Controller and Service layers
- Spring Data JPA
- Hibernate and database integration
- CRUD operations
- DTOs and validation
- Exception handling
- Spring Security
- PostgreSQL integration

## Repository Structure

```text
springboot-demo/
├── CrudDemo/
├── CrudPrac/
├── SprinSecurityDemo/
├── SpringDemo1/
└── README.md
```

## Author

**Vipin Prajapati**

- GitHub: [@vipinpra09](https://github.com/vipinpra09)

---

This repository is primarily for learning, experimentation, and building practical Java Spring Boot backend skills.
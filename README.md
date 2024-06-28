# SMS (Student Management System) Setup Guide

This guide will help you set up a basic Student Management System (SMS) using Spring Boot with MySQL.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven
- MySQL Server
- IDE (Eclipse, IntelliJ IDEA, or your preferred IDE)

## Step-by-Step Setup Instructions

### Step 1: Open Spring Tool Suite (STS)

Open your Spring Tool Suite (STS) IDE.

### Step 2: Create a Spring Starter Project

1. Click on `File` -> `New` -> `Spring Starter Project`.
2. Enter `SMS` as the **Name** of the project.
3. Set `com.example.sms` as the **Group**.
4. Choose `Maven` as the **Build**.
5. Set the **Packaging** to `Jar`.
6. Set the **Java Version** to `8` or higher.
7. Click `Next`.

### Step 3: Add Dependencies

1. In the **Dependencies** section, add the following dependencies:
   - `Spring Web`
   - `Spring Data JPA`
   - `Spring Boot DevTools`
   - `MySQL Driver`

   These dependencies will enable web development, data persistence with JPA, automatic restarts, and MySQL database connectivity.

2. Click `Next` and then `Finish`.

### Step 4: Configure MySQL Database

1. Open `src/main/resources/application.properties`.
2. Configure MySQL connection properties:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/****your_db_name****
   spring.datasource.username=****your_username****
   spring.datasource.password=****your_password****
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   spring.jpa.hibernate.ddl-auto=update
Adjust spring.datasource.url, spring.datasource.username, and spring.datasource.password according to your MySQL setup.

### Step 5: Create the Student Entity
Create a Student entity class in `com.example.sms.entity`. Define fields like `id`, `name`, and `email`.

### Step 6: Create Repository Interface
Create a StudentRepository interface in `com.example.sms.repository`. This interface extends `JpaRepository<Student, Long>` to handle CRUD operations for Student entities.

### Step 7: Create RESTful Controller
Create a StudentController class in com.example.sms.controller. Define REST endpoints (GET, POST, PUT, DELETE) to manage Student entities using StudentRepository.

### Step 8: Run the Application
Right-click on the project.
Select Run As -> Spring Boot App.
The application will start at http://localhost:8080.

### Step 9: Execute the CRUD.

### Step 10: Push to GitHub
Initialize a Git repository in your project if not already done.
Create a .gitignore file to exclude IDE files and target directory.
Commit your changes and push to your GitHub repository.







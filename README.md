# JWT Authentication using Spring Boot

## Project Details

**Name:** 23BAI70665-exp6-Prashant
**Technology:** Spring Boot, Spring Security, JWT, Maven
**Tool Used:** Postman
**Language:** Java

---

# Objective

To implement **JWT (JSON Web Token) Authentication** in a Spring Boot backend application.
The system authenticates users, generates a JWT token for valid login requests, and secures API routes using authentication.

---

# Technologies Used

* Java
* Spring Boot
* Spring Security
* JSON Web Token (JWT)
* Maven
* Postman

---

# Project Structure

```
src
 └─ main
     └─ java
         └─ com.jwt.jwtauth
             ├── controllers
             │     AuthController.java
             ├── utils
             │     JwtUtil.java
             ├── config
             │     SecurityConfig.java
             └── JwtauthApplication.java
```

---

# API Endpoints

## 1. Login API

**Method:** POST
**URL:**

```
http://localhost:8080/login
```

**Request Body**

```json
{
 "username": "user123",
 "password": "password123"
}
```

**Response**

```json
{
 "token": "eyJhbGciOiJIUzI1NiIs..."
}
```

---

## 2. Protected Route

**Method:** GET

```
http://localhost:8080/protected
```

**Response**

```
JWT Authentication successful!
```

---

# Steps to Run the Project

1. Clone the repository

```
git clone https://github.com/prashantxb/23BAI70665-exp6-Prashant.git
```

2. Open the project in VS Code.

3. Install dependencies using Maven

```
mvn clean install
```

4. Run the application

```
mvn spring-boot:run
```

5. Server will start on

```
http://localhost:8080
```

---

# Postman Testing

### Login Request

POST

```
http://localhost:8080/login
```

### Protected Route

GET

```
http://localhost:8080/protected
```

---

# Output Screenshots

1. Login Request with JWT Token
2. Access Protected Route
3. Invalid Login Response

---

# Learning Outcomes

* Understanding JWT authentication.
* Implementing authentication in Spring Boot.
* Securing API endpoints using tokens.
* Testing APIs using Postman.

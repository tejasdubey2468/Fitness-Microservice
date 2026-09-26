# 🏋️ Fitness Microservices

A fitness management application built while learning **Microservice Architecture** with Spring Boot, Spring Cloud, React, and AI.

## 📌 About

This project was created as a hands-on learning project to understand how multiple independent services communicate and work together.

It includes user management, fitness activities, AI recommendations, authentication, service discovery, centralized configuration, and asynchronous communication.

---

## 🏗️ Architecture

```text
                    React + Vite
                         │
                         ▼
                    API Gateway
                         │
        ┌────────────────┼────────────────┐
        ▼                ▼                ▼
   User Service    Activity Service    AI Service
        │                │                │
      MySQL           MongoDB        Gemini API
                         │
                         ▼
                     RabbitMQ

      Eureka → Service Discovery
      Config Server → Centralized Configuration
      Keycloak → Authentication
```

---

## 🧩 Services

| Service          | Responsibility                   |
| ---------------- | -------------------------------- |
| User Service     | User registration & validation   |
| Activity Service | Fitness activity management      |
| AI Service       | AI-based fitness recommendations |
| API Gateway      | Routing & security               |
| Eureka Server    | Service discovery                |
| Config Server    | Centralized configuration        |

---

## 🛠️ Tech Stack

### Frontend

`React` `Vite` `JavaScript` `HTML` `CSS`

### Backend

`Java` `Spring Boot` `Spring Web` `Spring Data JPA` `Spring Data MongoDB`

### Spring Cloud

`Spring Cloud Gateway` `Eureka` `Spring Cloud Config` `WebClient`

### Security

`Keycloak` `OAuth2` `OpenID Connect` `JWT` `Spring Security`

### Database

`MySQL` `MongoDB`

### Messaging & AI

`RabbitMQ` `Gemini API`

### Tools

`Docker` `Maven` `Git` `GitHub` `Postman` `IntelliJ IDEA`

---

## 🔄 Communication

### Synchronous

```text
Activity Service
       │
       ▼
  User Service
```

Service-to-service communication is handled using **WebClient**.

### Asynchronous

```text
Activity Service
       │
       ▼
    RabbitMQ
       │
       ▼
    AI Service
```

RabbitMQ is used for event-based communication between services.

---

## 🔐 Authentication

Authentication is handled using **Keycloak**.

```text
User
 ↓
Keycloak
 ↓
JWT Token
 ↓
API Gateway
 ↓
Microservice
```

The API Gateway validates JWT tokens before forwarding requests.

---

## 🗄️ Database

```text
User Service      → MySQL
Activity Service  → MongoDB
```

Different services use databases according to their requirements.

---

## 🎨 Frontend

The frontend provides a basic interface for interacting with the application.

Built using:

* React
* Vite
* JavaScript
* HTML
* CSS

The frontend communicates with the backend through the API Gateway.

---

## 🔗 Main APIs

```text
POST  /users/register
GET   /users/{userId}
GET   /users/{userId}/validate

POST  /activities
GET   /activities/{activityId}
GET   /activities/users/{userId}

GET   /recommendation/**
```

---

## 📁 Project Structure

```text
Fitness - Microservice/
│
├── eureka/
├── configserver/
├── gateway/
├── userservice/
├── activityservice/
├── ai-service/
└── frontend/
```

---

## 🚀 Running the Project

### Infrastructure

* MySQL
* MongoDB
* RabbitMQ
* Keycloak

### Services

* Eureka Server
* Config Server
* User Service
* Activity Service
* AI Service
* API Gateway
* React Frontend

---

## 🔑 Environment Variables

Sensitive values should not be committed to GitHub.

```env
GEMINI_API_URL=<your-api-url>
GEMINI_API_KEY=<your-api-key>
```

Keep database credentials and other secrets private.

---

## 📚 What I Learned

This project helped me practically understand:

* Microservice Architecture
* Spring Boot & Spring Cloud
* REST APIs
* API Gateway
* Service Discovery
* Centralized Configuration
* Service-to-Service Communication
* JWT & Keycloak
* MySQL & MongoDB
* RabbitMQ
* React & Vite
* Docker
* AI API Integration

---

## 🎯 Project Goal

The main goal was to learn how an application can be divided into independent services and how those services communicate securely and efficiently.

---

## 🚧 Future Improvements

* Better frontend UI/UX
* Swagger / OpenAPI
* Automated testing
* Docker Compose
* Monitoring & logging
* Distributed tracing
* Improved AI features
* Cloud deployment

---

## 👨‍💻 Author

**Tejas Dubey**

B.Tech Computer Engineering / Computer Science Student

[GitHub](https://github.com/tejasdubey2468)

---

⭐ **Built while learning Microservice Architecture.**

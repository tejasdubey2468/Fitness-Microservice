# 🏋️ Fitness Microservices

### A Microservice-Based Fitness Management Application

<p align="center">
  <b>Built while learning Microservice Architecture with Spring Boot, Spring Cloud, React, RabbitMQ, Keycloak & AI</b>
</p>

---

## 📖 About The Project

**Fitness Microservices** is a fitness management application developed as a hands-on project while learning **Microservice Architecture**.

The application is divided into independent services for users, activities, and AI-based recommendations, allowing each service to have its own responsibility.

It demonstrates how modern applications can use **API Gateway, Service Discovery, Authentication, Database Integration, Messaging, and AI** together.

A basic frontend was also developed using **React, Vite, JavaScript, HTML, and CSS** to interact with the backend.

---

## 🏗️ Architecture

```text
                         ┌─────────────────┐
                         │  React + Vite   │
                         │ HTML/CSS/JS     │
                         └────────┬────────┘
                                  │
                                  ▼
                         ┌─────────────────┐
                         │   API Gateway   │
                         └────────┬────────┘
                                  │
              ┌───────────────────┼───────────────────┐
              ▼                   ▼                   ▼
       ┌─────────────┐     ┌─────────────┐     ┌─────────────┐
       │    User     │     │  Activity   │     │     AI      │
       │   Service   │     │   Service   │     │   Service   │
       └──────┬──────┘     └──────┬──────┘     └──────┬──────┘
              │                   │                   │
              ▼                   ▼                   ▼
           MySQL              MongoDB             Gemini API
                                  │
                                  ▼
                              RabbitMQ

             Eureka → Service Discovery
             Config Server → Centralized Configuration
             Keycloak → Authentication
```

---

## ✨ Features

* 👤 User registration and validation
* 🏃 Fitness activity management
* 🤖 AI-powered fitness recommendations
* 🔐 JWT-based authentication with Keycloak
* 🌐 Centralized API Gateway
* 🔍 Service discovery using Eureka
* ⚙️ Centralized configuration
* 📨 Asynchronous communication using RabbitMQ
* 🗄️ MySQL and MongoDB integration
* 💻 React-based frontend
* 🐳 Docker support

---

## 🧩 Microservices

| Service             | Responsibility                          |
| ------------------- | --------------------------------------- |
| 👤 User Service     | User registration, details & validation |
| 🏃 Activity Service | Fitness activity management             |
| 🤖 AI Service       | AI-based recommendations                |
| 🌐 API Gateway      | Request routing & security              |
| 🔍 Eureka Server    | Service discovery                       |
| ⚙️ Config Server    | Centralized configuration               |

---

# 🛠️ Tech Stack

### 🎨 Frontend

`React` · `Vite` · `JavaScript` · `HTML5` · `CSS3`

### ☕ Backend

`Java` · `Spring Boot` · `Spring Web` · `Spring Data JPA` · `Spring Data MongoDB`

### ☁️ Spring Cloud

`Spring Cloud Gateway` · `Eureka` · `Spring Cloud Config` · `WebClient`

### 🔐 Security

`Spring Security` · `Keycloak` · `OAuth2` · `OpenID Connect` · `JWT`

### 🗄️ Databases

`MySQL` · `MongoDB`

### 📨 Messaging & AI

`RabbitMQ` · `Gemini API`

### 🔧 Tools

`Docker` · `Maven` · `Git` · `GitHub` · `Postman` · `IntelliJ IDEA`

---

## 🔄 How It Works

### User Flow

```text
React Frontend
      ↓
 API Gateway
      ↓
 User Service
      ↓
    MySQL
```

### Activity Flow

```text
React Frontend
      ↓
 API Gateway
      ↓
Activity Service
      ↓
   MongoDB
```

### AI Flow

```text
Activity Service
      ↓
   RabbitMQ
      ↓
  AI Service
      ↓
 Gemini API
```

---

## 🔐 Authentication Flow

```text
       User
        ↓
    Keycloak
        ↓
   JWT Token
        ↓
   API Gateway
        ↓
  Microservices
```

Keycloak handles authentication while the API Gateway validates incoming JWT tokens.

---

## 📨 Service Communication

The project demonstrates both **synchronous** and **asynchronous** communication.

### Synchronous Communication

```text
Activity Service
       ↓
  WebClient
       ↓
 User Service
```

### Asynchronous Communication

```text
Activity Service
       ↓
    RabbitMQ
       ↓
   AI Service
```

---

## 🎨 Frontend

The frontend was created as a basic interface for interacting with the microservices backend.

It uses:

```text
React
Vite
JavaScript
HTML
CSS
```

The frontend communicates with the backend through the **API Gateway** rather than directly accessing individual services.

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
│   └── Eureka Server
│
├── configserver/
│   └── Config Server
│
├── gateway/
│   └── API Gateway
│
├── userservice/
│   └── User Service
│
├── activityservice/
│   └── Activity Service
│
├── ai-service/
│   └── AI Service
│
└── frontend/
    └── React + Vite
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/tejasdubey2468/Fitness-Microservice.git
cd Fitness-Microservice
```

### 2. Start Infrastructure

Make sure the following are running:

```text
MySQL
MongoDB
RabbitMQ
Keycloak
```

### 3. Start Services

Start the applications in this order:

```text
Eureka Server
Config Server
User Service
Activity Service
AI Service
API Gateway
Frontend
```

---

## 🔑 Environment Variables

Keep sensitive credentials outside the repository.

```env
GEMINI_API_URL=<your-api-url>
GEMINI_API_KEY=<your-api-key>
```

Do not commit:

```text
API Keys
Passwords
Secrets
Private Credentials
```

---

## 📚 What I Learned

This project helped me practically understand:

* Microservice Architecture
* Spring Boot & Spring Cloud
* REST API development
* API Gateway
* Service Discovery
* Centralized Configuration
* Service-to-Service Communication
* OAuth2 & JWT
* Keycloak
* MySQL & MongoDB
* RabbitMQ
* React & Vite
* Docker
* AI API integration

---

## 🎯 Learning Objective

The main objective of this project was to move beyond building a simple monolithic application and understand how multiple independent services can work together.

It gave me practical experience with **distributed systems, authentication, databases, messaging, service communication, and frontend-backend integration**.

---

## 🚧 Future Improvements

* [ ] Improve frontend UI/UX
* [ ] Add Swagger / OpenAPI
* [ ] Add automated tests
* [ ] Add Docker Compose
* [ ] Improve monitoring and logging
* [ ] Add distributed tracing
* [ ] Improve AI recommendations
* [ ] Deploy the application to the cloud

---

## 👨‍💻 Author

### Tejas Dubey

**B.Tech Computer Engineering / Computer Science Student**

Building projects and learning **Java • Spring Boot • Microservices • React • AI**

🔗 **GitHub:**
https://github.com/tejasdubey2468

---

## ⭐ Project

If you find this project interesting, feel free to explore the repository and follow my learning journey.

**Built with ☕ Java, Spring Boot & a lot of debugging.**


# Subscription Management System

A RESTful backend application built with Spring Boot for managing members and their subscriptions.

## Overview

The Subscription Management System provides APIs for managing members, tracking their subscriptions, and monitoring subscription payments.

Each member can have multiple subscriptions. Each subscription stores its payment amount, payment date, duration, and an optional associated image.

## Features

### Member Management
- Retrieve a member by ID.
- Retrieve all members.
- Add a new member.
- Get the total number of members.
- Store member information, including full name, phone number, and profession.

### Subscription Management
- Add a subscription for a specific member.
- Retrieve all subscriptions belonging to a member.
- Get the total number of subscriptions.
- Calculate the total amount of subscriptions.
- Store subscription payment date and duration in months.
- Upload and store an image associated with a subscription.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- RESTful APIs
- Maven

## Database Relationships

The application uses a one-to-many relationship between members and subscriptions.

- One member can have multiple subscriptions.
- Each subscription belongs to one member.

## API Endpoints

### Members

| Method | Endpoint | Description |
|---|---|---|
| GET | `/members` | Retrieve all members |
| GET | `/member/{memberId}` | Retrieve a member by ID |
| GET | `/members/count` | Get total number of members |
| POST | `/member` | Create a new member |

### Subscriptions

| Method | Endpoint | Description |
|---|---|---|
| GET | `/subscriptions/count` | Get total number of subscriptions |
| GET | `/subscriptions/totalAmount` | Get total subscription amount |
| GET | `/members/{memberId}/Subscription` | Retrieve a member's subscriptions |
| POST | `/subscription` | Create a subscription and upload its image |

## Getting Started

### Prerequisites

- Java JDK
- Maven (or use the included Maven Wrapper)
- A supported SQL database

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/context-community/sanad.git
   ```

2. Navigate to the project directory:

   ```bash
   cd sanad
   ```

3. Configure your database connection in your local `application.properties` file.

4. Run the application:

   **Windows:**

   ```bash
   mvnw.cmd spring-boot:run
   ```

   **Linux / macOS:**

   ```bash
   ./mvnw spring-boot:run
   ```

## Configuration

Database connection settings must be configured locally in `application.properties`.

Sensitive configuration files and credentials should never be committed to the repository.

## License

This project is maintained within the CONTEXT-Community.

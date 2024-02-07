# Dynamo Application (Onboarding-service)


## Introduction

Welcome to the Spring 3.2.2 with Java 17 project! This README provides essential information to get you started with this project.


## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Setup](#setup)
3. [Technology](#technology)
4. [Project Structure](#project-structure)
5. [Contributing](#contributing)
6. [API Description](#api-description) 
7. [License](#license)


## Prerequisites

Before you begin, ensure you have the following tools and technologies installed on your machine:

- **Java 17:** Make sure you have Java Development Kit (JDK) 17 installed.
- **Apache Maven:** Maven is used for building and managing the project dependencies.
- **Integrated Development Environment (IDE):** You can use any Java-compatible IDE such as IntelliJ IDEA, Spring Tool Suite 4 or Eclipse.


## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/tanmaysinghx/dynamo-app-onboarding-service.git

2. **Build the Project:**
   ```bash
   cd dynamo-app-onboarding-service
   mvn clean install

3. **Setup DB using SQL:**
   ```bash
   CREATE DATABASE `DB1DYNAMO`
   /* Run this query in SQL or manually create a DB with name "DB1DYNAMO" */
 
4. **Run the Project:**
   ```bash
   mvn spring-boot:run


## Technology

This project is built using the following technologies:

- **Spring 3.2.2:** The core framework for building Java-based enterprise applications.
- **Java 17:** The latest long-term support version of the Java programming language.
- **Maven:** A popular build and project management tool.
- **SQL:** Used for database management.


## Project Structure

The project structure is organized in a standard Maven project layout. Here are some important directories:

- `src/main/java`: Contains the main Java source code.
- `src/main/resources`: Contains configuration files and static assets.


## Contributing

If you would like to contribute to this project, please follow the guidelines in the [CONTRIBUTING.md](CONTRIBUTING.md) file.


## API Description

This section provides a brief overview of the APIs available in the project along with sample payload examples.

### 1. Endpoint: `/company-details/get-company-data/{{companyId}}`

#### Description:
This API provides get company data based on company id(52).

#### Method: `GET`

### 2. Endpoint: `/company-details/register-company`

#### Description:
This API registers a new company.

#### Method: `POST`

##### Request:

```json
{
    "companyName": "Dummy Corporation",
    "packageCode": 12345,
    "superuserName": "John Doe",
    "superuserEmail": "john.doe@example.com",
    "startDate": "2024-02-07",
    "endDate": "2024-02-14"
}
```

## License

This project is licensed under the [MIT License](LICENSE).

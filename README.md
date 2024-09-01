# Spring Security Minimum Example

This project is a simple example of a Spring Boot application with the minimal configuration required to secure an endpoint using Spring Security.

## Overview

The purpose of this project is to demonstrate how to implement form-based authentication in a Spring Boot application using Spring Security with minimal configuration.

## Getting Started

### Prerequisites

To run this project, you need to have:

- [Java 17](https://jdk.java.net/17/) installed.
- [Maven](https://maven.apache.org/) installed.
- [Docker](https://www.docker.com/) installed (if you want to run the application in a Docker container).

### Running the Application

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/spring-security-minimum.git
    cd spring-security-minimum
    ```

2. **Build the project using Maven**:
    ```bash
    mvn clean package
    ```

3. **Run the application**:
    ```bash
    java -jar target/spring-security-minimum-0.0.1-SNAPSHOT.jar
    ```

    Or using Docker:
    
    ```bash
    docker build -t spring-security-minimum .
    docker run -p 8080:8080 spring-security-minimum
    ```

### Accessing the Application

After starting the application, you can access the secured endpoint as follows:

- **URL**: [http://localhost:8080/private](http://localhost:8080/private)
- **Username**: `user`
- **Password**: `password`

You will be prompted to enter the username and password when you try to access the `/private` endpoint.

### Security Configuration

The security is configured with the minimum setup required:

- A single user (`user`) is hardcoded with the password (`password`).
- Basic HTTP authentication is used to protect the `/private` endpoint.

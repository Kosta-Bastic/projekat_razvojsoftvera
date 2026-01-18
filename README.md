# Student Service Management System

A full-stack application with Spring Boot backend and client-side frontend.

## Project Structure

```
projekat_razvojsoftvera/
├── server/              # Spring Boot backend application
│   ├── src/            # Server source code
│   └── pom.xml         # Server dependencies
├── client/              # Client-side application (placeholder)
│   ├── README.md       # Client setup instructions
│   └── pom.xml         # Client module configuration
├── shared-dtos/         # Shared Data Transfer Objects
│   ├── src/            # Shared DTOs source code
│   └── pom.xml         # Shared DTOs dependencies
├── pom.xml              # Parent POM for multi-module build
├── mvnw / mvnw.cmd     # Maven wrapper scripts
└── .gitignore          # Git ignore patterns

```

## Building the Project

### Prerequisites
- Java 17 or later
- Maven 3.6+ (or use the included Maven wrapper)

### Build All Modules
```bash
./mvnw clean install
```

### Build Specific Module
```bash
cd server
../mvnw clean install
```

## Running the Application

### Server
```bash
cd server
../mvnw spring-boot:run
```

The server will start on `http://localhost:8090`

### Client
Follow instructions in `client/README.md` once client code is added.

## Development

### Module Overview

- **server**: Spring Boot REST API with JPA, Security, and MySQL
- **client**: Frontend application (to be added)
- **shared-dtos**: Common data transfer objects used by both server and client

### Adding Client Code

1. Navigate to the `client/` directory
2. Add your client application files (React, Angular, Vue, etc.)
3. Update `client/pom.xml` if you want Maven to manage the build
4. Update `.gitignore` as needed for your framework

### Technologies

- **Backend**: Spring Boot 3.2.0, Java 17, Hibernate, Spring Security, MySQL
- **Build Tool**: Maven (multi-module)
- **Client**: Ready for integration (framework TBD)

## Database Configuration

Configure database connection in `server/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## IntelliJ IDEA Setup

1. Open the root `pom.xml` as a project
2. IntelliJ will automatically detect the multi-module structure
3. Install Lombok plugin: `File → Settings → Plugins → Lombok`
4. Enable annotation processing: `File → Settings → Compiler → Annotation Processors`
5. Reload Maven projects: Right-click on root pom.xml → Maven → Reload project

## License

[Add your license here]

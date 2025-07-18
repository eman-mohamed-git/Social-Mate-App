# Social Mate App

Social Mate is a Spring Boot-based application designed to manage social interactions, including posts, comments, user management, and reporting. The project is modularized into various services and libraries to ensure scalability and maintainability.

## Features
- **User Management**: Handle user profiles, roles, and authentication.
- **Post Management**: Create, update, and manage posts and comments.
- **Reporting**: Generate and manage reports for posts and users.
- **Integration**: Includes adapters for REST, MQ, and database interactions.

## Project Structure
The project is organized into the following modules:

### Libraries
- **common**: Shared utilities and common code.
- **lib-bom**: Bill of Materials for dependency management.
- **logger-adapter**: Logging utilities.
- **mq-adapter**: Message queue integration.
- **rest-adapter**: REST API utilities.
- **security-adapter**: Security and authentication.
- **session-manager**: Session management.
- **sql-db-adapter**: Database interaction utilities.
- **swagger**: API documentation.
- **unit-test**: Testing utilities.

### Services
- **point**: Manage points and rewards.
- **post**: Handle posts and comments.
- **report**: Reporting and analytics.
- **user**: User management and authentication.

## Prerequisites
- Java 11 or higher
- Maven 3.6+
- A database (e.g., MySQL, PostgreSQL)

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/eman-mohamed-git/Social-Mate-App.git
   ```
2. Navigate to the project directory:
   ```bash
   cd social-mate-app
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for details.


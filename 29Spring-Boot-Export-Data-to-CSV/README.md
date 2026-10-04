# 29 - Export Data To CSV

This chapter is part of the Spring Boot learning workspace.

## Agenda

- [Problem We Will Solve](#problem-we-will-solve)
- [What You Will Learn](#what-you-will-learn)
- [Project Details](#project-details)
- [How To Run](#how-to-run)
- [Example](#example)
- [Key Points Or Common Mistakes](#key-points-or-common-mistakes)
- [Chapter Summary And Next Step](#chapter-summary-and-next-step)
- [Common Interview Questions And Short Answers](#common-interview-questions-and-short-answers)

## Problem We Will Solve

Export database records to a CSV file from a Spring Boot application.

## What You Will Learn

- CSV generation
- Streaming/export endpoint design
- Repository/service separation
- Database export use cases

## Project Details

| Item | Value |
| --- | --- |
| Folder | `29Spring-Boot-Export-Data-to-CSV` |
| Maven artifact | `28SpringBootDeclarative-Transaction-Rollback` |
| Base URL | `http://localhost:2022` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-jdbc
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-boot-devtools
- super-csv
- ojdbc6
- lombok

### Important Application Settings

- .\29Spring-Boot-Export-Data-to-CSV\src\main\resources\application.properties - server.port=2022
- .\29Spring-Boot-Export-Data-to-CSV\src\main\resources\application.properties - spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
- .\29Spring-Boot-Export-Data-to-CSV\src\main\resources\application.properties - spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

### Source Mappings Found

- Not detected from source scan.

### Keywords

- CSV
- Super CSV
- export
- Spring Data JPA
- download response

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2022
```

> This chapter uses database configuration. Check src/main/resources/application.properties before running it, and replace demo credentials with your local values.

## Example

Start the app and watch the console startup logs.

```text
Base URL: http://localhost:2022
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Export database records to a CSV file from a Spring Boot application.

Previous chapter: [28 - Transaction Rollback](../28SpringBootDeclarative-Transaction-Rollback/README.md).

Next chapter: [29 - Spring Security Basic Authentication](../29SpringBootSeciryBasicAuthentication/README.md). It solves this next problem: Protect an endpoint using HTTP Basic authentication.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is JdbcTemplate?**  JdbcTemplate simplifies JDBC code by handling connection and statement boilerplate.

**Q4. What is the DAO pattern?**  DAO separates persistence logic from controller and business logic.

**Q5. Why use a service layer?**  It keeps business rules in one place and prevents controllers from becoming too large.

**Q6. What is a RowMapper?**  A RowMapper converts one database row into a Java object.

**Q7. What is a common database mistake?**  Hard-coding real credentials or mixing SQL directly into controller code.




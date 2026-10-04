# 10 - Spring Boot CRUD Operation

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

Create CRUD APIs backed by Spring Data JPA and an H2 in-memory database.

## What You Will Learn

- Entity and repository design
- CRUD controller methods
- H2 local database setup
- Service layer responsibility

## Project Details

| Item | Value |
| --- | --- |
| Folder | `10SpringBootCurdOperation` |
| Maven artifact | `10SpringBootCurdOperation` |
| Base URL | `http://localhost:8082` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-data-jpa
- h2
- lombok

### Important Application Settings

- .\10SpringBootCurdOperation\src\main\resources\application.properties - server.port = 8082
- .\10SpringBootCurdOperation\src\main\resources\application.properties - spring.datasource.url=jdbc:h2:mem:dcbapp
- .\10SpringBootCurdOperation\src\main\resources\application.properties - spring.datasource.driverClassName=org.h2.Driver
- .\10SpringBootCurdOperation\src\main\resources\application.properties - spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

### Source Mappings Found

- @RequestMapping("/departments")
- @PostMapping 
- @GetMapping 
- @PutMapping("/{id}")
- @DeleteMapping("/{id}")
- @RequestMapping("/api/v1")
- @PostMapping("/product")
- @GetMapping("/products")
- @GetMapping("/products/{id}")
- @PutMapping("/products/{id}")

### Keywords

- CRUD
- Spring Data JPA
- JpaRepository
- H2
- Entity
- Repository
- Service

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:8082
```

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:8082
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Create CRUD APIs backed by Spring Data JPA and an H2 in-memory database.

Previous chapter: [10 - Bean Object Display](../10BeanObjectDisplay/README.md).

Next chapter: [11 - Spring Boot Cache Operation](../11SpringBootCacheOperation/README.md). It solves this next problem: Understand how caching can reduce repeated database work and how cache eviction works.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is JdbcTemplate?**  JdbcTemplate simplifies JDBC code by handling connection and statement boilerplate.

**Q4. What is the DAO pattern?**  DAO separates persistence logic from controller and business logic.

**Q5. Why use a service layer?**  It keeps business rules in one place and prevents controllers from becoming too large.

**Q6. What is a RowMapper?**  A RowMapper converts one database row into a Java object.

**Q7. What is a common database mistake?**  Hard-coding real credentials or mixing SQL directly into controller code.




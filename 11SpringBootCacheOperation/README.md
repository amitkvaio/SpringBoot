# 11 - Spring Boot Cache Operation

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

Understand how caching can reduce repeated database work and how cache eviction works.

## What You Will Learn

- Cache abstraction
- Cacheable method design
- Cache invalidation
- Database and cache trade-offs

## Project Details

| Item | Value |
| --- | --- |
| Folder | `11SpringBootCacheOperation` |
| Maven artifact | `11SpringBootCacheOperation` |
| Base URL | `http://localhost:2085` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-cache
- ojdbc6
- mysql-connector-java
- spring-boot-starter-jdbc

### Important Application Settings

- .\11SpringBootCacheOperation\src\main\resources\application.properties - server.port=2085
- .\11SpringBootCacheOperation\src\main\resources\application.properties - spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
- .\11SpringBootCacheOperation\src\main\resources\application.properties - spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
- .\11SpringBootCacheOperation\src\main\resources\application.properties - spring.cache.type=none

### Source Mappings Found

- @RequestMapping("/empDeatils")
- @RequestMapping("/removeCahe")

### Keywords

- @EnableCaching
- @Cacheable
- @CacheEvict
- cache invalidation
- database performance

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2085
```

> This chapter uses database configuration. Check src/main/resources/application.properties before running it, and replace demo credentials with your local values.

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:2085
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Understand how caching can reduce repeated database work and how cache eviction works.

Previous chapter: [10 - Spring Boot CRUD Operation](../10SpringBootCurdOperation/README.md).

Next chapter: [12 - Scheduling](../12Scheduling/README.md). It solves this next problem: Run background jobs automatically using Spring scheduling.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is JdbcTemplate?**  JdbcTemplate simplifies JDBC code by handling connection and statement boilerplate.

**Q4. What is the DAO pattern?**  DAO separates persistence logic from controller and business logic.

**Q5. Why use a service layer?**  It keeps business rules in one place and prevents controllers from becoming too large.

**Q6. What is a RowMapper?**  A RowMapper converts one database row into a Java object.

**Q7. What is a common database mistake?**  Hard-coding real credentials or mixing SQL directly into controller code.




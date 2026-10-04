# 26 - Declarative Transaction Management

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

Keep related database changes atomic using declarative transactions.

## What You Will Learn

- @Transactional basics
- Commit and rollback behavior
- Service layer transaction boundary
- Multi-table data consistency

## Project Details

| Item | Value |
| --- | --- |
| Folder | `26SpringBootDeclarative-Transaction-Management` |
| Maven artifact | `26SpringBootDeclarative-Transaction-Management` |
| Base URL | `http://localhost:2022` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-jdbc
- spring-boot-starter-web
- spring-boot-devtools
- ojdbc11
- lombok

### Important Application Settings

- .\26SpringBootDeclarative-Transaction-Management\src\main\resources\application.properties - server.port=2022
- .\26SpringBootDeclarative-Transaction-Management\src\main\resources\application.properties - spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/freepdb1

### Source Mappings Found

- @RequestMapping("/org")
- @RequestMapping( value="/join/",method={RequestMethod.POST})
- @PostMapping( value="/join/")
- @PostMapping( value="/join_throw_exception/")
- @RequestMapping(value = "/welcome/", method = RequestMethod.GET)
- @RequestMapping( value="/leave/",method={RequestMethod.DELETE})
- @DeleteMapping( value="/leave/")

### Keywords

- @Transactional
- ACID
- commit
- rollback
- transaction boundary
- JdbcTemplate

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

Use one of the mappings listed above with the base URL.

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

Solved in this chapter: Keep related database changes atomic using declarative transactions.

Previous chapter: [25 - Spring Boot Versioning](../25SpringBootVersioning/README.md).

Next chapter: [27 - Transaction Propagation](../27SpringBootDeclarative-Transaction-Propagation/README.md). It solves this next problem: Understand how nested service calls behave when each method has transaction rules.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What does @Transactional do?**  It starts a transaction around a method and commits or rolls back based on the result.

**Q4. Why keep transactions in the service layer?**  The service layer usually represents one business operation across multiple DAO calls.

**Q5. What is rollback?**  Rollback cancels database changes when a transaction fails.

**Q6. What is propagation?**  Propagation controls how a transaction behaves when one transactional method calls another.

**Q7. What is a common transaction mistake?**  Placing transaction boundaries too low or expecting checked exceptions to roll back by default.




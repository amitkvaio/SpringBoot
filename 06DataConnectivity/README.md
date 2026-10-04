# 06 - Data Connectivity

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

Connect Spring Boot with a database and read employee data through JDBC.

## What You Will Learn

- Datasource properties
- JdbcTemplate-style database access
- Row mapping basics
- Database driven endpoint testing

## Project Details

| Item | Value |
| --- | --- |
| Folder | `06DataConnectivity` |
| Maven artifact | `06DataConnectivity` |
| Base URL | `http://localhost:2085` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools
- ojdbc11
- spring-boot-starter-jdbc
- lombok

### Important Application Settings

- .\06DataConnectivity\src\main\resources\application.properties - server.port=2085
- .\06DataConnectivity\src\main\resources\application.properties - spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/freepdb1
- .\06DataConnectivity\src\main\resources\application.properties - spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

### Source Mappings Found

- @RequestMapping(method=RequestMethod.GET,value="/allEmp")
- @RequestMapping(method=RequestMethod.GET,value="/allEmpUsingBean" )
- @RequestMapping(method=RequestMethod.GET,value="/totalCount")
- @GetMapping(value="/empDetailsUsingPathVariable/{empId}")
- @GetMapping(value="/empDetailsUsingRequestParam")

### Keywords

- DataSource
- JDBC
- Oracle
- MySQL connector
- RowMapper
- SQL query

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

Solved in this chapter: Connect Spring Boot with a database and read employee data through JDBC.

Previous chapter: [05 - Reload Code](../05ReloadCode/README.md).

Next chapter: [07 - Dual DataSource](../07DualDataSource/README.md). It solves this next problem: Configure and use more than one datasource in the same Spring Boot application.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is JdbcTemplate?**  JdbcTemplate simplifies JDBC code by handling connection and statement boilerplate.

**Q4. What is the DAO pattern?**  DAO separates persistence logic from controller and business logic.

**Q5. Why use a service layer?**  It keeps business rules in one place and prevents controllers from becoming too large.

**Q6. What is a RowMapper?**  A RowMapper converts one database row into a Java object.

**Q7. What is a common database mistake?**  Hard-coding real credentials or mixing SQL directly into controller code.




# 09 - XML Response

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

Return XML responses from REST endpoints using Jackson XML support.

## What You Will Learn

- Content negotiation
- XML serialization
- Database-backed response data
- REST response format choices

## Project Details

| Item | Value |
| --- | --- |
| Folder | `09SpringBootXMLResponse` |
| Maven artifact | `09SpringBootXMLResponse` |
| Base URL | `http://localhost:2085` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-jdbc
- mysql-connector-java
- jackson-dataformat-xml

### Important Application Settings

- .\09SpringBootXMLResponse\src\main\resources\application.properties - server.port=2085
- .\09SpringBootXMLResponse\src\main\resources\application.properties - spring.jpa.hibernate.ddl-auto=none
- .\09SpringBootXMLResponse\src\main\resources\application.properties - spring.datasource.url=jdbc:mysql://localhost:3306/amitdb

### Source Mappings Found

- @RequestMapping("/employee")
- @GetMapping(path="/details")

### Keywords

- XML
- Jackson XML
- Content-Type
- Accept header
- JDBC

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

Solved in this chapter: Return XML responses from REST endpoints using Jackson XML support.

Previous chapter: [08 - Spring Boot MVC](../08SpringBootMVC/README.md).

Next chapter: [10 - Bean Object Display](../10BeanObjectDisplay/README.md). It solves this next problem: Understand how Spring creates and displays bean objects in an application context.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is @RestController used for?**  It returns data directly from controller methods, usually as JSON or XML.

**Q4. What is content negotiation?**  It selects a response format based on request headers and available converters.

**Q5. Why validate request data?**  Validation rejects bad input early and keeps service logic cleaner.

**Q6. Why document APIs?**  API documentation helps developers test endpoints and understand request and response contracts.

**Q7. What is a common REST mistake?**  Using unclear URLs, wrong HTTP methods, or inconsistent response structures.




# 25 - Spring Boot Versioning

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

Support multiple API versions without breaking old clients.

## What You Will Learn

- URI versioning
- Request parameter versioning
- Header versioning
- Media type versioning trade-offs

## Project Details

| Item | Value |
| --- | --- |
| Folder | `25SpringBootVersioning` |
| Maven artifact | `25SpringBootVersioning` |
| Base URL | `http://localhost:2020` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-starter-hateoas
- spring-boot-devtools

### Important Application Settings

- .\25SpringBootVersioning\src\main\resources\application.properties - server.port=2020

### Source Mappings Found

- @GetMapping("v1/student")
- @GetMapping("v2/student")
- @GetMapping(value = "/student/param", params = "version=1")
- @GetMapping(value = "/student/param", params = "version=2")
- @GetMapping(value = "/student/header", headers = "X-API-VERSION=1")
- @GetMapping(value = "/student/header", headers = "X-API-VERSION=2")
- @GetMapping(value = "/student/produces", produces = "application/vnd.company.app-v1+json")
- @GetMapping(value = "/student/produces", produces = "application/vnd.company.app-v2+json")

### Keywords

- API versioning
- URI version
- request param version
- header version
- media type version

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2020
```

> If Spring Security is on the classpath, browser/API requests may need login or an Authorization header.

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:2020
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Support multiple API versions without breaking old clients.

Previous chapter: [24 - Static And Dynamic Filtering](../24SpringBootStaticAndDynamicFilter/README.md).

Next chapter: [26 - Declarative Transaction Management](../26SpringBootDeclarative-Transaction-Management/README.md). It solves this next problem: Keep related database changes atomic using declarative transactions.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is @RestController used for?**  It returns data directly from controller methods, usually as JSON or XML.

**Q4. What is content negotiation?**  It selects a response format based on request headers and available converters.

**Q5. Why validate request data?**  Validation rejects bad input early and keeps service logic cleaner.

**Q6. Why document APIs?**  API documentation helps developers test endpoints and understand request and response contracts.

**Q7. What is a common REST mistake?**  Using unclear URLs, wrong HTTP methods, or inconsistent response structures.




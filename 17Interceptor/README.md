# 17 - Interceptor

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

Run logic before and after controller execution using Spring MVC interceptors.

## What You Will Learn

- Interceptor registration
- preHandle and postHandle flow
- Request lifecycle hooks
- Cross-cutting request logic

## Project Details

| Item | Value |
| --- | --- |
| Folder | `17Interceptor` |
| Maven artifact | `17Interceptor` |
| Base URL | `http://localhost:2026/context` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools

### Important Application Settings

- .\17Interceptor\src\main\resources\application.properties - server.port=2026
- .\17Interceptor\src\main\resources\application.properties - server.servlet.context-path=/context

### Source Mappings Found

- @RequestMapping(value = "/products")

### Keywords

- HandlerInterceptor
- WebMvcConfigurer
- preHandle
- postHandle
- request lifecycle

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2026/context
```

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:2026/context
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Run logic before and after controller execution using Spring MVC interceptors.

Previous chapter: [16 - External Tomcat Server Configuration](../16ExternalTomcatServerConfiguration/README.md).

Next chapter: [18 - Servlet Filter](../18ServletFilter/README.md). It solves this next problem: Filter incoming requests before they reach Spring MVC controllers.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is @RestController used for?**  It returns data directly from controller methods, usually as JSON or XML.

**Q4. What is content negotiation?**  It selects a response format based on request headers and available converters.

**Q5. Why validate request data?**  Validation rejects bad input early and keeps service logic cleaner.

**Q6. Why document APIs?**  API documentation helps developers test endpoints and understand request and response contracts.

**Q7. What is a common REST mistake?**  Using unclear URLs, wrong HTTP methods, or inconsistent response structures.




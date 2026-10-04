# 23 - Spring Boot Actuator

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

Expose operational endpoints to observe application health and runtime details.

## What You Will Learn

- Actuator endpoints
- Health checks
- Management endpoint exposure
- Production safety considerations

## Project Details

| Item | Value |
| --- | --- |
| Folder | `23SpringBootActuator` |
| Maven artifact | `23SpringBootActuator` |
| Base URL | `http://localhost:2019` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-starter-hateoas
- spring-boot-starter-validation
- spring-boot-devtools
- spring-boot-starter-actuator
- spring-data-rest-hal-explorer

### Important Application Settings

- .\23SpringBootActuator\src\main\resources\application.properties - server.port=2019
- .\23SpringBootActuator\src\main\resources\application.properties - management.endpoints.web.exposure.include=*

### Source Mappings Found

- @GetMapping("/users")
- @GetMapping("/users/{id}")
- @PostMapping("/createUsers")
- @DeleteMapping("/delete/{id}")

### Keywords

- Actuator
- /actuator/health
- management.endpoints
- metrics
- observability

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2019
```

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:2019
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Expose operational endpoints to observe application health and runtime details.

Previous chapter: [22 - Swagger Documentation](../22SpringBootSwaggerDocumentation/README.md).

Next chapter: [24 - Static And Dynamic Filtering](../24SpringBootStaticAndDynamicFilter/README.md). It solves this next problem: Control which fields are returned in REST responses.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is @RestController used for?**  It returns data directly from controller methods, usually as JSON or XML.

**Q4. What is content negotiation?**  It selects a response format based on request headers and available converters.

**Q5. Why validate request data?**  Validation rejects bad input early and keeps service logic cleaner.

**Q6. Why document APIs?**  API documentation helps developers test endpoints and understand request and response contracts.

**Q7. What is a common REST mistake?**  Using unclear URLs, wrong HTTP methods, or inconsistent response structures.




# 12 - Scheduling

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

Run background jobs automatically using Spring scheduling.

## What You Will Learn

- Scheduling enablement
- Cron style jobs
- Fixed background work
- Job logging and testing

## Project Details

| Item | Value |
| --- | --- |
| Folder | `12Scheduling` |
| Maven artifact | `12Scheduling` |
| Base URL | `http://localhost:2085` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-web
- spring-boot-devtools

### Important Application Settings

- .\12Scheduling\src\main\resources\application.properties - server.port=2085

### Source Mappings Found

- Not detected from source scan.

### Keywords

- @EnableScheduling
- @Scheduled
- cron
- background job
- task scheduling

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2085
```

## Example

Start the app and watch the console startup logs.

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

Solved in this chapter: Run background jobs automatically using Spring scheduling.

Previous chapter: [11 - Spring Boot Cache Operation](../11SpringBootCacheOperation/README.md).

Next chapter: [13 - Thread Pool Configuration](../13SpringThreadPoolConfig/README.md). It solves this next problem: Handle asynchronous work with a configured thread pool instead of blocking every request.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is @SpringBootApplication?**  It combines configuration, component scanning, and auto-configuration.

**Q4. Why use application.properties?**  It keeps runtime configuration outside Java code.

**Q5. What is embedded Tomcat?**  It lets a Spring Boot web app run as a standalone application.

**Q6. What is auto-configuration?**  Spring Boot configures common beans based on dependencies and properties.

**Q7. What is a common beginner mistake?**  Forgetting the configured port or context path while testing URLs.




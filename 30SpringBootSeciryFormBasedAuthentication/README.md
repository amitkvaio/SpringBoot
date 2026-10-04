# 30 - Spring Security Form Based Authentication

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

Protect a browser page using form login and a success page.

## What You Will Learn

- Form login flow
- Login page and success page
- Session based authentication
- Thymeleaf integration

## Project Details

| Item | Value |
| --- | --- |
| Folder | `30SpringBootSeciryFormBasedAuthentication` |
| Maven artifact | `30SpringBootSeciryFormBasedcAuthentication` |
| Base URL | `http://localhost:2025` |
| Main config | `src/main/resources/application.properties` |

### Important Dependencies

- spring-boot-starter-security
- jakarta.servlet-api
- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-thymeleaf

### Important Application Settings

- .\30SpringBootSeciryFormBasedAuthentication\src\main\resources\application.properties - server.port=2025

### Source Mappings Found

- @GetMapping("/")

### Keywords

- formLogin
- session
- Thymeleaf
- login page
- Spring Security

## How To Run

Open a terminal in this chapter folder and run:

```bash
mvn spring-boot:run
```

Then open the base URL:

```text
http://localhost:2025
```

> If Spring Security is on the classpath, browser/API requests may need login or an Authorization header.

## Example

Use one of the mappings listed above with the base URL.

```text
Base URL: http://localhost:2025
```

Expected result: the application should start successfully, and the mapped endpoint should return the response implemented by the controller.

## Key Points Or Common Mistakes

- Check the configured port before testing the endpoint.
- Include the context path when server.servlet.context-path is configured.
- Keep controller logic small and move business/data logic into service or DAO classes.
- Do not commit real database passwords or production secrets.
- If a port is already busy, stop the other app or change server.port for local practice.

## Chapter Summary And Next Step

Solved in this chapter: Protect a browser page using form login and a success page.

Previous chapter: [29 - Spring Security Basic Authentication](../29SpringBootSeciryBasicAuthentication/README.md).

This is the final chapter in this workspace. As a next step, combine CRUD, validation, actuator, transactions, and Spring Security in one small practice API.

## Common Interview Questions And Short Answers

**Q1. What problem does this chapter solve?**  It shows one focused Spring Boot concept in a small runnable project.

**Q2. Why should each chapter be run separately?**  Each folder is an independent Spring Boot project with its own dependencies, port, and configuration.

**Q3. What is authentication?**  Authentication verifies who the user is.

**Q4. What is authorization?**  Authorization decides what an authenticated user can access.

**Q5. What is the difference between Basic auth and form login?**  Basic auth sends credentials in the Authorization header, while form login uses a browser form and session.

**Q6. What is SecurityFilterChain?**  It defines security rules for incoming HTTP requests.

**Q7. What is a common security mistake?**  Using demo credentials or exposing protected endpoints without clear access rules.




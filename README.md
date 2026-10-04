# SpringBoot

Spring Boot Examples

Please Refer SpringBoot_Note.docx attached

## Overview

This repository is a chapter-by-chapter Spring Boot learning workspace.
It starts with a simple Hello World application and continues through REST APIs, configuration, database access, MVC, validation, HATEOAS, Swagger, Actuator, transactions, CSV export, and Spring Security basics.

## Agenda

- [Problem We Will Solve](#problem-we-will-solve)
- [What You Will Learn](#what-you-will-learn)
- [Project Index](#project-index)
- [Recommended Learning Order](#recommended-learning-order)
- [How To Run](#how-to-run)
- [Key Interview Keywords](#key-interview-keywords)
- [Chapter Summary And Next Step](#chapter-summary-and-next-step)
- [Common Interview Questions And Short Answers](#common-interview-questions-and-short-answers)

## Problem We Will Solve

Learning Spring Boot becomes easier when each topic is separated into a small runnable project.
This workspace solves that problem by keeping every major concept in its own chapter.

## What You Will Learn

- How to create and run Spring Boot web applications.
- How to build REST APIs with controllers, models, validation, and exception handling.
- How to configure ports, context paths, datasource settings, MVC views, and actuator endpoints.
- How to work with JDBC, JPA, cache, scheduling, thread pools, filters, interceptors, transactions, CSV export, and basic Spring Security.
- How to explain common Spring Boot interview topics in simple words.

## Project Index

| No. | Chapter | Problem Solved |
| --- | --- | --- |
| 1 | [01 - Hello World](01HelloWorld/README.md) | Create the first Spring Boot web application and confirm that the embedded server starts correctly. |
| 2 | [02 - RESTful Web Service](02RestFullWebService/README.md) | Build REST endpoints for simple resources and understand common HTTP methods. |
| 3 | [03 - Server Port Change](03ServerportChange/README.md) | Run a Spring Boot application on a custom port instead of the default 8080. |
| 4 | [04 - Change Context Path](04ChangeContextPath/README.md) | Expose all APIs under a common base path so the application URL is easier to organize. |
| 5 | [05 - Reload Code](05ReloadCode/README.md) | Use Spring Boot DevTools to speed up development by restarting when code changes. |
| 6 | [06 - Data Connectivity](06DataConnectivity/README.md) | Connect Spring Boot with a database and read employee data through JDBC. |
| 7 | [07 - Dual DataSource](07DualDataSource/README.md) | Configure and use more than one datasource in the same Spring Boot application. |
| 8 | [08 - Spring Boot MVC](08SpringBootMVC/README.md) | Return server-side views from Spring Boot using Spring MVC and JSP. |
| 9 | [09 - XML Response](09SpringBootXMLResponse/README.md) | Return XML responses from REST endpoints using Jackson XML support. |
| 10 | [10 - Bean Object Display](10BeanObjectDisplay/README.md) | Understand how Spring creates and displays bean objects in an application context. |
| 11 | [10 - Spring Boot CRUD Operation](10SpringBootCurdOperation/README.md) | Create CRUD APIs backed by Spring Data JPA and an H2 in-memory database. |
| 12 | [11 - Spring Boot Cache Operation](11SpringBootCacheOperation/README.md) | Understand how caching can reduce repeated database work and how cache eviction works. |
| 13 | [12 - Scheduling](12Scheduling/README.md) | Run background jobs automatically using Spring scheduling. |
| 14 | [13 - Thread Pool Configuration](13SpringThreadPoolConfig/README.md) | Handle asynchronous work with a configured thread pool instead of blocking every request. |
| 15 | [14 - Data Connectivity Reading SQL Query](14DataConnectivity_Reading_SQL_Query/README.md) | Keep SQL queries organized while reading data from the database. |
| 16 | [15 - DAO With JdbcTemplate](15DAO_JDBCTemplate/README.md) | Build a clearer DAO layer for insert, update, delete, and select operations using JdbcTemplate. |
| 17 | [16 - External Tomcat Server Configuration](16ExternalTomcatServerConfiguration/README.md) | Package a Spring Boot app for deployment to an external Tomcat server. |
| 18 | [17 - Interceptor](17Interceptor/README.md) | Run logic before and after controller execution using Spring MVC interceptors. |
| 19 | [18 - Servlet Filter](18ServletFilter/README.md) | Filter incoming requests before they reach Spring MVC controllers. |
| 20 | [19 - Spring Boot Validation](19SpringbootValidation/README.md) | Validate request payloads before saving or processing data. |
| 21 | [20 - Spring Boot HATEOAS](20SpringbootHATEOAS/README.md) | Add useful links to REST responses so clients can discover related actions. |
| 22 | [21 - Internationalization i18n](21Internationalization-i18/README.md) | Return messages in different languages based on locale. |
| 23 | [22 - Swagger Documentation](22SpringBootSwaggerDocumentation/README.md) | Generate interactive API documentation for REST endpoints. |
| 24 | [23 - Spring Boot Actuator](23SpringBootActuator/README.md) | Expose operational endpoints to observe application health and runtime details. |
| 25 | [24 - Static And Dynamic Filtering](24SpringBootStaticAndDynamicFilter/README.md) | Control which fields are returned in REST responses. |
| 26 | [25 - Spring Boot Versioning](25SpringBootVersioning/README.md) | Support multiple API versions without breaking old clients. |
| 27 | [26 - Declarative Transaction Management](26SpringBootDeclarative-Transaction-Management/README.md) | Keep related database changes atomic using declarative transactions. |
| 28 | [27 - Transaction Propagation](27SpringBootDeclarative-Transaction-Propagation/README.md) | Understand how nested service calls behave when each method has transaction rules. |
| 29 | [28 - Transaction Rollback](28SpringBootDeclarative-Transaction-Rollback/README.md) | Control when Spring should roll back database work after exceptions. |
| 30 | [29 - Export Data To CSV](29Spring-Boot-Export-Data-to-CSV/README.md) | Export database records to a CSV file from a Spring Boot application. |
| 31 | [29 - Spring Security Basic Authentication](29SpringBootSeciryBasicAuthentication/README.md) | Protect an endpoint using HTTP Basic authentication. |
| 32 | [30 - Spring Security Form Based Authentication](30SpringBootSeciryFormBasedAuthentication/README.md) | Protect a browser page using form login and a success page. |

## Recommended Learning Order

Follow the numbered folder order from `01HelloWorld` to `30SpringBootSeciryFormBasedAuthentication`.
Each chapter adds a new Spring Boot concept and prepares the next chapter.

## How To Run

Each chapter is an independent Maven project.
Open the chapter folder you want to practice and run:

```bash
mvn spring-boot:run
```

Some chapters need Oracle, MySQL, H2, or a browser login flow.
Check the chapter README and src/main/resources/application.properties before running.

## Key Interview Keywords

| Area | Keywords |
| --- | --- |
| Core Spring Boot | Auto-configuration, starter dependency, embedded Tomcat, application.properties, profiles |
| REST API | @RestController, @GetMapping, @PostMapping, @PathVariable, @RequestBody, ResponseEntity |
| Data Access | DataSource, JdbcTemplate, DAO, RowMapper, JPA, Repository, H2, Oracle, MySQL |
| Web MVC | Controller, ViewResolver, JSP, ModelAndView, context path |
| API Quality | Validation, exception handling, HATEOAS, Swagger/OpenAPI, versioning |
| Runtime | Actuator, scheduling, async, thread pool, cache |
| Web Pipeline | Servlet Filter, Spring MVC Interceptor, request lifecycle |
| Transactions | @Transactional, propagation, rollback, ACID |
| Security | Basic authentication, form login, SecurityFilterChain, Authorization header, session |

## Key Points Or Common Mistakes

- Run only one chapter at a time if multiple chapters use the same port.
- Always check server.port and server.servlet.context-path before testing a URL.
- Replace demo database credentials with local values before running database chapters.
- Do not commit real secrets, production passwords, or private environment values.
- Keep controllers small; use service, DAO, and repository layers for real work.

## Chapter Summary And Next Step

This root README gives the full learning map for the Spring Boot workspace.
Start with chapter 01, continue in order, and use the interview questions at the end of each chapter for revision.
After the final chapter, build one small project that combines REST, validation, database access, transactions, actuator, and security.

## Common Interview Questions And Short Answers

**Q1. What is Spring Boot?**  Spring Boot is a framework that helps create Spring applications quickly with auto-configuration and embedded servers.

**Q2. What is auto-configuration?**  It configures common Spring beans based on dependencies, properties, and classpath conditions.

**Q3. What is the difference between @Controller and @RestController?**  @Controller usually returns views, while @RestController returns response data directly.

**Q4. What is application.properties used for?**  It stores configuration such as port, context path, datasource, logging, and management settings.

**Q5. What is the role of the service layer?**  It keeps business logic separate from controllers and repositories.

**Q6. What is Spring Data JPA?**  It simplifies database access by generating repository implementations for entity operations.

**Q7. What is Actuator?**  Actuator exposes operational endpoints such as health, metrics, and environment details.

**Q8. What should you avoid in real projects?**  Avoid hard-coded secrets, oversized controllers, unclear API contracts, and missing validation.



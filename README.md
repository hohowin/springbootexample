# Getting Started

- Youtube: [Spring Boot Tutorial | Full Course [2021] [NEW]](https://youtu.be/9SGDpanrc8U)
- Validation: [Validation in Spring Boot](https://www.baeldung.com/spring-boot-bean-validation)

## For Development

```bash
# Spin up postgres
docker-compose -f dev.yaml up -d
# Connect to postgres
psql -h localhost -p 5432 -U postgres
\q
```

## For Production

```bash
docker-compose -f prd.yaml up -d
```

## To run rest API

see `src/main/java/com/example/demo/student/StudentController.java`
Example: http://localhost:8080/myapp/api/v1/student (with context path configured in application properties)

For Post, can put the following:

```json
{
  "id": 3,
  "name": "Peter Parker",
  "dob": "2004-01-05",
  "age": 16,
  "email": "p.parker@dailybugle.com"
}
```

## Configure Swagger

- [Setting Up Swagger 2 with a Spring REST API Using Springfox](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)
- [Failed to start bean 'documentationPluginsBootstrapper' in spring data rest](https://stackoverflow.com/questions/40241843/failed-to-start-bean-documentationpluginsbootstrapper-in-spring-data-rest)
- [Spring Boot Change Context Path](https://www.baeldung.com/spring-boot-context-path)

To see JSON, run: http://localhost:8080/myapp/v2/api-docs
To see Swagger UI, run: http://localhost:8080/myapp/swagger-ui/


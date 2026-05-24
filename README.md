# AutoBuild AI

Sistema desenvolvido em Spring Boot para simular montagem de carros personalizados utilizando arquitetura orientada a serviços (SOA).

## Tecnologias
- Java 21
- Spring Boot
- MySQL
- Swagger OpenAPI
- Postman

## Como executar

1. Criar banco MySQL:
```sql
CREATE DATABASE autobuild;
```

2. Configurar usuário e senha no application.properties

3. Rodar o projeto:
```bash
mvn spring-boot:run
```

## Swagger
http://localhost:8080/swagger-ui.html

## Endpoints

### Parts
GET /parts
POST /parts
GET /parts/{id}
DELETE /parts/{id}

### Cars
GET /cars
POST /cars

### Prediction
POST /prediction

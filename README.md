# CICD-1 Lab 1 - Catalog Service

Catalog Service runs on port 8081.

## Endpoints

- GET /products
- POST /products

## Architecture

Browser / Swagger

+--> Catalog Service :8081 --> temporary Product List<>

+--> Order Service :8082 --> temporary Order List<>

The services are stored in separate GitHub repositories.

Order Service repository:
https://github.com/d4nv/cicd1-order-service

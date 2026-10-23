# Catalog Service – JPQL & JPA Relationships

Spring Boot catalog service using Spring Data JPA with an H2 file database (port 8081).

## What was added
- `Category` entity, and a `@ManyToOne` relationship from `Product` to `Category` (`category_id` foreign key)
- `CategoryRepository`
- JPQL queries in `ProductRepository`:
    - `findByMinPrice`: products with price >= a given value
    - `findByCategoryName`: products in a category, using `JOIN p.category c`
- `CreateProductRequest` DTO so POST takes a `categoryId`

## Endpoints
| Method | URL | Description |
|---|---|---|
| GET | `/products` | All products |
| GET | `/products/{id}` | One product (404 if not found) |
| POST | `/products` | Create a product: `{"name":"Laptop","price":999.99,"categoryId":1}` |
| GET | `/products/min-price?price=500` | Products with price >= 500 |
| GET | `/products/by-category?name=Electronics` | Products in a category |

## Testing
1. Run the app, then open `http://localhost:8081/h2-console` (JDBC URL `jdbc:h2:file:./data/catalogdb`, user `sa`).
2. Insert a category: `INSERT INTO category (name) VALUES ('Electronics');`
3. Add products and call the endpoints above. The min-price and by-category endpoints return only the matching products, with their category included.
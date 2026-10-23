package ie.atu.cicd1.catalog.cicd1catalogservice.model;

import java.math.BigDecimal;

public record CreateProductRequest(String name, BigDecimal price, Long categoryId) {
}
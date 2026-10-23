package ie.atu.cicd1.catalog.cicd1catalogservice.controller;

import ie.atu.cicd1.catalog.cicd1catalogservice.model.Product;
import ie.atu.cicd1.catalog.cicd1catalogservice.service.ProductService;
import org.springframework.web.bind.annotation.*;
import ie.atu.cicd1.catalog.cicd1catalogservice.model.CreateProductRequest;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody CreateProductRequest request) {
        return productService.create(request);
    }

    @GetMapping("/min-price")
    public List<Product> getByMinPrice(@RequestParam BigDecimal price) {
        return productService.getByMinPrice(price);
    }

    @GetMapping("/by-category")
    public List<Product> getByCategory(@RequestParam String name) {
        return productService.getByCategory(name);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }
}
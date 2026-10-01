package ie.atu.cicd1.catalog.cicd1catalogservice.service;

import ie.atu.cicd1.catalog.cicd1catalogservice.model.Product;
import ie.atu.cicd1.catalog.cicd1catalogservice.model.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }
}
